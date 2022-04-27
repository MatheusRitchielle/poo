package br.com.residencia.poo.agencias;

public class Agencia {

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

	public int getNumeroAgencia() {
		return numeroAgencia;
	}

}
