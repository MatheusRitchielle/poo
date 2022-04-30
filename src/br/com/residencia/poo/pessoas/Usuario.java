package br.com.residencia.poo.pessoas;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import br.com.residencia.poo.contas.ContaException;

public class Usuario extends Pessoa implements Comparable<Usuario> {


	protected String tipoUsuario;
	protected String nome;
	protected String cpf;
	protected String senha;
	protected Integer agencia;
	protected Integer numeroConta;

	
	public static Map<String, Usuario> mapaUsuarios = new HashMap<>();
	public static TreeMap<String, Usuario> OrdenaUsuarios = new TreeMap<>();
	
	
	public Usuario(String tipoUsuario, String nome, String cpf, String senha, Integer agencia, Integer numeroConta) {
		this.nome = nome;
		this.tipoUsuario = tipoUsuario;
		this.cpf = cpf;
		this.senha = senha;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
	}

	public String getTipoUsuario() {
		return this.tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		if (this.cpf == null) {
			this.cpf = cpf;
		}
	}

	public Integer getAgencia() {
		return this.agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String infosUsuario() {
		StringBuilder sb = new StringBuilder();
		return sb.append("Nome: " + this.nome)
		.append("CPF: " + this.cpf)
		.append("Agencia: " + this.agencia)
		.toString();

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.append("Nome Usuário: " + this.nome)
		.append("Tipo Usuario: " + this.tipoUsuario)
		.append("Cpf :" + this.cpf)
		.append("Senha: "+ this.senha)
		.append("Agencia: " + this.agencia)
		.append("Numero Conta=" + this.numeroConta).toString();
	}



	
	
	
	
	
	
//	public Usuario(Integer id, String login, String senha) {
//		super();
//		idUsuario = id;
//		this.login = login;
//		this.senha = senha;
//	}
//
//	public void setIdUsuario(Integer id) {
//		idUsuario = id;
//	}
//
//	public String getLogin() {
//		return login;
//	}
//
//	public void setLogin(String login) {
//		this.login = login;
//	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int compareTo(Usuario o) {
		return 0;
	}

	@Override
	public void depositar(double valorDepositado) throws ContaException {
		// TODO Auto-generated method stub

	}

	@Override
	public void sacar(double valorSacado) throws ContaException {
		// TODO Auto-generated method stub

	}

	@Override
	public void transferir(double valorTransferido) throws ContaException {
		// TODO Auto-generated method stub

	}

}
