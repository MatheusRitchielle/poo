package br.com.residencia.poo.pessoas;

import br.com.residencia.poo.contas.ContaException;

public class Diretor extends Funcionario {

	protected int idAgencia;
	String cpf;
	String senha;

	public Diretor() {
		super();
	}

	public Diretor(String tipoPessoa, String nome, String cpf, String senha, int numeroAgencia,int numeroConta, double saldo) {
	this.tipoPessoa=tipoPessoa;
	this.nome = nome;
	this.cpf = cpf;
	this.senha = senha;
	this.numeroAgencia = numeroAgencia;
	this.numeroConta = numeroConta;
	this.saldo = saldo;
	}


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getIdAgencia() {
		return idAgencia;
	}

	@Override
	public void depositar(double valorDepositado) throws ContaException {
	
		
	}

	@Override
	public void sacar(double valorSacado) throws ContaException {
	
		
	}

	@Override
	public void transferir(double valorTransferido) throws ContaException {
	
		
	}

}
//List<Agencia> agencias = new ArrayList<>();