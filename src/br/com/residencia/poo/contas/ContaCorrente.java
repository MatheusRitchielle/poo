package br.com.residencia.poo.contas;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ContaCorrente extends Conta {

	Integer idContaCorrente;
	Double chequeEspecial;
	Double taxaDS;
	Double taxaT;

	private List<Conta> CC = new ArrayList<>();

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(int idAgencia, int numeroAgencia, int idDiretor, String endereco) {
		super(idAgencia, numeroAgencia, idDiretor, endereco);
		
	}

	public ContaCorrente(int id, String login, int numeroAgencia, String tipoConta, int numeroConta, Date dataAberta,
			boolean status, String senha) {
		super(id, login, numeroAgencia, tipoConta, numeroConta, dataAberta, status, senha);
	}


	public Integer getIdContaCorrente() {
		return idContaCorrente;
	}

	public Double getTaxaDS() {
		return taxaDS = 0.10;
	}

	public Double getTaxaT() {
		return taxaT = 0.20;
	}
	
	

}
