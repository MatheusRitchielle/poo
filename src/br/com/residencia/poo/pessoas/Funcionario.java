package br.com.residencia.poo.pessoas;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class  Funcionario extends Pessoa {
	private static final AtomicInteger count = new AtomicInteger(0);
	protected int idusuario;
	protected String login;
	protected String senha;
	protected double salario;
	protected double bonificacao;
	protected String cargo;
	public Funcionario() {
		
	}

	public Funcionario(int id, String login, String senha, double salario,
			double bonificacao, String cargo)  {
		this.idusuario = id;
		this.login = login;
		this.senha = senha;
		this.salario = salario;
		this.bonificacao = bonificacao;
		this.cargo = cargo;
	}

	@Override
	public String toString() {
			StringBuilder sb = new StringBuilder();
			return sb.append("ID: ".concat(String.valueOf(this.idusuario)))
					.append("\nLogin: ".concat(this.login))
					.append("\nSenha: ".concat(this.senha))
					.append("\nSalário: ".concat(String.valueOf(this.salario)))
					.append("\nCargo: ".concat(this.cargo))
					.append("\nBonificação: ".concat(String.valueOf(this.bonificacao))).toString();
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

	public Double getBonificacao() {
		return bonificacao = bonificacao * 0.15;

	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
