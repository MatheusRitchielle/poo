package br.com.residencia.poo.contas;

import br.com.residencia.poo.menu.MenuContas;

public class ContaCorrente extends Conta implements Movimentacao, Tarifa {

	MenuContas menucontas = new MenuContas();

	
	private int totalSaques;
	private int totalDepositos;
	private int totalTransferencias;
	private double totalTarifado;


	public ContaCorrente() {
	}
	
	public ContaCorrente(String tipoConta, int numeroAgencia, int numeroConta, double saldo, String cpf) {
		super(tipoConta, numeroAgencia, numeroConta, saldo, cpf);
	}

	@Override
	public void depositar(double valorDepositado) throws ContaException {

		if (valorDepositado < 0) {
			throw new ContaException("Valor inv�lido. Tente novamente!");

		} else {

			Double saldo = getSaldo();
			saldo = (saldo - Tarifa.DEPOSITO) + valorDepositado;

			System.out.println("\nOpera��o realizada com sucesso!");
			System.out.printf("\nValor depositado: R$%.2f", valorDepositado);
			System.out.printf("\nTarifa para dep�sito: R$%.2f", Tarifa.DEPOSITO);
			System.out.printf("\nSaldo atual: R$%.2f", saldo);
			++totalSaques;
			menucontas.mostrarMenuCC();
		}
	}

	@Override
	public void sacar(double valorSacado) throws ContaException {

		if (valorSacado <= 0) {
			throw new ContaException("Valor inv�lido. Tente novamente!");

		} else {
			double valorTarifado = Tarifa.SAQUE;
			Double saldo = getSaldo();

			if (saldo - valorSacado - valorTarifado >= 0) {
				valorTarifado = Tarifa.SAQUE;
				saldo = saldo - Tarifa.SAQUE - valorSacado;
				System.out.println("\nOpera��o realizada com sucesso!");
				System.out.printf("\nValor sacado: R$%.2f", valorSacado);
				System.out.printf("\nTarifa para saque: R$%.2f", Tarifa.SAQUE);
				System.out.printf("\nSaldo atual: R$%.2f ", saldo);
				++totalDepositos;
				menucontas.mostrarMenuCC();

			} else {
				System.out.println("Valor inv�lido. Tente novamente!");
				sacar(valorSacado);
			}
		}
	}

	@Override
	public void transferir(double valorTransferido) throws ContaException {

		if (valorTransferido <= 0) {
			throw new ContaException("Valor inv�lido. Tente novamente!");

		} else {
			double valorTarifado = Tarifa.TRANSFERENCIA;
			Double saldo = getSaldo();

			if (this.saldo - valorTransferido - Tarifa.TRANSFERENCIA >= 0) {
				valorTarifado = Tarifa.TRANSFERENCIA;
				saldo = saldo - valorTarifado - valorTransferido;
				System.out.println("\nOpera��o realizada com sucesso!");
				System.out.printf("\nValor transferido: R$%.2f", valorTransferido);
				System.out.printf("\nTarifa para transfer�ncia: R$%.2f", valorTarifado);
				System.out.printf("\nSaldo atual: R$%.2f", saldo);
				++totalTransferencias;
				menucontas.mostrarMenuCC();

			} else {
				System.out.println("Valor inv�lido. Tente novamente!");
				menucontas.mostrarMenuCC();
			}
		}
	}

	@Override
	public double tarifarSaque(double valorSacado) {
		return 0;
	}

	@Override
	public double tarifarDeposito(double valorDepositado) {
		return 0;
	}

	@Override
	public double tarifarTransferencia(double valorTransferido) {
		return 0;
	}

	@Override
	public double jurosRendimento(double rendimentoConta) {
		return 0;
	}

	@Override
	public String toString() {
		return "Conta Corrente\tN�mero da Ag�ncia = " + this.numeroAgencia + "\tN�mero da Conta = " + this.numeroConta
				+ "\tSaldo = " + this.saldo + "\tCPF = " + this.cpf + "\n";
	}

}
