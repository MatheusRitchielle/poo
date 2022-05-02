package br.com.residencia.poo.contas;

import java.io.IOException;

import br.com.residencia.poo.menu.Menu;
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
		this.tipoConta = tipoConta;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.cpf = cpf;
	}

	@Override
	public void depositar(double valorDepositado) throws ContaException {

		if (valorDepositado > 0) {
			setSaldo(getSaldo() + valorDepositado - Tarifa.DEPOSITO);
			System.out.println("\nOperação realizada com sucesso!");
			System.out.printf("\nValor depositado: R$%.2f", valorDepositado);
			System.out.printf("\nTarifa para depósito: R$%.2f", Tarifa.DEPOSITO);
			System.out.printf("\nSaldo atual: R$%.2f", saldo);
			++totalSaques;

		} else {
			System.out.print("Valor para depósito inválido.\nRedirecionando...");
		}
	}

	@Override
	public void sacar(double valorSacado, Conta conta) throws ContaException {

		if (valorSacado < conta.getSaldo()) {

			conta.setSaldo(conta.getSaldo() - valorSacado - Tarifa.SAQUE);

			System.out.println("\n\nOperação realizada com sucesso!");
			System.out.printf("\n\nValor sacado: R$%.2f", valorSacado);
			System.out.printf("\nTarifa para saque : R$%.2f", Tarifa.SAQUE);

		} else {
			System.out.println("Valor inválido. Tente novamente!");
			sacar(valorSacado);
		}
	}

	public void transferir(double valorTransferido) throws ContaException {

		if (valorTransferido <=0 || valorTransferido > getSaldo()) {
			System.out.print("\n\n\tValor inválido.\n\n\tRedirecionando...");
		}
		if (valorTransferido <= getSaldo()) {
			double valorTarifado = Tarifa.TRANSFERENCIA;
			setSaldo(getSaldo() - valorTransferido - Tarifa.TRANSFERENCIA);
			System.out.println("\nOperação realizada com sucesso!");
			System.out.printf("\nValor transferido: R$%.2f", valorTransferido);
			System.out.printf("\nTaxa para transferência: R$%.2f", valorTarifado);
	

		}
	}

	public MenuContas getMenucontas() {
		return menucontas;
	}

	public void setMenucontas(MenuContas menucontas) {
		this.menucontas = menucontas;
	}

	public int getTotalSaques() {
		return totalSaques;
	}

	public void setTotalSaques(int totalSaques) {
		this.totalSaques = totalSaques;
	}

	public int getTotalDepositos() {
		return totalDepositos;
	}

	public void setTotalDepositos(int totalDepositos) {
		this.totalDepositos = totalDepositos;
	}

	public int getTotalTransferencias() {
		return totalTransferencias;
	}

	public void setTotalTransferencias(int totalTransferencias) {
		this.totalTransferencias = totalTransferencias;
	}

	public double getTotalTarifado() {
		return totalTarifado;
	}

	public void setTotalTarifado(double totalTarifado) {
		this.totalTarifado = totalTarifado;
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
		return "Conta Corrente\tNúmero da Agência = " + this.numeroAgencia + "\tNúmero da Conta = " + this.numeroConta
				+ "\tSaldo = " + this.saldo + "\tCPF = " + this.cpf + "\n";
	}

	@Override
	public void sacar(double valorSacado) throws ContaException {

		if (valorSacado < getSaldo()) {

			setSaldo((getSaldo() - valorSacado));

			System.out.println("\n\nOperação realizada com sucesso!");
			System.out.printf("\n\nValor sacado: R$%.2f", valorSacado);
			System.out.printf("\nTarifa para saque : R$%.2f", Tarifa.SAQUE);
			System.out.printf("\nSaldo atual: R$%.2f ", getSaldo());
			++totalDepositos;

		} else {
			System.out.println("Valor inválido. Tente novamente!");
			sacar(valorSacado);
		}

	}

}
