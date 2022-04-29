package br.com.residencia.poo.contas;

//import java.sql.Date;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.Scanner;
//import java.util.concurrent.atomic.AtomicInteger;

import br.com.residencia.poo.agencias.Agencia;

public abstract class Conta extends Agencia {

	// private static final AtomicInteger count = new AtomicInteger(0);

	protected int id;
	protected String login;
	protected int idAgencia;
	public String tipoConta;
	protected int numeroConta;
<<<<<<< Updated upstream
	protected  String dataAberta; //Era Date
=======
	protected String dataAberta;
>>>>>>> Stashed changes
	protected boolean status;
	protected double saldo;
	protected String senha;

	public Conta() {
		super();
	}

	public Conta(int idAgencia, int idDiretor, String endereco, int numeroAgencia) {
		super(idAgencia, idDiretor, endereco, numeroAgencia);
	}

	public Conta(int id, String login, int idAgencia, String tipoConta, int numeroConta, String dataAberta,
			boolean status, double saldo, String senha) {
		super();
		this.id = id;
		this.login = login;
		this.idAgencia = idAgencia;
		this.tipoConta = tipoConta;
		this.numeroConta = numeroConta;
		this.dataAberta = dataAberta;
		this.status = status;
		this.saldo = saldo;
		this.senha = senha;
	}

	public enum TipoConta {

		CORRENTE("Corrente"), POUPANCA("Poupança");

		private String descricao;

		TipoConta(String descricao) {
			this.descricao = descricao;
		}

		public String getDescricao() {
			return descricao;
		}
	}

	public double getSaldo() {
		return saldo;
	}

<<<<<<< Updated upstream
	@Override
	public String toString() {
		return "Saldo: R$" + saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getId() {
		return id;
	}

	public String getLogin() {
		return login;
	}

	public int getIdAgencia() {
		return idAgencia;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getDataAberta() {
		return dataAberta;
	}

	public boolean isStatus() {
		return status;
	}

	public String getSenha() {
		return senha;
=======
	public void render(double rendimentoConta, int qtdDias) throws ContaException {
		
>>>>>>> Stashed changes
	}

}
