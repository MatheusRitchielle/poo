package br.com.residencia.poo.contas;

public class ContaCorrente extends Conta {

	Integer idContaCorrente;
<<<<<<< Updated upstream
	Double chequeEspecial;
	Double taxaDS;
	Double taxaT;
=======
	Double totalTarifado = 0.1d;
	int totalSaques, totalDepositos, totalTransferencias;
>>>>>>> Stashed changes

	public ContaCorrente() {
		super();
	}

<<<<<<< Updated upstream
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
=======
	public ContaCorrente(Integer idContaCorrente, Double taxaDS, Double taxaT) {
		super();
		this.idContaCorrente = idContaCorrente;
	}

	@Override
	public void depositar(double valorDepositado) throws ContaException {

		if (valorDepositado < 0) {
			throw new ContaException("Valor inválido. Tente novamente!");
		
		} else {
			double valorTarifado = Tarifa.DEPOSITO;
			Double saldo = getSaldo();
			
			if (saldo - Tarifa.DEPOSITO >= 0) {
				valorTarifado = Tarifa.DEPOSITO;
				saldo = saldo + (valorDepositado - valorTarifado);
				System.out.println("\nOperação realizada com sucesso!");
				System.out.printf("\nValor depositado: R$%.2f", valorDepositado);
				System.out.printf("\nTarifa para depósito: R$%.2f", Tarifa.DEPOSITO);
				System.out.printf("\nSaldo atual: R$%.2f", saldo);
				++totalSaques;
				menucontas.mostrarMenuCC();

			} else {
				System.out.println("Valor depositado não permitido. Verifique nossas tarifas!");
				menucontas.mostrarMenuCC();
			}
		}
	}

	@Override
	public void sacar(double valorSacado) throws ContaException {

		if (valorSacado <= 0) {
			throw new ContaException("Valor inválido. Tente novamente!");
		
		} else {
			double valorTarifado = Tarifa.SAQUE;
			Double saldo = getSaldo();
		
			if (saldo - valorSacado - valorTarifado >= 0) {
				valorTarifado = Tarifa.SAQUE;
				saldo = saldo - Tarifa.SAQUE - valorSacado;
				System.out.println("\nOperação realizada com sucesso!");
				System.out.printf("\nValor sacado: R$%.2f", valorSacado);
				System.out.printf("\nTarifa para saque: R$%.2f", Tarifa.SAQUE);
				System.out.printf("\nSaldo atual: R$%.2f ", saldo);
				++totalDepositos;
				menucontas.mostrarMenuCC();
				
			} else {
				System.out.println("Valor inválido. Tente novamente!");
				sacar(valorSacado);
			}
		}
	}

	@Override
	public void transferir(double valorTransferido) throws ContaException {

		if (valorTransferido <= 0) {
			throw new ContaException("Valor inválido. Tente novamente!");

		} else {
			double valorTarifado = Tarifa.TRANSFERENCIA;
			Double saldo = getSaldo();

			if (this.saldo - valorTransferido - Tarifa.TRANSFERENCIA >= 0) {
				valorTarifado = Tarifa.TRANSFERENCIA;
				saldo = saldo - valorTarifado - valorTransferido;
				System.out.println("\nOperação realizada com sucesso!");
				System.out.printf("\nValor transferido: R$%.2f", valorTransferido);
				System.out.printf("\nTarifa para transferência: R$%.2f", valorTarifado);
				System.out.printf("\nSaldo atual: R$%.2f", saldo);
				++totalTransferencias;
				menucontas.mostrarMenuCC();
				
			} else {
				System.out.println("Valor inválido. Tente novamente!");
				menucontas.mostrarMenuCC();
			}
		}
	}

	@Override
	public double tarifarSaque(double valorSacado) {
		return 0;
>>>>>>> Stashed changes
	}

	public Integer getIdContaCorrente() {
		return idContaCorrente;
	}

	public Double getTaxaDS() {
		return taxaDS = 0.10;
	}

<<<<<<< Updated upstream
	public Double getTaxaT() {
		return taxaT = 0.20;
	}

=======
	public Integer getIdContaCorrente() {
		return idContaCorrente;
	}

	@Override
	public double jurosRendimento(double rendimentoConta) {
		// TODO Auto-generated method stub
		return 0;
	}
>>>>>>> Stashed changes
}
