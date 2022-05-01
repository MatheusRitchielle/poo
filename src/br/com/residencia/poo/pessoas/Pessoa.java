package br.com.residencia.poo.pessoas;

import br.com.residencia.poo.contas.Conta;

public abstract class Pessoa extends Conta {

	protected String tipoPessoa;
	protected String nome;
	protected String cpf;
	protected String senha;

	public Pessoa() {

	}

	
	public String getSenha() {
		return senha;
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


	public String getTipoPessoa() {
		return tipoPessoa;
	}


	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}

	

}
