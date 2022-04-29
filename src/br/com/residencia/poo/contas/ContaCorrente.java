package br.com.residencia.poo.contas;

import br.com.residencia.poo.menu.MenuContas;

public class ContaCorrente extends Conta implements Movimentacao, Tarifa {
	MenuContas menucontas = new MenuContas();
	Integer idContaCorrente;
	Double totalTarifado = 0.1d;
	int totalSaques, totalDepositos, totalTransferencias;
	
	public ContaCorrente() {
		super();

	}

	public ContaCorrente(Integer idContaCorrente, Double taxaDS, Double taxaT) {
		super();
		this.idContaCorrente = idContaCorrente;
	}


	@Override
	public void depositar(double valorDepositado) throws ContaException {

		if (valorDepositado < 0) {
			throw new ContaException("Valor inv�lido. Tente novamente!");
		} else {
			
			double valorTarifado = tarifarDeposito(valorDepositado);
			
			if (this.saldo - valorTarifado >= 0) {
				
				totalTarifado += Tarifa.DEPOSITO;
				saldo += valorDepositado - valorTarifado;
				
				//O PRINTF EST� LIMITANDO AS CASAS DECIMAIS
				
				System.out.println("\nOpera��o realizada com sucesso!");
				System.out.printf("\nValor depositado: R$%.2f", valorDepositado);
				System.out.printf("\nTarifa para dep�sito: R$%.2f", valorTarifado);
				System.out.printf("\nSaldo atual: R$%.2f", saldo);
				
				//ADICIONA O SAQUE PARA FUTURAMENTE GERAR RELAT�RIO
				
				++totalSaques;	
				menucontas.mostrarMenuCC();
			} else {
				System.out.println("Valor depositado n�o permitido. Verifique nossas tarifas!");
				menucontas.mostrarMenuCC();
			}
		}
	}
	
	@Override
	public void sacar (double valorSacado) throws ContaException {	
		
		if (valorSacado <= 0) {
			throw new ContaException("Valor inv�lido. Tente novamente!");
		} else {
			
			double valorTarifado = tarifarSaque(valorSacado);
			Double saldo = getSaldo();
			if (saldo - valorSacado - valorTarifado >= 0) {
				valorTarifado = Tarifa.SAQUE;
				saldo += valorTarifado - valorSacado;

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
			
			double valorTarifado = tarifarTransferencia(valorTransferido);
			
		if (this.saldo - valorTransferido - valorTarifado >= 0) {
			
			totalTarifado -= Tarifa.TRANSFERENCIA;
			saldo += valorTarifado - valorTransferido;
			
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


	public Integer getIdContaCorrente() {
		return idContaCorrente;
	}
}
