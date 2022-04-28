package br.com.residencia.poo.pessoas;

import br.com.residencia.poo.contas.Conta;

public class Cliente extends Pessoa{

	Integer id;
	Integer idGerente;
	String cpf;
	String senha;
	
	
	public Cliente() {
		super();	
	}

	//Construtor Pessoa
	public Cliente(String cpf, String senha) {
		super(cpf, senha);
		this.cpf = cpf;
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Cliente [cpf=" + this.cpf + ", senha=" + this.senha + "]";
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
}
