package br.com.residencia.poo.contas;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import br.com.residencia.poo.io.LeituraEscrita;
import br.com.residencia.poo.menu.Acessorio;
import br.com.residencia.poo.menu.Menu;
import br.com.residencia.poo.menu.MenuContas;
import br.com.residencia.poo.pessoas.Cliente;
import br.com.residencia.poo.pessoas.Pessoa;

public class ContaCorrente extends Conta implements Movimentacao, Tarifa {

	double novoSaldo;

	Pessoa pessoa = new Cliente();
	LeituraEscrita le = new LeituraEscrita();
	MenuContas menucontas = new MenuContas();
	Menu menu = new Menu();
	Scanner sc = new Scanner(System.in);

	private int totalSaques;
	private int totalDepositos;
	private int totalTransferencias;
	private double totalTarifado;

	public ContaCorrente(String tipoConta, int numeroAgencia, int numeroConta, double saldo, String cpf) {
		super(tipoConta, numeroAgencia, numeroConta, saldo, cpf);
		this.tipoConta = tipoConta;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.cpf = cpf;
	}

	public void menuContaCorrente(String usuario, int conta, List<Conta> contas) throws ContaException, IOException {

		int opcao;
		Scanner sc = new Scanner(System.in);
		Conta contaCliente = null;

		for (Conta c : contas) {
			if (c != null) {
				if (c.getNumeroConta() == conta) {
					contaCliente = c;
				}
			}
		}

		Acessorio.velha();
		System.out.print(
				"Digite a operação desejada:\n\n"
				+ "{1} Sacar\n"
				+ "{2} Depositar\n"
				+ "{3} Transferir\n"
				+ "{4} Extrato\n"
				+ "{0} Sair\n"
				+ "===>: ");
		opcao = sc.nextInt();
		Double inputValor;

		switch (opcao) {
		case 1:
			System.out.print("\nInforme o valor do saque R$: ");
			inputValor = Double.parseDouble(sc.next());
			sacar(inputValor, contaCliente);
			break;

		case 2:
			System.out.print("\nInforme o valor do depósito R$: ");
			inputValor = Double.parseDouble(sc.next());
			depositar(inputValor, contaCliente);
			break;

		case 3:
			System.out.print("\nInforme o valor da transferência R$: ");
			inputValor = Double.parseDouble(sc.next());
			transferir(inputValor, contaCliente);
			break;

		case 4:
			relatorio(contaCliente, totalSaques, totalDepositos, totalTransferencias, totalTarifado);
			Acessorio.velha();
			System.out.println("Extrato gerado com sucesso! \nEstamos te redirecionando para o Menu...");
			Acessorio.velha();
			menu.cpfSenha(); 
			
		case 0:
			menu.mostrarMenuPrincipal();
			
			break;

		default:
			System.exit(0);
		}
		sc.close();
	}

	public void sacar(double valorSacado, Conta conta) throws ContaException {

		String cpf = conta.cpf;
		String inputSenha;

		try {
			Cliente cliente = new Cliente();
			Conta pessoa = cliente;

			if (conta.getSaldo() > valorSacado) {

				novoSaldo = conta.setSaldo(conta.getSaldo() - (valorSacado + Tarifa.SAQUE));

				System.out.print("\n\nDigite sua senha: ");
				inputSenha = sc.next();
				Acessorio.velha();
				System.out.println("\nOperação realizada com sucesso!");
				System.out.printf("\n\nValor sacado: R$%.2f", valorSacado);
				System.out.printf("\nTarifa para saque : R$%.2f", Tarifa.SAQUE);
				System.out.printf("\nSaldo atual: R$%.2f \n", novoSaldo);
				totalSaques++;
				totalTarifado = totalTarifado + Tarifa.SAQUE;

				le.comprovanteSaque(conta, valorSacado);
				List<Pessoa> pessoaImportada = le.leitorPessoa("entrada.txt");

				for (Pessoa p : pessoaImportada) {
					if (p != null) {
						if (p.getSenha().equals(inputSenha) && p.getCpf().equalsIgnoreCase(cpf)) {
							List<Conta> listContas = le.leitorContas("entrada.txt");
							conta.setSaldo(conta.getSaldo() - valorSacado);
							menuContaCorrente(p.getCpf(), p.getNumeroConta(), listContas);

						}
					}

				}

			} else {
				List<Conta> listContas = le.leitorContas("entrada.txt");
				menuContaCorrente(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);
				System.out.println("\nValor inválido. Tente novamente!\n");
			}

		} catch (NullPointerException e) {
			List<Conta> listContas = null;
			try {
				listContas = le.leitorContas("entrada.txt");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				menuContaCorrente(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);
			} catch (ContaException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			System.out.println("\nValor inválido. Tente novamente!");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void depositar(double valorDepositado, Conta conta) throws ContaException {

		String cpf = conta.cpf;
		String inputSenha;

		try {
			Cliente cliente = new Cliente();
			Conta pessoa = cliente;

			if (valorDepositado > 0) {
				conta.setSaldo(conta.getSaldo() + (valorDepositado - Tarifa.DEPOSITO));

				System.out.print("\nDigite sua senha: ");
				inputSenha = (sc.next());
				Acessorio.velha();
				System.out.println("\nOperação realizada com sucesso!");
				System.out.printf("\nValor depositado: R$%.2f", valorDepositado);
				System.out.printf("\nTarifa para depósito: R$%.2f", Tarifa.DEPOSITO);
				System.out.printf("\nSaldo atual: R$%.2f \n", conta.getSaldo());
				totalDepositos++;
				totalTarifado = totalTarifado + Tarifa.DEPOSITO;

				le.comprovanteDeposito(conta, valorDepositado);
				List<Pessoa> pessoaImportada = le.leitorPessoa("entrada.txt");

				for (Pessoa p : pessoaImportada) {
					if (p != null) {
						if (p.getSenha().equals(inputSenha) && p.getCpf().equalsIgnoreCase(cpf)) {
							List<Conta> listContas = le.leitorContas("entrada.txt");
							conta.setSaldo(conta.getSaldo() - valorDepositado);
							menuContaCorrente(p.getCpf(), p.getNumeroConta(), listContas);

						}
					}

				}

			} else {
				List<Conta> listContas = le.leitorContas("entrada.txt");
				menuContaCorrente(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);
				System.out.println("\nValor inválido. Tente novamente!\n");
			}

		} catch (NullPointerException e) {
			List<Conta> listContas = null;
			try {
				listContas = le.leitorContas("entrada.txt");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				menuContaCorrente(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);
			} catch (ContaException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			System.out.println("\nValor inválido. Tente novamente!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void transferir(double valorTransferido, Conta conta) throws ContaException, IOException {

		String cpf = conta.cpf;
		String inputSenha;

		try {
			Cliente cliente = new Cliente();
			Conta pessoa = cliente;

			if (conta.getSaldo() >= 0 || conta.getSaldo() > valorTransferido) {
				System.out.print("\n\nDigite sua senha: ");
				inputSenha = (sc.next());
				conta.setSaldo(conta.getSaldo() - valorTransferido - Tarifa.TRANSFERENCIA);
				System.out.println("\nOperação realizada com sucesso!");
				System.out.printf("\nValor transferido: R$%.2f", valorTransferido);
				System.out.printf("\nTarifa para transferência: R$%.2f", Tarifa.TRANSFERENCIA);
				System.out.printf("\nSaldo atual: R$%.2f \n", conta.getSaldo());
				totalTransferencias++;
				totalTarifado = totalTarifado + Tarifa.TRANSFERENCIA;

				le.comprovanteTransferencia(conta, valorTransferido);
				List<Pessoa> pessoaImportada = le.leitorPessoa("entrada.txt");

				for (Pessoa p : pessoaImportada) {
					if (p != null) {
						if (p.getSenha().equals(inputSenha) && p.getCpf().equalsIgnoreCase(cpf)) {
							List<Conta> listContas = le.leitorContas("entrada.txt");
							conta.setSaldo(conta.getSaldo() - valorTransferido);
							menuContaCorrente(p.getCpf(), p.getNumeroConta(), listContas);

						}
					}

				}

			} else {
				System.out.println("\nValor inválido. Tente novamente\n");
				List<Conta> listContas = le.leitorContas("entrada.txt");
				menuContaCorrente(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);
				System.out.println("\nValor inválido. Tente novamente!\n");
			}

		} catch (NullPointerException e) {
			List<Conta> listContas = le.leitorContas("entrada.txt");
			menuContaCorrente(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);
			System.out.println("Valor inválido. Tente novamente!");
		}
	}

	public void relatorio(Conta conta, int totalSaques, int totalDepositos, int totalTransferencias,
			double totalTarifado) throws IOException, ContaException {

		le.extratoCliente(conta, totalSaques, totalDepositos, totalTransferencias, totalTarifado);

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

	@Override
	public double jurosRendimento(double rendimentoConta) {
		return 0;
	}

	@Override
	public void depositar(double valorDepositado) throws ContaException {
	}

	@Override
	public void sacar(double valorSacado) throws ContaException {

	}

	@Override
	public void transferir(double valorTransferido) throws ContaException {

	}

	public ContaCorrente() {
	}

	@Override
	public double getSaldo() {
		return super.getSaldo();
	}

	@Override
	public void setCpf(String cpf) {
		super.setCpf(cpf);
	}
}
