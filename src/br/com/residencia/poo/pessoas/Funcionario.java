package br.com.residencia.poo.pessoas;

public abstract class Funcionario extends Pessoa {

	protected int idusuario;
	protected String login;
	protected String senha;
	protected double salario;

	public Funcionario(String cpf, String senha) {
		super(cpf, senha);
		this.cpf = cpf;
		this.senha = senha;
	}

	public Funcionario() {
		super();
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return getCpf();
	}

}
