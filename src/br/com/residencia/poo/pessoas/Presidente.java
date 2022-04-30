package br.com.residencia.poo.pessoas;

import br.com.residencia.poo.contas.ContaException;

public class Presidente extends Funcionario {

	Integer idPresidente;

	public Presidente() {
		super();
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

	@Override
	public void depositar(double valorDepositado) throws ContaException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sacar(double valorSacado) throws ContaException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(double valorTransferido) throws ContaException {
		// TODO Auto-generated method stub
		
	}

}
//List<Diretor> diretores = new ArrayList<>();