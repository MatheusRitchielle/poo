package br.com.residencia.poo.pessoas;

public class Funcionario extends Pessoa {

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

//private static final AtomicInteger count = new AtomicInteger(0);
//@Override
//public String toString() {
//		StringBuilder sb = new StringBuilder();
//		return sb.append("ID: ".concat(String.valueOf(this.idusuario)))
//				.append("\nLogin: ".concat(this.login))
//				.append("\nSenha: ".concat(this.senha))
//				.append("\nSalário: ".concat(String.valueOf(this.salario)))
//				.append("\nCargo: ".concat(this.cargo));
//}