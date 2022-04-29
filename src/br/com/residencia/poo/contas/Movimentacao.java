package br.com.residencia.poo.contas;

public interface Movimentacao {

	void depositar(double valorDepositado) throws ContaException;

	void sacar(double valorSacado) throws ContaException;

	void transferir(double valorTransferido) throws ContaException;	
	
}