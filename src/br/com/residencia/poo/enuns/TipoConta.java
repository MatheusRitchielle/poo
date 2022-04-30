package br.com.residencia.poo.enuns;

public enum TipoConta {
	
	CORRENTE("Corrente"), POUPANCA("Poupanca");

	
    private String tipoConta;


	TipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getTipoConta() {
        return this.tipoConta;
    }

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

}