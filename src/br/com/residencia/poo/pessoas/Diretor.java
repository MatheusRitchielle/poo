package br.com.residencia.poo.pessoas;

import br.com.residencia.poo.contas.ContaException;

public class Diretor extends Funcionario {

	protected int idDiretor;
	protected int qtdAgencias;
	protected int idAgencia;

	public Diretor() {
		super();
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