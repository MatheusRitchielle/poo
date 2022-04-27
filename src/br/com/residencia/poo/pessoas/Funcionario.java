package br.com.residencia.poo.pessoas;

public abstract class Funcionario extends Pessoa {

	protected int idusuario;
	protected String login;
	protected String senha;
	protected double salario;

	public Funcionario(Integer id, String nome, String cpf, Integer idade, String telefone, String endereco,
			String email, String dataNascimento, String tipoPessoa, int idusuario, String login, String senha,
			double salario) {
		super(id, nome, cpf, idade, telefone, endereco, email, dataNascimento, tipoPessoa);
		this.idusuario = idusuario;
		this.login = login;
		this.senha = senha;
		this.salario = salario;
	}

	public Funcionario() {
		super();
	}

	public Funcionario(int idAgencia, int idDiretor, String endereco, int numeroAgencia) {
		super(idAgencia, idDiretor, endereco, numeroAgencia);
	}

	public Funcionario(Integer id, String nome, String cpf, Integer idade, String telefone, String endereco,
			String email, String dataNascimento, String tipoPessoa) {
		super(id, nome, cpf, idade, telefone, endereco, email, dataNascimento, tipoPessoa);
	}

	@Override
	public String toString() {
		return "Salário funcionário: R$" + salario ;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

}

//private static final AtomicInteger count = new AtomicInteger(0);
//@Override
//public String toString() {
//		StringBuilder sb = new StringBuilder();
//		return sb.append("ID: ".concat(String.valueOf(this.idusuario)))
//				.append("\nLogin: ".concat(this.login))
//				.append("\nSenha: ".concat(this.senha))
//				.append("\nSalário: ".concat(String.valueOf(this.salario)))
//				.append("\nCargo: ".concat(this.cargo));
//}