package br.com.residencia.poo.contas;

//import java.sql.Date;
//import java.util.concurrent.atomic.AtomicInteger;

public class ContaPoupanca extends Conta {

//	private static final AtomicInteger count = new AtomicInteger(0); 

	protected int idContaPoupanca;
	protected double rentabilidade = 0.06;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(int idAgencia, int idDiretor, String endereco, int numeroAgencia) {
		super(idAgencia, idDiretor, endereco, numeroAgencia);
	}

	public ContaPoupanca(int id, String login, int idAgencia, String tipoConta, int numeroConta, String dataAberta,
			boolean status, double saldo, String senha) {
		super(id, login, idAgencia, tipoConta, numeroConta, dataAberta, status, saldo, senha);
	}

	public ContaPoupanca(int idContaPoupanca, double rentabilidade) {
		super();
		this.idContaPoupanca = idContaPoupanca;
		this.rentabilidade = rentabilidade;
	}

	public double getRentabilidade() {
		return rentabilidade;
	}

	public int getIdContaPoupanca() {
		return idContaPoupanca;
	}

}
