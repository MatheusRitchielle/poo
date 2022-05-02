package br.com.residencia.poo.pessoas;

import br.com.residencia.poo.contas.ContaException;

public class Presidente extends Funcionario {

	protected int idPresidente;
	String cpf;
	String senha;

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

	public Presidente() {
	}

	public Presidente(Integer idPresidente) {
		super();
		this.idPresidente = idPresidente;
	}

	
	public Presidente(String tipoPessoa, String nome, String cpf, String senha, int numeroAgencia,int numeroConta, double saldo) {
		this.tipoPessoa = tipoPessoa;
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	
	}

	public Presidente(String tipoConta, int numeroAgencia, int numeroConta, double saldo, String cpf) {
		super(tipoConta, numeroAgencia, numeroConta, saldo, cpf);
	
	}

	public Presidente(String login, String senha, double salario) {
		super(login, senha, salario);
		
	}

	public Presidente(String tipoPessoa, String nome, String cpf, String senha) {
		super(tipoPessoa, nome, cpf, senha);
	
	}

	public Integer getIdPresidente() {
		return idPresidente;
	}

	@Override
	public void depositar(double valorDepositado) throws ContaException {
		

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
//List<Diretor> diretores = new ArrayList<>();