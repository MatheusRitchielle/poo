package br.com.residencia.poo.pessoas;

import java.sql.Date;
import java.util.concurrent.atomic.AtomicInteger;

import br.com.residencia.poo.contas.Conta;

public class Pessoa extends Conta {

	private static final AtomicInteger count = new AtomicInteger(0);
	
	protected Integer id;
	protected String nome;
	protected String cpf;
	protected String senha;
//	protected int idade;
//	protected String genero;
//	protected String estadoCivil;
//	protected String telefone;
//	protected String endereco;
//	protected String email;
//	protected Date dataNascimento;
//	protected String tipoPessoa;

	public Pessoa(Integer id, String nome, String cpf, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
	}



	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
