package br.com.residencia.poo.pessoas;

//import java.util.concurrent.atomic.AtomicInteger;

import br.com.residencia.poo.contas.Conta;

public abstract class Pessoa extends Conta {

	protected Integer id;
	protected String nome;
	protected String cpf;
	protected Integer idade;
	protected String telefone;
	protected String endereco;
	protected String email;
	protected String dataNascimento;
	protected String tipoPessoa;
	
	public Pessoa(Integer id, String nome, String cpf, Integer idade, String telefone, String endereco, String email,
			String dataNascimento, String tipoPessoa) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.tipoPessoa = tipoPessoa;
	}

	public Pessoa() {
		super();
	}

	public Pessoa(int idAgencia, int idDiretor, String endereco, int numeroAgencia) {
		super(idAgencia, idDiretor, endereco, numeroAgencia);
	}

	public Pessoa(int id, String login, int idAgencia, String tipoConta, int numeroConta, String dataAberta,
			boolean status, double saldo, String senha) {
		super(id, login, idAgencia, tipoConta, numeroConta, dataAberta, status, saldo, senha);

	}

	public enum TipoPessoa {

	    CLIENTE("Cliente"),
		GERENTE("Gerente"),
	    DIRETOR("Diretor"),
	    PRESIDENTE("Presidente");

	    private String descricao;

	    TipoPessoa(String descricao) {
	        this.descricao = descricao;
	    }

	    public String getDescricao() {
	        return descricao;
	    }
	}
	
	
}
