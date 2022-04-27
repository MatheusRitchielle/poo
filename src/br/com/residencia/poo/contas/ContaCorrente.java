package br.com.residencia.poo.contas;

import java.sql.Date;


public class ContaCorrente extends Conta implements Movimentacao {
		
	Integer idConteCorrente;
	Double chequeEspecial;
	Double taxa;
	
	@Override
	public double depositar(double valorDepositado) {

		this.saldo += valorDepositado;
		return this.saldo - 0.10;
	}

	@Override
	public double sacar(double valorSacado) {

		if (this.saldo >= valorSacado + 0.10) {
			return this.saldo -= valorSacado - 0.10;
		} else {
			System.out.println("Não é possível sacar este valor.");
		}
	}

	@Override
	public double transferir(double valorTransferido, double ) {
		if (this.saldo >= valorTransferido + 0.20) {
			return this.saldo -= valorSacado - 0.20;
		} else {
			System.out.println("Não é possível depositar este valor.");
		}
	

		
		
	}

	public Integer getIdConteCorrente() {
		return idConteCorrente;
	}
	
	public Double getChequeEspecial() {
		return chequeEspecial;
	}
	
	public void setChequeEspecial(Double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	public Double getTaxa() {
		return taxa;
	}
	
	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

}
