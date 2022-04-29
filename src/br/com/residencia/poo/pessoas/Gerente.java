package br.com.residencia.poo.pessoas;

import br.com.residencia.poo.contas.ContaException;

public class Gerente extends Funcionario {

	protected int idAgencia;
	String cpf;
	String senha;
	public Gerente() {
		super();
	}

	public Gerente(String cpf, String senha, String dados, String dados2, int i, int j, double d, int k) {
		super(cpf, senha);
		this.cpf = cpf;
		this.senha = senha;
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
