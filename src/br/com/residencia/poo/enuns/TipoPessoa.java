package br.com.residencia.poo.enuns;

public enum TipoPessoa {

    CLIENTE("cliente", 1), GERENTE("gerente", 2), DIRETOR("diretor", 3), PRESIDENTE("presidente", 4);

	private String tipoUsuario;
    private Integer idTipoUsuario;

	TipoPessoa(String tipoUsuario, Integer idTipoUsuario) {
        this.tipoUsuario = tipoUsuario;
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getTipoUsuario() {
        return this.tipoUsuario;
    }

 


}