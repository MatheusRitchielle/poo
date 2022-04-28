package br.com.residencia.poo.pessoas;

public class Gerente extends Funcionario {

	protected int idAgencia;
	String cpf;
	String senha;
	public Gerente() {
		super();
	}

	public Gerente(String cpf, String senha) {
		super(cpf, senha);
		this.cpf = cpf;
		this.senha = senha;
	}


	public int getIdAgencia() {
		return idAgencia;
	}

}
