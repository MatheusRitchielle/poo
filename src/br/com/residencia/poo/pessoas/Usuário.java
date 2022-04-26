package br.com.residencia.poo.pessoas;

import java.util.concurrent.atomic.AtomicInteger;

public class Usuário {
	
	private static final AtomicInteger count = new AtomicInteger(0); 
	protected Integer idUsuario;
	protected String login;
	protected String senha;
	
	public Usuário(Integer id, String login, String senha) {
		super();
		idUsuario = id;
		this.login = login;
		this.senha = senha;
	}
	public Integer getId() {
		return this.idUsuario = count.incrementAndGet();
	}

	public void setIdUsuário(Integer id) {
		idUsuario = id;
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
	
}
