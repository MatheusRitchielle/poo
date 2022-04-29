package br.com.residencia.poo.contas;

import br.com.residencia.poo.menu.MenuContas;

public class ContaCorrente extends Conta implements Movimentacao, Tarifa {

	MenuContas menucontas = new MenuContas();
	
	private Integer totalSaques = 0;
	private Integer totalDepositos = 0;
	private Integer totalTransferencias = 0;
	private Double totalTarifado = 0.0;


	public ContaCorrente(String tipoConta, int numeroAgencia, int numeroConta, double saldo, String cpf) {
		this.tipoConta = tipoConta;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.cpf = cpf;
	}

	
	public ContaCorrente() {
	}

	@Override
	public void depositar(double valorDepositado) throws ContaException {

		if (valorDepositado < 0) {
			throw new ContaException("Valor inválido. Tente novamente!");

		} else {

			Double saldo = getSaldo();
			saldo = (saldo - Tarifa.DEPOSITO) + valorDepositado;

			System.out.println("\nOperação realizada com sucesso!");
			System.out.printf("\nValor depositado: R$%.2f", valorDepositado);
			System.out.printf("\nTarifa para depósito: R$%.2f", Tarifa.DEPOSITO);
			System.out.printf("\nSaldo atual: R$%.2f", saldo);
			++totalSaques;
			menucontas.mostrarMenuCC();
		}
	}

	@Override
	public void sacar(double valorSacado) throws ContaException {

		if (valorSacado <= 0) {
			throw new ContaException("Valor inválido. Tente novamente!");

		} else {
			double valorTarifado = Tarifa.SAQUE;
			Double saldo = getSaldo();

			if (saldo - valorSacado - valorTarifado >= 0) {
				valorTarifado = Tarifa.SAQUE;
				saldo = saldo - Tarifa.SAQUE - valorSacado;
				System.out.println("\nOperação realizada com sucesso!");
				System.out.printf("\nValor sacado: R$%.2f", valorSacado);
				System.out.printf("\nTarifa para saque: R$%.2f", Tarifa.SAQUE);
				System.out.printf("\nSaldo atual: R$%.2f ", saldo);
				++totalDepositos;
				menucontas.mostrarMenuCC();

			} else {
				System.out.println("Valor inválido. Tente novamente!");
				sacar(valorSacado);
			}
		}
	}

	@Override
	public void transferir(double valorTransferido) throws ContaException {

		if (valorTransferido <= 0) {
			throw new ContaException("Valor inválido. Tente novamente!");

		} else {
			double valorTarifado = Tarifa.TRANSFERENCIA;
			Double saldo = getSaldo();

			if (this.saldo - valorTransferido - Tarifa.TRANSFERENCIA >= 0) {
				valorTarifado = Tarifa.TRANSFERENCIA;
				saldo = saldo - valorTarifado - valorTransferido;
				System.out.println("\nOperação realizada com sucesso!");
				System.out.printf("\nValor transferido: R$%.2f", valorTransferido);
				System.out.printf("\nTarifa para transferência: R$%.2f", valorTarifado);
				System.out.printf("\nSaldo atual: R$%.2f", saldo);
				++totalTransferencias;
				menucontas.mostrarMenuCC();

			} else {
				System.out.println("Valor inválido. Tente novamente!");
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
		return "Conta Corrente\tNúmero da Agência = " + this.numeroAgencia + "\tNúmero da Conta = "
				+ this.numeroConta + "\tSaldo = " + this.saldo + "\tCPF = " + this.cpf + "\n";
	}

}
