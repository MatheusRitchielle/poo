package br.com.residencia.poo.pessoas;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class  Funcionario extends Pessoa {
	private static final AtomicInteger count = new AtomicInteger(0);
	protected String login;
	protected String senha;
	protected String cargo;
	protected int idusuario;
	protected double salario;
	protected double bonificacao;

	public Funcionario(String login, String senha)  {
		this.login = login;
		this.senha = senha;
	}
	
	public boolean autenticar(String senha, String login) {
		if (this.senha == senha && this.login == login) {
			System.out.println("Acesso permitido!");
			return true;
		} else {
			System.out.println("Acesso negado!");
			return false;
		}
	}
	
	@Override
	public String toString() {
			StringBuilder sb = new StringBuilder();
			return sb.append("\nLogin: ".concat(this.login))
					.append("\nSenha: ".concat(this.senha))
					.append("\nSalário: ".concat(String.valueOf(this.salario)))
					.append("\nCargo: ".concat(this.cargo)).toString();
	}

	public int getidUsuario() {
		return this.idusuario = count.incrementAndGet();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Double getSalario() {
		return salario;
	}

	public Double getBonificacao() {
		return bonificacao = salario * 0.15;

	}
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
