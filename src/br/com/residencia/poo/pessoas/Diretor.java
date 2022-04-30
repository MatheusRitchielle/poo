package br.com.residencia.poo.pessoas;

import br.com.residencia.poo.contas.ContaException;

public class Diretor extends Funcionario {

	protected int idDiretor;
	protected int qtdAgencias;
	protected int idAgencia;


	public Diretor() {
		super();
	}

	public Diretor(String tipoPessoa, String nome, String cpf, String senha, int numeroAgencia,int numeroConta, double saldo) {
	this.tipoPessoa=tipoPessoa;
	this.nome = nome;
	this.cpf = cpf;
	this.senha = senha;
	this.numeroAgencia = numeroAgencia;
	this.numeroConta = numeroConta;
	this.saldo = saldo;
	}
	
	public int getIdDiretor() {
		return idDiretor;
	}

	public int getQtdAgencias() {
		return qtdAgencias;
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
//List<Agencia> agencias = new ArrayList<>();