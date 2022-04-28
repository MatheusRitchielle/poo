package br.com.residencia.poo.pessoas;

import br.com.residencia.poo.bancodados.Cadastro;

//import java.util.concurrent.atomic.AtomicInteger;

import br.com.residencia.poo.contas.Conta;

public abstract class Pessoa extends Conta{
	
	protected Integer id;
	protected String nome;
	protected String cpf;
	protected String senha;
	protected Integer idade;
	protected String telefone;
	protected String endereco;
	protected String email;
	protected String dataNascimento;
	protected String tipoPessoa;

	public Pessoa() {
		super();
	}
	
	//Contrutor Conta	
	public Pessoa(String cpf, String senha) {
		super(cpf, senha);
		
		
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
