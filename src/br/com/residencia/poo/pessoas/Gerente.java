package br.com.residencia.poo.pessoas;

import java.util.ArrayList;

public class Gerente extends Funcionario {
	


	public Gerente(Integer id, String nome, String cpf, String senha) {
		super(id, nome, cpf, senha);
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
	
	}

	protected byte idAgencia;
	ArrayList<String> gerentes = new ArrayList<String>();
	

	
	public int getIdAgencia() {
		return idAgencia;
	}


}

	