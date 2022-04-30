package br.com.residencia.poo.enuns;

public enum TipoConta {
	
	CORRENTE("corrente"), POUPANCA("poupanca");

	
    private String tipoConta;

    TipoConta(String string) {
	}

	void ContaTipoEnum(String tipoConta, Integer idConta) {
        this.tipoConta = tipoConta;
    }

    public String getTipoConta() {
        return this.tipoConta;
    }

}