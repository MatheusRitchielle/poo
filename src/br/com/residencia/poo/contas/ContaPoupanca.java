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

public class ContaPoupanca extends Conta implements Movimentacao, Tarifa {

	double novoSaldo;
	
	Pessoa pessoa = new Cliente();
	LeituraEscrita le = new LeituraEscrita();
	MenuContas menucontas = new MenuContas();
	Scanner sc = new Scanner(System.in);
	Menu menu = new Menu();
	int opcao;

	public void menuContaPoupanca(String usuario, int conta, List<Conta> contas) throws ContaException, IOException {

		Cliente cliente = new Cliente();
		Scanner sc = new Scanner(System.in);
		Conta contaFuncionario = null;

		for (Conta c : contas) {
			if (c != null) {
				if (c.getNumeroConta() == conta) {
					contaFuncionario = c;
				}
			}
		}
		
		Acessorio.velha();
		System.out.print("\nDigite a operação desejada:\n[1] Sacar\n[2] Depositar\n[3] Transferir\n[4] Simulação de Rendimentos\n[0] Sair\n--->: ");
		opcao = sc.nextInt();
		Double inputValor;

		switch (opcao) {
		case 1:
			System.out.print("\nInforme um valor para sacar R$: ");
			inputValor = Double.parseDouble(sc.next());
			sacar(inputValor, contaFuncionario);
			break;

		case 2:
			System.out.print("\nInforme um valor para depositar R$: ");
			inputValor = Double.parseDouble(sc.next());
			depositar(inputValor, contaFuncionario);
			break;

		case 3:
			System.out.print("\nInforme um valor para transferir R$: ");
			inputValor = Double.parseDouble(sc.next());
			transferir(inputValor, contaFuncionario);
			break;

		case 4:
			double valorAporte;
			int qtdDias;
			System.out.print("\nInforme um valor aporte R$: ");
			valorAporte = sc.nextDouble();
			System.out.print("Informe a quantidade de dias: ");
			qtdDias = sc.nextInt();
			redimento(valorAporte, qtdDias);
			break;

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
				

				le.comprovanteSaque(conta, valorSacado);
				List<Pessoa> pessoaImportada = le.leitorPessoa("entrada.txt");

				for (Pessoa p : pessoaImportada) {
					if (p != null) {
						if (p.getSenha().equals(inputSenha) && p.getCpf().equalsIgnoreCase(cpf)) {
							List<Conta> listContas = le.leitorContas("entrada.txt");
							conta.setSaldo(conta.getSaldo() - valorSacado);
							menuContaPoupanca(p.getCpf(), p.getNumeroConta(), listContas);

						}
					}

				}

			} else {
				List<Conta> listContas = le.leitorContas("entrada.txt");
				menuContaPoupanca(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);
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
				menuContaPoupanca(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);
			} catch (ContaException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			System.out.println("\nValor inválido. Tente novamente!\n");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	public void depositar(double valorDepositado, Conta conta) throws ContaException, IOException {
		
		String cpf = conta.cpf;
		String inputSenha;

		try {
			Cliente cliente = new Cliente();
			Conta pessoa = cliente;

			if ( valorDepositado > 0) {
				System.out.print("\n\nDigite sua senha: ");
				inputSenha = sc.next();
				Acessorio.velha();
				conta.setSaldo(conta.getSaldo() + (valorDepositado - Tarifa.DEPOSITO));
				System.out.println("\nOperação realizada com sucesso!");
				System.out.printf("\nValor depositado: R$%.2f", valorDepositado);
				System.out.printf("\nTarifa para depósito: R$%.2f", Tarifa.DEPOSITO);
				System.out.printf("\nSaldo atual: R$%.2f \n", conta.getSaldo());
				
				le.comprovanteSaque(conta, valorDepositado);
				List<Pessoa> pessoaImportada = le.leitorPessoa("entrada.txt");
				
				for (Pessoa p : pessoaImportada) {
					if (p != null) {
						if (p.getSenha().equals(inputSenha) && p.getCpf().equalsIgnoreCase(cpf)) {
							List<Conta> listContas = le.leitorContas("entrada.txt");
							conta.setSaldo(conta.getSaldo() - valorDepositado);
							menuContaPoupanca(p.getCpf(), p.getNumeroConta(), listContas);

						}
					}

				}

			} else {
				List<Conta> listContas = le.leitorContas("entrada.txt");
				menuContaPoupanca(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);
				System.out.println("\nValor inválido. Tente novamente!\n");
			}

		} catch (NullPointerException e) {
			List<Conta> listContas = le.leitorContas("entrada.txt");
			menuContaPoupanca(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);
			System.out.println("\nValor inválido. Tente novamente!\n");
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
				
				le.comprovanteSaque(conta, valorTransferido);
				List<Pessoa> pessoaImportada = le.leitorPessoa("entrada.txt");
				for (Pessoa p : pessoaImportada) {
					if (p != null) {
						if (p.getSenha().equalsIgnoreCase(inputSenha) && p.getCpf().equalsIgnoreCase(cpf)) {
							List<Conta> listContas = le.leitorContas("entrada.txt");
							conta.setSaldo(conta.getSaldo() - valorTransferido);
							menuContaPoupanca(p.getCpf(), p.getNumeroConta(), listContas);

						}
					}
				}

			} else {
				System.out.println("\nValor inválido. Tente novamente\n");
				List<Conta> listContas = le.leitorContas("entrada.txt");
				menuContaPoupanca(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);
				System.out.println("\nValor inválido. Tente novamente!\n");
			}

		} catch (NullPointerException e) {
			List<Conta> listContas = le.leitorContas("entrada.txt");
			menuContaPoupanca(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);
			System.out.println("Valor inválido. Tente novamente!");

		}
	}

	public void redimento(double valorAporte, int qtdDias) throws ContaException, IOException {
		
		Cliente cliente = new Cliente();
		Conta pessoa = cliente;
		double valorRendimento;
		String cpf = pessoa.cpf;
		String senha = pessoa.cpf;
		
		valorRendimento = (valorAporte * Tarifa.RENDIMENTO) * qtdDias;
		System.out.printf("\nSeu dinheiro vai render R$%.2f", valorRendimento);
		System.out.printf("\nSeu saldo final será de R$%.2f \n", (valorRendimento + valorAporte));
	
		List<Pessoa> pessoaImportada = le.leitorPessoa("entrada.txt");
		for (Pessoa p : pessoaImportada) {
			if (p != null) {
				if (p.getSenha().equalsIgnoreCase(senha) && p.getCpf().equalsIgnoreCase(cpf)) {
					List<Conta> listContas = le.leitorContas("entrada.txt");
				
					menuContaPoupanca(p.getCpf(), p.getNumeroConta(), listContas);

				}
			}

		}
		
		List<Conta> listContas = le.leitorContas("entrada.txt");
		menuContaPoupanca(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);
		System.out.println("\nValor inválido. Tente novamente!\n");

	}

	public ContaPoupanca(String tipoConta, int numeroAgencia, int numeroConta, double saldo, String cpf) {
		this.tipoConta = tipoConta;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.cpf = cpf;
	}

	public ContaPoupanca() {
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

}
