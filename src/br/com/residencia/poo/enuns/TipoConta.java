package br.com.residencia.poo.enuns;

public enum TipoConta {
	
	CORRENTE("corrente", 1),
	POUPANCA("poupança", 2);

	private final String tipoConta;
	private final Integer idConta;

	private TipoConta(String tipoConta, Integer idConta) {
		this.tipoConta = tipoConta;
		this.idConta = idConta;

	}

	public String getTipoConta() {
		return tipoConta;
	}

	public Integer getIdConta() {
		return idConta;
	}

}
