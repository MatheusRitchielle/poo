package br.com.residencia.poo.contas;

public class ContaCorrente extends Conta {

	Integer idContaCorrente;
	Double chequeEspecial;
	Double taxaDS;
	Double taxaT;

	public ContaCorrente() {
		super();

	}

	public ContaCorrente(int idAgencia, int idDiretor, String endereco, int numeroAgencia) {
		super(idAgencia, idDiretor, endereco, numeroAgencia);

	}

	public ContaCorrente(int id, String login, int idAgencia, String tipoConta, int numeroConta, String dataAberta,
			boolean status, double saldo, String senha) {
		super(id, login, idAgencia, tipoConta, numeroConta, dataAberta, status, saldo, senha);

	}
	
	public ContaCorrente(Integer idContaCorrente, Double chequeEspecial, Double taxaDS, Double taxaT) {
		super();
		this.idContaCorrente = idContaCorrente;
		this.chequeEspecial = chequeEspecial;
		this.taxaDS = taxaDS;
		this.taxaT = taxaT;
	}

	public Integer getIdContaCorrente() {
		return idContaCorrente;
	}

	public Double getTaxaDS() {
		return taxaDS = 0.10;
	}

	public Double getTaxaT() {
		return taxaT = 0.20;
	}

}
