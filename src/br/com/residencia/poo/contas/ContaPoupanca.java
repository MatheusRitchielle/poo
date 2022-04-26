package br.com.residencia.poo.contas;

import java.sql.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class ContaPoupanca extends Conta {
	private static final AtomicInteger count = new AtomicInteger(0); 
	protected int idContaPoupanca;
	protected double valor;
	protected double rentabilidade = 0.50;
	
	public ContaPoupanca() {
		super();
	}


	public int getIdContaPoupanca() {
		return this.id = count.incrementAndGet();
	}

	public void setIdContaPoupanca(int idContaPoupanca) {
		this.idContaPoupanca = idContaPoupanca;
	}

	public double getValor() {
		return valor;
	}

	public double getRentabilidade() {
		return rentabilidade;
	}

	public void setRentabilidade(double rentabilidade) {
		this.rentabilidade = rentabilidade;
	}
	
	
}
