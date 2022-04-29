package br.com.residencia.poo.contas;

//import java.sql.Date;
//import java.util.concurrent.atomic.AtomicInteger;

public class ContaPoupanca extends Conta {

//	private static final AtomicInteger count = new AtomicInteger(0); 

	protected int idContaPoupanca;
	protected double rentabilidade = 0.06;


	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(int idAgencia, int idDiretor, String endereco, int numeroAgencia) {
		super(idAgencia, idDiretor, endereco, numeroAgencia);
	}

	public ContaPoupanca(int id, String login, int idAgencia, String tipoConta, int numeroConta, String dataAberta,
			boolean status, double saldo, String senha) {
		super(id, login, idAgencia, tipoConta, numeroConta, dataAberta, status, saldo, senha);
	}
	
	@Override
	public void render(double rendimentoConta, int qtdDias) throws ContaException {

<<<<<<< Updated upstream
	public ContaPoupanca(int idContaPoupanca, double rentabilidade) {
		super();
		this.idContaPoupanca = idContaPoupanca;
		this.rentabilidade = rentabilidade;
	}

	public double getRentabilidade() {
		return rentabilidade;
	}

	public int getIdContaPoupanca() {
		return idContaPoupanca;
	}

}
=======
			Double aporte = rendimentoConta;
			rendimentoConta = (rendimentoConta * Tarifa.RENDIMENTO) * qtdDias;
			Double saldoFinal =  aporte  + rendimentoConta;
			System.out.println("Seu dinheiro vai render: R$" + rendimentoConta + "\nEm um período de: " + qtdDias + " dias.");
			System.out.printf("\nSaldo no fim do período: R$%.2f", saldoFinal);
			menucontas.mostrarMenuCP();

		}

	@Override
	public void depositar(double valorDepositado) throws ContaException {

		if (valorDepositado < 0) {
			throw new ContaException("O valor digitado para saque é inválido!");

		} else {
			Double saldo = getSaldo();

			if (valorDepositado >= 0) {
				saldo = saldo + valorDepositado;
				System.out.println("\nOperação realizada com sucesso!");
				System.out.printf("\nValor depositado: R$%.2f", valorDepositado);
				System.out.printf("\nSaldo atual: R$%.2f", saldo);
				++totalDepositos;
				menucontas.mostrarMenuCP();

			} else {
				System.out.println("Valor inválido. Tente novamente!");
				menucontas.mostrarMenuCP();
			}
		}
	}

	@Override
	public void sacar(double valorSacado) throws ContaException {

		if (valorSacado < 0) {
			throw new ContaException("O valor digitado para saque é inválido!");

		} else {
			Double saldo = getSaldo();
			if (saldo >= valorSacado) {
				saldo = saldo - valorSacado;
				System.out.println("\nOperação realizada com sucesso!");
				System.out.printf("\nValor sacado: R$%.2f", valorSacado);
				System.out.printf("\nSaldo atual: R$%.2f", saldo);
				++totalSaques;
				menucontas.mostrarMenuCP();

			} else {
				System.out.println("Valor inválido. Tente novamente!");
				menucontas.mostrarMenuCP();
			}
		}
	}

	@Override
	public void transferir(double valorTransferido) throws ContaException {

		if (valorTransferido <= 0) {
			throw new ContaException("Valor inválido. Tente novamente!");

		} else {
			Double saldo = getSaldo();
			if (saldo - valorTransferido >= 0) {
				saldo = saldo - valorTransferido;
				System.out.println("\nOperação realizada com sucesso!");
				System.out.printf("\nValor transferido: R$%.2f", valorTransferido);
				System.out.printf("\nSaldo atual: R$%.2f", saldo);
				++totalTransferencias;
				menucontas.mostrarMenuCP();

			} else {
				System.out.println("Valor inválido. Tente novamente!");
				menucontas.mostrarMenuCP();
			}
		}
	}
}
>>>>>>> Stashed changes
