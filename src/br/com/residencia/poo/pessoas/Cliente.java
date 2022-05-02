package br.com.residencia.poo.pessoas;

import br.com.residencia.poo.contas.ContaException;

public class Cliente extends Pessoa{


	Integer id;
	Integer idGerente;
	String cpf;
	String senha;
	
	public Cliente() {
	}


	public Cliente(String tipoPessoa, String nome, String cpf, String senha, int agencia, int numeroConta) {
		this.cpf = cpf;
		this.tipoPessoa = tipoPessoa;
		this.senha = senha;
		this.nome = nome;
		this.numeroAgencia = agencia;
		this.numeroConta = numeroConta;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public String getSenha() {
		return senha;
	}
	
	
	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public void depositar(double valorDepositado) throws ContaException {
		
	}

	@Override
	public void sacar(double valorSacado) throws ContaException {
	}

	@Override
	public void transferir(double valorTransferido) throws ContaException {
		
	}


}
