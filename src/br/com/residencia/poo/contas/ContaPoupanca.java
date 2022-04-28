package br.com.residencia.poo.contas;

import java.sql.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class ContaPoupanca extends Conta {
	
	//private static final AtomicInteger count = new AtomicInteger(0); 
	protected int idContaPoupanca;
	protected double rentabilidade = 0.06;

	public ContaPoupanca() {super();}


	public ContaPoupanca(int idContaPoupanca, double rentabilidade) {
		super();
		this.idContaPoupanca = idContaPoupanca;
		this.rentabilidade = rentabilidade;
	}

	public ContaPoupanca(int idAgencia, int numeroAgencia, int idDiretor, String endereco) {
		super(idAgencia, numeroAgencia, idDiretor, endereco);
	}

	public ContaPoupanca(int id, String login, int numeroAgencia, String tipoConta, int numeroConta, Date dataAberta,
			boolean status, String senha) {
		super(id, login, numeroAgencia, tipoConta, numeroConta, dataAberta, status, senha);
		
	}

	public double getRentabilidade() {
		return rentabilidade;
	}	
	
	
}
