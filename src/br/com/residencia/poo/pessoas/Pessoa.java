package br.com.residencia.poo.pessoas;

import java.sql.Date;
import java.util.concurrent.atomic.AtomicInteger;

import br.com.residencia.poo.contas.Conta;

public abstract class Pessoa extends Conta{
	
//	private static final AtomicInteger count = new AtomicInteger(0); 
	protected Integer id;
	protected String cpf;
	protected String nome;
	protected byte idade;
	protected String telefone;
	protected String endereco;
	protected String email;
	protected Date dataNascimento;
	protected String tipoPessoa;
	
	public Pessoa() {
		super();
		
	}
	public Pessoa(Integer id, String cpf, String nome, byte idade, String telefone, String endereco, String email,
			Date dataNascimento, String tipoPessoa) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.tipoPessoa = tipoPessoa;
	}


	public Pessoa(int idAgencia, int numeroAgencia, int idDiretor, String endereco) {
		super(idAgencia, numeroAgencia, idDiretor, endereco);
		
	}

	public Pessoa(int id, String login, int numeroAgencia, String tipoConta, int numeroConta, Date dataAberta,
			boolean status, String senha) {
		super(id, login, numeroAgencia, tipoConta, numeroConta, dataAberta, status, senha);
		
	}
	

}
