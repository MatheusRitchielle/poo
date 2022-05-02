package br.com.residencia.poo.pessoas;

import br.com.residencia.poo.contas.Conta;

public abstract class Pessoa extends Conta {

	protected String tipoPessoa;
	protected String nome;
	protected String cpf;
	protected String senha;

	public Pessoa() {
	}

	
	@Override
	public String toString() {
		return "Pessoa [tipoPessoa=" + tipoPessoa + ", nome=" + nome + ", cpf=" + cpf + ", senha=" + senha + "]";
	}


	public Pessoa(String tipoConta, int numeroAgencia, int numeroConta, double saldo, String cpf) {
		super(tipoConta, numeroAgencia, numeroConta, saldo, cpf);
	}

	public Pessoa(String tipoPessoa, String nome, String cpf, String senha) {
		super();
		this.tipoPessoa = tipoPessoa;
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

	public String getNome() {
		return nome;
	}
	
	public String getTipoConta() {
		return tipoConta;
	}
	
	public void getTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}
