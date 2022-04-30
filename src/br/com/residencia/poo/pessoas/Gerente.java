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
		super(tipoPessoa, nome, cpf, senha, numeroAgencia,numeroConta,saldo );
	
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
