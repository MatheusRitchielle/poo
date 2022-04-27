package br.com.residencia.poo.pessoas;


public class Presidente extends Funcionario {

	Integer idPresidente;

	public Presidente(Integer id, String nome, String cpf, Integer idade, String telefone, String endereco,
			String email, String dataNascimento, String tipoPessoa, int idusuario, String login, String senha,
			double salario, Integer idPresidente) {
		super(id, nome, cpf, idade, telefone, endereco, email, dataNascimento, tipoPessoa, idusuario, login, senha,
				salario);
		this.idPresidente = idPresidente;
	}

	public Presidente() {
		super();
	}

	public Presidente(int idAgencia, int idDiretor, String endereco, int numeroAgencia) {
		super(idAgencia, idDiretor, endereco, numeroAgencia);
	}

	public Presidente(Integer id, String nome, String cpf, Integer idade, String telefone, String endereco,
			String email, String dataNascimento, String tipoPessoa, int idusuario, String login, String senha,
			double salario) {
		super(id, nome, cpf, idade, telefone, endereco, email, dataNascimento, tipoPessoa, idusuario, login, senha,
				salario);
	}
	//Criou nova com o String i
	//Acredito que vai ser melhor trocar todas as datas para string e depois fazer um parse pra transformar em data
	public Presidente(int id, String nome, String cpf, int idade, String telefone, String endereco, String email, String i,//esse camarada aqui
			String tipoPessoa, int idusuario, String login, String senha, double salario, int idPresidente2) {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdPresidente() {
		return idPresidente;
	}

}
//List<Diretor> diretores = new ArrayList<>();