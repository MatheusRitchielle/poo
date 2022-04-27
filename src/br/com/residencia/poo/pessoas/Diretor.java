package br.com.residencia.poo.pessoas;

public class Diretor extends Funcionario {

	protected int idDiretor;
	protected int qtdAgencias;
	protected int idAgencia;

	public Diretor(Integer id, String nome, String cpf, Integer idade, String telefone, String endereco, String email,
			String dataNascimento, String tipoPessoa, int idusuario, String login, String senha, double salario, int idDiretor, int qtdAgencias, int idAgencia) {
		super(id, nome, cpf, idade, telefone, endereco, email, dataNascimento, tipoPessoa);
		this.idDiretor = idDiretor;
		this.qtdAgencias = qtdAgencias;
		this.idAgencia = idAgencia;
	}

	public Diretor() {
		super();
	}

	public Diretor(int idAgencia, int idDiretor, String endereco, int numeroAgencia) {
		super(idAgencia, idDiretor, endereco, numeroAgencia);
	}

	public Diretor(Integer id, String nome, String cpf, Integer idade, String telefone, String endereco, String email,
			String dataNascimento, String tipoPessoa, int idusuario, String login, String senha, double salario) {
		super(id, nome, cpf, idade, telefone, endereco, email, dataNascimento, tipoPessoa, idusuario, login, senha,
				salario);
	}

	public int getIdDiretor() {
		return idDiretor;
	}

	public int getQtdAgencias() {
		return qtdAgencias;
	}

	public int getIdAgencia() {
		return idAgencia;
	}

}
//List<Agencia> agencias = new ArrayList<>();