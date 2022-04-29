package br.com.residencia.poo.contas;

public interface Tarifa {

	double SAQUE = 0.1d, DEPOSITO = 0.1d, TRANSFERENCIA = 0.2d, RENDIMENTO = 0.006d;
	
	double tarifarSaque(double valorSacado);
	
	double tarifarDeposito(double valorDepositado);
	
	double tarifarTransferencia(double valorTransferido);
	
	double jurosRendimento(double rendimentoConta);
}