package br.com.residencia.poo.pessoas;

public class Cliente extends Pessoa {

	Integer id;
	Integer idGerente;

	//Foi incluido o Id2 porque já existe um id que está vindo de pessoa
	public Cliente(Integer id, String nome, String cpf, Integer idade, String telefone, String endereco, String email,
			String dataNascimento, String tipoPessoa, Integer id2, Integer idGerente) {
		super(id, nome, cpf, idade, telefone, endereco, email, dataNascimento, tipoPessoa);
		id = id2;
		this.idGerente = idGerente;
	}

	public Cliente() {
		super();
	}

	public Cliente(int idAgencia, int idDiretor, String endereco, int numeroAgencia) {
		super(idAgencia, idDiretor, endereco, numeroAgencia);
	}

	public Cliente(int id, String login, int idAgencia, String tipoConta, int numeroConta, String dataAberta,
			boolean status, double saldo, String senha) {
		super(id, login, idAgencia, tipoConta, numeroConta, dataAberta, status, saldo, senha);
	}

	public Cliente(Integer id, String nome, String cpf, Integer idade, String telefone, String endereco, String email,
			String dataNascimento, String tipoPessoa) {
		super(id, nome, cpf, idade, telefone, endereco, email, dataNascimento, tipoPessoa);
	}

	public int getId() {
		return id;
	}

	public Integer getIdGerente() {
		return idGerente;
	}

}
