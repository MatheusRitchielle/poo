package br.com.residencia.poo.pessoas;

import br.com.residencia.poo.contas.Conta;

public abstract class Pessoa extends Conta{
	
	protected String tipoPessoa;
	protected Integer id;
	protected String nome;
	protected String cpf;
	protected String senha;

	public Pessoa() {
		super();
		}
	
	//Contrutor Conta	
	public Pessoa(String cpf, String senha) {
		super(cpf, senha);
		}
	//Construtor cliente	
	public Pessoa(String cpf, String senha, String tipoPessoa, Integer id, String nome, String cpf2, String senha2) {
		super(cpf, senha);
		this.tipoPessoa = tipoPessoa;
		this.id = id;
		this.nome = nome;
		cpf = cpf;
		senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public String getSenha() {
		return senha;
	}
	
	public enum TipoPessoa {

	    CLIENTE("Cliente"),
		GERENTE("Gerente"),
	    DIRETOR("Diretor"),
	    PRESIDENTE("Presidente");

	    private String descricao;

	    TipoPessoa(String descricao) {
	        this.descricao = descricao;
	    }

	    public String getDescricao() {
	        return descricao;
	    }
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}

	
}
