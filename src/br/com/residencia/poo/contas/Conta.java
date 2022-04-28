package br.com.residencia.poo.contas;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import br.com.residencia.poo.agencias.Agencia;
import br.com.residencia.poo.enuns.TipoConta;

public abstract class Conta extends Agencia{
	
	//private static final AtomicInteger count = new AtomicInteger(0); 
	protected int id;
	protected String login;
	protected int numeroAgencia;
	protected String tipoConta;
	protected int numeroConta;
	protected Date dataAberta;
	protected boolean status;
	protected static double saldo;
	protected String senha;

	public Conta() {super();
		
	}

	public Conta(int idAgencia, int numeroAgencia, int idDiretor, String endereco) {
		super(idAgencia, numeroAgencia, idDiretor, endereco);
		
	}
	
	public Conta(int id, String login, int numeroAgencia, String tipoConta, int numeroConta, Date dataAberta,
			boolean status, String senha) {
		super();
		this.id = id;
		this.login = login;
		this.numeroAgencia = numeroAgencia;
		this.tipoConta = tipoConta;
		this.numeroConta = numeroConta;
		this.dataAberta = dataAberta;
		this.status = status;
		this.senha = senha;
	}

}
