package br.com.residencia.poo.pessoas;

import br.com.residencia.poo.contas.ContaException;

public class Cliente extends Pessoa{

	
	Integer id;
	Integer idGerente;
	String cpf;
	String senha;
	
	public Cliente() {
	}
 

	
	public Cliente(String tipoConta, Integer numeroAgencia, Integer numeroConta, Double saldo, String cpf) {
		super(tipoConta, numeroAgencia, numeroConta, saldo, cpf);
	}



	public Cliente(String tipoPesosa, String nome, String cpf, String senha, int agencia, int numeroConta) {

	}

	@Override
	public String toString() {
		
		return "Cliente: ".concat(this.cpf).concat("\tSenha: ").concat(this.senha);
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
