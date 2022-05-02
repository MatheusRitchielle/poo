package br.com.residencia.poo.contas;

import java.util.HashMap;
import java.util.Map;

public abstract class Conta implements Movimentacao {

	
	protected String tipoConta;
	protected int numeroAgencia;
	protected int numeroConta;
	protected double saldo;
	protected String cpf;
	
	public Conta() {
	}

	public Conta(String tipoConta, int numeroAgencia, int numeroConta, double saldo, String cpf) {
		super();
		this.tipoConta = tipoConta;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.cpf = cpf;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return "Conta [tipoConta=" + this.tipoConta + ", numeroAgencia=" + this.numeroAgencia + ", numeroConta="
				+ this.numeroConta + ", saldo=" + this.saldo + ", cpf=" + this.cpf + "]";
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
}
