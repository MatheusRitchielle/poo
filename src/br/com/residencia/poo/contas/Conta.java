package br.com.residencia.poo.contas;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import br.com.residencia.poo.agencias.Agencia;

public abstract class Conta extends Agencia {
	
	private static final AtomicInteger count = new AtomicInteger(0); 
	  
	protected int id;
	protected String login;
	protected int idAgencia;
	public String tipoConta;
	protected int numeroConta;
	protected Date dataAberta;
	protected boolean status;
	protected double saldo;
	protected String senha;
	
	public Conta() {
		super();
	}
	
	public int getId() {
  		return id = count.incrementAndGet();
  	} 
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String cpf) {
		this.login = cpf;
	}
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String correntePoupan) {
		this.tipoConta = correntePoupan;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public Date getDataAberta() {
		return dataAberta;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean trueFalse) {
		this.status = trueFalse;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	} 
}
