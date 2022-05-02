package br.com.residencia.poo.contas;

import br.com.residencia.poo.menu.MenuContas;

//import java.sql.Date;

public class ContaPoupanca extends Conta implements Movimentacao {

	MenuContas menucontas = new MenuContas();
	protected double rentabilidade = 0.06;
	protected int qtdDias = 0;
	protected double valorDepositado;
	
	public ContaPoupanca() {		
	}

	public ContaPoupanca(String tipoConta, int numeroAgencia, int numeroConta, double saldo, String cpf) {
		super(tipoConta, numeroAgencia, numeroConta, saldo, cpf);
		this.tipoConta = tipoConta;
		this.numeroAgencia= numeroAgencia;
		this.numeroConta= numeroConta;
		this.saldo = saldo;
		this.cpf = cpf;
	}

	public int getQtdDias() {
		return qtdDias;
	}

	public void render(double rendimentoConta, int qtdDias) throws ContaException {
		Double aporte = rendimentoConta;
		rendimentoConta = (rendimentoConta * Tarifa.RENDIMENTO) * qtdDias;
		Double saldoFinal =  aporte  + rendimentoConta;
		System.out.println("Seu dinheiro vai render: R$" + rendimentoConta + "\nEm um per�odo de: " + qtdDias + " dias.");
		System.out.printf("\nSaldo no fim do per�odo: R$%.2f", saldoFinal);
		menucontas.menuCP();

	}
	

	@Override
	public void depositar(double valorDepositado) throws ContaException {

		if (valorDepositado < 0) {
			throw new ContaException("O valor digitado para saque � inv�lido!");

		} else {
			Double saldo = getSaldo();

			if (valorDepositado >= 0) {
				saldo = saldo + valorDepositado;
				System.out.println("\nOpera��o realizada com sucesso!");
				System.out.printf("\nValor depositado: R$%.2f", valorDepositado);
				System.out.printf("\nSaldo atual: R$%.2f", saldo);
				menucontas.menuCP();

			} else {
				System.out.println("Valor inv�lido. Tente novamente!");
				menucontas.menuCP();
			}
		}
	}

	@Override
	public void sacar(double valorSacado) throws ContaException {

		if (valorSacado < 0) {
			throw new ContaException("O valor digitado para saque � inv�lido!");

		} else {
			Double saldo = getSaldo();
			if (saldo >= valorSacado) {
				saldo = saldo - valorSacado;
				System.out.println("\nOpera��o realizada com sucesso!");
				System.out.printf("\nValor sacado: R$%.2f", valorSacado);
				System.out.printf("\nSaldo atual: R$%.2f", saldo);
				menucontas.menuCP();

				
			} else {
				System.out.println("Valor inv�lido. Tente novamente!");
				menucontas.menuCP();
			}
		}
	}

	@Override
	public void transferir(double valorTransferido) throws ContaException {

		if (valorTransferido <= 0) {
			throw new ContaException("Valor inv�lido. Tente novamente!");

		} else {
			Double saldo = getSaldo();
			if (saldo - valorTransferido >= 0) {
				saldo = saldo - valorTransferido;
				System.out.println("\nOpera��o realizada com sucesso!");
				System.out.printf("\nValor transferido: R$%.2f", valorTransferido);
				System.out.printf("\nSaldo atual: R$%.2f", saldo);
				menucontas.menuCP();

			} else {
				System.out.println("Valor inv�lido. Tente novamente!");
				menucontas.menuCP();
			}
		}
	}
	@Override
	public String toString() {
		return "Conta Poupan�a\tN�mero da Ag�ncia = " + this.numeroAgencia + "\tN�mero da Conta = "
				+ this.numeroConta + "\tSaldo = " + this.saldo + "\tCPF = " + this.cpf + "\n";
	}

	@Override
	public void sacar(double valorSacado, Conta conta) throws ContaException {
		// TODO Auto-generated method stub
		
	}

}