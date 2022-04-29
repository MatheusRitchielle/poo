package br.com.residencia.poo.contas;

public class ContaCorrente extends Conta implements Movimentacao, Tarifa {

	Integer idContaCorrente;
	Double totalTarifado;
	int totalSaques, totalDepositos, totalTransferencias;
	
	public ContaCorrente() {
		super();

	}

	public ContaCorrente(Integer idContaCorrente, Double taxaDS, Double taxaT) {
		super();
		this.idContaCorrente = idContaCorrente;
	}

	public Integer getIdContaCorrente() {
		return idContaCorrente;
	}

	@Override
	public void depositar(double valorDepositado) throws ContaException {

		if (valorDepositado < 0) {
			throw new ContaException("Valor inválido. Tente novamente!");
		} else {
			
			double valorTarifado = tarifarDeposito(valorDepositado);
			
			if (this.saldo - valorTarifado >= 0) {
				
				this.saldo -= valorTarifado;
				this.totalTarifado += Tarifa.SAQUE;
				
				//O PRINTF ESTÁ LIMITANDO AS CASAS DECIMAIS
				
				System.out.println("\nOperação realizada com sucesso!");
				System.out.printf("\nValor depositado: R$.2f%n", valorDepositado);
				System.out.printf("\nTarifa para depósito: R$.2f%n", valorTarifado);
				System.out.printf("\nSaldo atual: R$.2f%n", this.saldo);
				
				//ADICIONA O SAQUE PARA FUTURAMENTE GERAR RELATÓRIO
				
				++totalSaques;	
			} else {
				System.out.println("Valor depositado não permitido. Verifique nossas tarifas!");
			}
		}
	}
	
	@Override
	public void sacar(double valorSacado) throws ContaException {
		
		if (valorSacado <= 0) {
			throw new ContaException("Valor inválido. Tente novamente!");
		} else {
			
			double valorTarifado = tarifarSaque(valorSacado);

			if (this.saldo - valorSacado - valorTarifado >= 0) {

				this.saldo -= valorTarifado;
				this.totalTarifado -= Tarifa.DEPOSITO;

				System.out.println("\nOperação realizada com sucesso!");
				System.out.printf("\nValor sacado: R$.2f%n", valorSacado);
				System.out.printf("\nTarifa para saque: R$.2f%n", valorTarifado);
				System.out.printf("\nSaldo atual: R$.2f%n", this.saldo);

				++totalDepositos;
			} else {
				System.out.println("Valor inválido. Tente novamente!");
			}
		}
	}

	//FALTA VALIDAR CONTA 2 E ADICIONAR O VALOR TRANSFERIDO À ELA
	
	@Override
	public void transferir(double valorTransferido) throws ContaException {

		if (valorTransferido <= 0) {
			throw new ContaException("Valor inválido. Tente novamente!");
		} else {
			
			double valorTarifado = tarifarTransferencia(valorTransferido);
			
		if (this.saldo - valorTransferido - valorTarifado >= 0) {
			
			this.saldo -= valorTarifado;
			this.totalTarifado -= Tarifa.TRANSFERENCIA;
			
			System.out.println("\nOperação realizada com sucesso!");
			System.out.printf("\nValor transferido: R$.2f%n", valorTransferido);
			System.out.printf("\nTarifa para transferência: R$.2f%n", valorTarifado);
			System.out.printf("\nSaldo atual: R$.2f%n", this.saldo);
			
			++totalTransferencias;			
		} else {
			System.out.println("Valor inválido. Tente novamente!");
		}
	}
}
	
	@Override
	public double tarifarSaque(double valorSacado) {
		return 0;
	}

	@Override
	public double tarifarDeposito(double valorDepositado) {
		return 0;
	}

	@Override
	public double tarifarTransferencia(double valorTransferido) {
		return 0;
	}

}
