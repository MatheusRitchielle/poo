package br.com.residencia.poo.enuns;

public enum TipoPessoa {
	
	CLIENTE("cliente", 1), 
	GERENTE("gerente", 2), 
	DIRETOR("diretor", 3), 
	PRESIDENTE("presidente", 4);

	private final Integer idTipoUsuario;
	private final String tipoUsuario;

	TipoPessoa(String tipoUsuario, Integer idTipoUsuario){

		this.tipoUsuario = tipoUsuario;
		this.idTipoUsuario = idTipoUsuario;

	}

	private TipoPessoa(Integer idTipoUsuario, String tipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
		this.tipoUsuario = tipoUsuario;
	}

	public Integer getIdTipoUsuario() {
		return idTipoUsuario;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}
}
