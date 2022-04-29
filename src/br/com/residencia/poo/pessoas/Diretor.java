package br.com.residencia.poo.pessoas;

public class Diretor extends Funcionario {

	protected int idDiretor;
	protected int qtdAgencias;
	protected int idAgencia;

	public Diretor() {
		super();
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