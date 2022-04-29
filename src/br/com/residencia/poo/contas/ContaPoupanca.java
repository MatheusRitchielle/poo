package br.com.residencia.poo.contas;

//import java.sql.Date;

public class ContaPoupanca extends Conta implements Movimentacao {

	protected int idContaPoupanca;
	protected double rentabilidade = 0.06;
	protected int qtdDias = 0;
	protected double valorDepositado;
	protected int totalDepositos, totalSaques, totalTransferencias;

	public ContaPoupanca() {
		super();
	}

	public int getIdContaPoupanca() {
		return idContaPoupanca;
	}

	public int getQtdDias() {
		return qtdDias;
	}

	public void render(double rendimentoConta, int qtdDias) {

		if (this.saldo > 0) {

			rendimentoConta += rentabilidade * this.getQtdDias();

			System.out.println("Sua conta rendeu: R$" + rendimentoConta + "em um período de: " + qtdDias + "dias.");

		} else {

			System.out.println("Você não possui saldo para rendimentos.");

		}
	}

	@Override
	public void depositar(double valorDepositado) throws ContaException {

		if (valorDepositado < 0) {
			
			throw new ContaException("O valor digitado para saque é inválido!");
			
		} else {
				
				if (valorDepositado >= 0) {
			
				this.saldo += valorDepositado;
				
				System.out.println("\nOperação realizada com sucesso!");
				System.out.printf("\nValor depositado: R$.2f%n", valorDepositado);
				System.out.printf("\nSaldo atual: R$.2f%n", this.saldo);
				
				++totalDepositos;
				
		
		} else {		
			System.out.println("Valor inválido. Tente novamente!");
		}
	}
}

	@Override
	public void sacar(double valorSacado) throws ContaException {

		if (valorSacado < 0) {
			
			throw new ContaException("O valor digitado para saque é inválido!");
		
		} else {
			
			if (this.saldo >= valorSacado) {
				
				this.saldo -= valorSacado;
			
				System.out.println("\nOperação realizada com sucesso!");
				System.out.printf("\nValor sacado: R$.2f%n", valorSacado);
				System.out.printf("\nSaldo atual: R$.2f%n", this.saldo);
				
				++totalSaques;
				
			} else {
				System.out.println("Valor inválido. Tente novamente!");
			}
		}
	}

	@Override
	public void transferir(double valorTransferido) throws ContaException {

		if (valorTransferido <= 0) {

			throw new ContaException("Valor inválido. Tente novamente!");

		} else {

			if (this.saldo - valorTransferido >= 0) {

				System.out.println("\nOperação realizada com sucesso!");
				System.out.printf("\nValor transferido: R$.2f%n", valorTransferido);
				System.out.printf("\nSaldo atual: R$.2f%n", this.saldo);

				++totalTransferencias;

			} else {
				System.out.println("Valor inválido. Tente novamente!");
			}
		}
	}
}