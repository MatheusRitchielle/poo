package br.com.residencia.poo.contas;

import java.sql.Date;


public class ContaCorrente extends Conta {

		
	Integer idConteCorrente;
	Double chequeEspecial;
	Double taxa;
	
	public Integer getIdConteCorrente() {
		return idConteCorrente;
	}
	public void setIdConteCorrente(Integer idConteCorrente) {
		this.idConteCorrente = idConteCorrente;
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
