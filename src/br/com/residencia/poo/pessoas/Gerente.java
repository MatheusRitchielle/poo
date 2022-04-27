package br.com.residencia.poo.pessoas;

public class Gerente extends Funcionario {

	protected int idAgencia;

	public Gerente(Integer id, String nome, String cpf, Integer idade, String telefone, String endereco, String email,
			String dataNascimento, String tipoPessoa, int idusuario, String login, String senha, double salario,
			int idAgencia) {
		super(id, nome, cpf, idade, telefone, endereco, email, dataNascimento, tipoPessoa, idusuario, login, senha,
				salario);
		this.idAgencia = idAgencia;
	}

	public Gerente() {
		super();
	}

	public Gerente(int idAgencia, int idDiretor, String endereco, int numeroAgencia) {
		super(idAgencia, idDiretor, endereco, numeroAgencia);
	}

	public Gerente(Integer id, String nome, String cpf, Integer idade, String telefone, String endereco, String email,
			String dataNascimento, String tipoPessoa, int idusuario, String login, String senha, double salario) {
		super(id, nome, cpf, idade, telefone, endereco, email, dataNascimento, tipoPessoa, idusuario, login, senha,
				salario);
	}

	public int getIdAgencia() {
		return idAgencia;
	}

}
