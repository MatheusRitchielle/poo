package br.com.residencia.poo.agencias;

public class Agencia {
	
	protected int idAgencia;
	protected int idDiretor;
	protected String endereco;
	protected int numeroAgencia;

	//	private List<Conta> contas = new ArrayList<>();
	
	public int getIdAgencia() {
		return idAgencia;
	}

	public void setIdAgencia(int idAgencia) {
		this.idAgencia = idAgencia;
	}

	public int getIdDiretor() {
		return idDiretor;
	}

	public void setIdDiretor(int idDiretor) {
		this.idDiretor = idDiretor;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	
	public Agencia() {
		
	}
	
	public Agencia(int idAgencia, int idDiretor, String endereco, int numeroAgencia) {
		super();
		this.idAgencia = idAgencia;
		this.idDiretor = idDiretor;
		this.endereco = endereco;
		this.numeroAgencia = numeroAgencia;
	}
}
