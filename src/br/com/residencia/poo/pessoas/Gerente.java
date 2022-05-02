package br.com.residencia.poo.pessoas;

import java.util.HashMap;
import java.util.Map;
import br.com.residencia.poo.contas.Conta;
import br.com.residencia.poo.contas.ContaException;

public class Gerente extends Funcionario {

	protected int idAgencia;
	String cpf;
	String senha;
	
	public static Map<String, Conta> mapaContas = new HashMap<>();
	
	public Gerente() {
	}

	
	public Gerente(String tipoPessoa, String nome, String cpf, String senha, int numeroAgencia,int numeroConta, double saldo) {
		this.tipoPessoa = tipoPessoa;
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	
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


	public void setIdAgencia(int idAgencia) {
		this.idAgencia = idAgencia;
	}


	public int getIdAgencia() {
		return idAgencia;
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
