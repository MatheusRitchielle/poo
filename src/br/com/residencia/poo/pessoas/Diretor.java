package br.com.residencia.poo.pessoas;

import java.util.ArrayList;
import java.util.List;

import br.com.residencia.poo.agencias.Agencia;

public class Diretor extends Funcionario{


	public Diretor(Integer id, String nome, String cpf, String senha) {
		super(id, nome, cpf, senha);
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
	}

	protected int idDiretor;
	protected int qtdAgencia;
	protected int idAgencia;
	
	List<Agencia> agencias = new ArrayList<>();


	public void setIdDiretor(Integer idDiretor) {
		this.idDiretor = idDiretor;
	}

	public Integer getQtdAgencia() {
		return qtdAgencia;
	}


	
}
