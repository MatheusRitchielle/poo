package br.com.residencia.poo.pessoas;

import br.com.residencia.poo.contas.Conta;

public abstract class Pessoa extends Conta {

	protected String tipoPessoa;
	protected Integer id;
	protected String nome;
	protected String cpf;
	protected String senha;

	public Pessoa() {
		super();

	}

	//Contrutor Conta	
	public Pessoa(String tipoConta, Integer numeroAgencia, Integer numeroConta, Double saldo, String cpf) {
	}

	public String getSenha() {
		return senha;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
