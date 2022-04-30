package br.com.residencia.poo.pessoas;

import br.com.residencia.poo.contas.ContaException;

public class Presidente extends Funcionario {

	Integer idPresidente;

	public Presidente() {
	}

	public Presidente(Integer idPresidente) {
		super();
		this.idPresidente = idPresidente;
	}

	
	public Presidente(String tipoPessoa, String nome, String cpf, String senha, int numeroAgencia,int numeroConta, double saldo) {
		super(tipoPessoa, nome, cpf, senha, numeroAgencia,numeroConta,saldo );
	
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