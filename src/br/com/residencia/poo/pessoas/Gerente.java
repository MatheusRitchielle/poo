package br.com.residencia.poo.pessoas;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Gerente extends Funcionario {
	private static final AtomicInteger count = new AtomicInteger(0); 
	protected int idGerente;
	protected byte idAgencia;
	protected String login;
	protected String senha;
	
	
	//Construtor
	public Gerente(String login, String senha) {
		super(login, senha);
		this.login = login;
		this.senha = senha;

	} 
	//Autenticação login Gerente
	public boolean autenticar(String senha, String login) {
		if (this.senha == senha && this.login == login) {
			System.out.println("Acesso permitido!");
			return true;
		} else {
			System.out.println("Acesso negado!");
			return false;
		}
	}
	
	
}
