package br.com.residencia.poo.agencias;

import br.com.residencia.poo.contas.Conta;
import br.com.residencia.poo.contas.ContaException;

public class Agencia extends Conta {
	protected int idAgencia;
	protected int idDiretor;
	protected String endereco;
	protected int numeroAgencia;

	// private List<Conta> contas = new ArrayList<>();

	public Agencia() {
		super();
	}

	public Agencia(int idAgencia, int idDiretor, String endereco, int numeroAgencia) {
		super();
		this.idAgencia = idAgencia;
		this.idDiretor = idDiretor;
		this.endereco = endereco;
		this.numeroAgencia = numeroAgencia;
	}

	public int getIdAgencia() {
		return idAgencia;
	}

	public int getIdDiretor() {
		return idDiretor;
	}

	public String getEndereco() {
		return endereco;
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
