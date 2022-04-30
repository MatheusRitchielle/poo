package br.com.residencia.poo.pessoas;

public abstract class Funcionario extends Pessoa {

	protected String login;
	protected String senha;
	protected double salario;

	public Funcionario() {
	}
	public Funcionario( String login, String senha, double salario) {
		super();
		this.login = login;
		this.senha = senha;
		this.salario = salario;
	}

	public Funcionario(String tipoConta, int numeroAgencia, int numeroConta, double saldo, String cpf) {
		super(tipoConta, numeroAgencia, numeroConta, saldo, cpf);

	}

	public Funcionario(String tipoPessoa, String nome, String cpf, String senha) {
		super(tipoPessoa,  nome, cpf, senha);
	}

	public Funcionario(String tipoConta, String nome, String cpf, String senha2, int numeroAgencia, int numeroConta,double saldo) {
		
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
