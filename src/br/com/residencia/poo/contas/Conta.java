package br.com.residencia.poo.contas;

//import java.sql.Date;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.Scanner;
//import java.util.concurrent.atomic.AtomicInteger;

import br.com.residencia.poo.agencias.Agencia;
import br.com.residencia.poo.bancodados.Cadastro;
import br.com.residencia.poo.pessoas.Pessoa;

public abstract class Conta {

	// private static final AtomicInteger count = new AtomicInteger(0);

	protected int id;
	protected String cpf;
	protected int idAgencia;
	public String tipoConta;
	protected int numeroConta;
	protected String dataAberta; // Era Date
	protected boolean status;
	protected double saldo;
	protected String senha;

	public Conta(String cpf, String senha) {
		super();
		this.cpf = cpf;
		this.senha = senha;
	}

	public Conta() {
		super();
	}

	public Conta(String cpf, int idAgencia, String tipoConta, int numeroConta, String dataAberta, boolean status,
			double saldo, String senha) {
		super();
		this.cpf = cpf;
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

}
