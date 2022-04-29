package br.com.residencia.poo.contas;

import br.com.residencia.poo.menu.MenuContas;

//import java.sql.Date;

public class ContaPoupanca extends Conta implements Movimentacao {
	MenuContas menucontas = new MenuContas();
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

			System.out.println("Sua conta rendeu: R$" + rendimentoConta + "em um per�odo de: " + qtdDias + "dias.");

		} else {

			System.out.println("Voc� n�o possui saldo para rendimentos.");

		}
	}

	@Override
	public void depositar(double valorDepositado) throws ContaException {

		if (valorDepositado < 0) {

			throw new ContaException("O valor digitado para saque � inv�lido!");

		} else {

			if (valorDepositado >= 0) {

				this.saldo += valorDepositado;

				System.out.println("\nOpera��o realizada com sucesso!");
				System.out.printf("Valor depositado: R$%.2f", valorDepositado);
				System.out.printf("Saldo atual: R$%.2f", this.saldo);

				++totalDepositos;
				menucontas.mostrarMenuCP();

			} else {
				System.out.println("Valor inv�lido. Tente novamente!");
				menucontas.mostrarMenuCP();
			}
		}
	}

	@Override
	public void sacar(double valorSacado) throws ContaException {

		if (valorSacado < 0) {

			throw new ContaException("O valor digitado para saque � inv�lido!");

		} else {

			if (this.saldo >= valorSacado) {

				this.saldo -= valorSacado;

				System.out.println("\nOpera��o realizada com sucesso!");
				System.out.printf("\nValor sacado: R$%.2f", valorSacado);
				System.out.printf("\nSaldo atual: R$%.2f", this.saldo);

				++totalSaques;
				menucontas.mostrarMenuCP();

			} else {
				System.out.println("Valor inv�lido. Tente novamente!");
				menucontas.mostrarMenuCP();
			}
		}
	}

	@Override
	public void transferir(double valorTransferido) throws ContaException {

		if (valorTransferido <= 0) {

			throw new ContaException("Valor inv�lido. Tente novamente!");

		} else {

			if (this.saldo - valorTransferido >= 0) {

				System.out.println("\nOpera��o realizada com sucesso!");
				System.out.printf("\nValor transferido: R$%.2f", valorTransferido);
				System.out.printf("\nSaldo atual: R$%.2f", this.saldo);

				++totalTransferencias;
				menucontas.mostrarMenuCP();

			} else {
				System.out.println("Valor inv�lido. Tente novamente!");
				menucontas.mostrarMenuCP();
			}
		}
	}
}