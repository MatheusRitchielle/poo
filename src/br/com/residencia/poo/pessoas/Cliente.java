package br.com.residencia.poo.pessoas;

public class Cliente extends Pessoa{

	Integer id;
	Integer idGerente;
	String cpf;
	String senha;
	
	public Cliente() {
		super();	
	}

	//Construtor Pessoa
	public Cliente(String cpf, String senha) {
		super(cpf, senha);
		this.cpf = cpf;
		this.senha = senha;
	}

	public Cliente(Integer id, Integer idGerente, String cpf, String senha) {
		super();
		this.id = id;
		this.idGerente = idGerente;
		this.cpf = cpf;
		this.senha = senha;
	}
	
	@Override
	public String toString() {
		
		return "Cliente: ".concat(this.cpf).concat("\tSenha: ").concat(this.senha);
	}
	
	public String getCpf() {
		return cpf;
	}
	
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public String getSenha() {
		return senha;
	}
	
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
