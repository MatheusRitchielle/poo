package br.com.residencia.poo.pessoas;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Funcionario extends Pessoa {
	private static final AtomicInteger count = new AtomicInteger(0);
	protected int idusuario;
	protected String login;
	protected String senha;
	protected double salario;
	protected String cargo;

	public Funcionario(Integer id, String nome, String cpf, String senha) {
		super(id, nome, cpf, senha);
		
		this.idusuario = id;
		this.nome = nome;
		this.login = cpf;
		this.senha = senha;
	}

	@Override
	public String toString() {
			StringBuilder sb = new StringBuilder();
			return sb.append("ID: ".concat(String.valueOf(this.idusuario)))
					.append("\nLogin: ".concat(this.login))
					.append("\nSenha: ".concat(this.senha))
					.append("\nSalário: ".concat(String.valueOf(this.salario)))
					.append("\nCargo: ".concat(this.cargo));
	}


	public int getId() {
		return this.id = count.incrementAndGet();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Double getSalario() {
		return salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
