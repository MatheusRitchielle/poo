package br.com.residencia.poo.agencias;

public class Agencia {
	
	protected byte idAgencia;
	protected byte idDiretor;
	protected String endereco;
	
	public byte getIdAgencia() {
		return idAgencia;
	}

	public void setIdAgencia(byte idAgencia) {
		this.idAgencia = idAgencia;
	}

	public byte getIdDiretor() {
		return idDiretor;
	}

	public void setIdDiretor(byte idDiretor) {
		this.idDiretor = idDiretor;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public byte getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(byte numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	protected byte numeroAgencia;
	
	public Agencia() {
		
	}
	
	public Agencia(byte idAgencia, byte idDiretor, String endereco, byte numeroAgencia) {
		this.idAgencia = idAgencia;
		this.idDiretor = idDiretor;
		this.endereco = endereco;
		this.numeroAgencia = numeroAgencia;
	}
	
	
	
	
}
