package br.com.residencia.poo.pessoas;

import java.util.ArrayList;

public class Gerente extends Funcionario {
	
	protected byte idAgencia;
	ArrayList<String> gerentes = new ArrayList<String>();
	
	
	public Gerente(int id, String login, String senha, double salario, double bonificacao, String cargo) {
		super(id, login, senha, salario, bonificacao, cargo);
	
	}
	public Gerente() {
		
	}
	public byte getIdAgencia() {
		return idAgencia;
	}


}

	