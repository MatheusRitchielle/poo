package br.com.residencia.poo.contas;

import java.io.IOException;

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
		return "Conta = " + this.tipoConta + "| Agência = " + this.numeroAgencia + "| Número da conta = "
				+ this.numeroConta + "|Saldo = " + this.saldo + "| CPF = " + this.cpf + "|";
	}

	public void sacar(double valorSacado, Conta conta) throws ContaException, IOException {
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

	public double setSaldo(double saldo) {
		return this.saldo = saldo;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
