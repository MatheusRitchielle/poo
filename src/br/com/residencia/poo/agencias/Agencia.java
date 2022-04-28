package br.com.residencia.poo.agencias;

import java.util.ArrayList;
import java.util.List;

import br.com.residencia.poo.contas.Conta;

public class Agencia  {
	
	protected int idAgencia;
	protected int numeroAgencia;
	protected int idDiretor;
	protected String endereco;
	
	private List<Conta> ag = new ArrayList<>();
	
	public Agencia() {super();}

	public Agencia(int idAgencia, int numeroAgencia, int idDiretor, String endereco) {
		super();
		this.idAgencia = idAgencia;
		this.numeroAgencia = numeroAgencia;
		this.idDiretor = idDiretor;
		this.endereco = endereco;
	}

	public int getIdAgencia() {
		return idAgencia;
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public int getIdDiretor() {
		return idDiretor;
	}

	public String getEndereco() {
		return endereco;
	}
	
	
	
	
}
