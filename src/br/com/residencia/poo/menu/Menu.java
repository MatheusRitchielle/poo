package br.com.residencia.poo.menu;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import br.com.residencia.poo.contas.Conta;
import br.com.residencia.poo.contas.ContaException;
import br.com.residencia.poo.contas.Tarifa;
import br.com.residencia.poo.io.LeituraEscrita;
import br.com.residencia.poo.pessoas.Cliente;
import br.com.residencia.poo.pessoas.Pessoa;

public class Menu implements InterfaceMenu {

	double inputValor;
	static String inputCpf;
	static String inputSenha;

	Scanner sc = new Scanner(System.in);
	MenuContas menuContas = new MenuContas();
	LeituraEscrita le = new LeituraEscrita();
	Cliente cliente = new Cliente();
	Conta pessoa = cliente;

	///////////MENU PRINCIPAL
	@Override
	public void menuPrincipal() throws IOException, ContaException {

		System.out.println("====================\n* Mucha Lucha Bank *\n====================");
		System.out.printf("  Seja Bem - Vindo!\n\nDigite uma das opções:\n[1] Login\n[2] Sair\n--->: ");
		switch (sc.nextInt()) {
		case 1:
			List<Pessoa> pessoaImportada = le.leitorPessoa();
			Pessoa pessoa = null;
			System.out.print("Digite seu CPF: ");
			inputCpf = (sc.next());
			System.out.print("Digite sua senha: ");
			inputSenha = (sc.next());

			for (Pessoa p : pessoaImportada) {
				if (p != null) {
					if (p.getSenha().equals(inputSenha) && p.getCpf().equals(inputCpf)) {
						List<Conta> listContas = le.leitorContas();
						System.out.println("Bem vindo(a), " + p.getNome() + "!");
						menuCC(p.getCpf(), p.getNumeroConta(), listContas);
						pessoa = p;
					}
				}
			}
			break;
		case 2:
			System.exit(0);
			break;
			default:
				System.out.println("\nError 404 not Found!");
				menuPrincipal();
				break;
		}
		sc.close();
	}

	///////////MENU CONTA CORRENTE
	public void menuCC(String usuario, int conta, List<Conta> contas) throws ContaException, IOException {

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
		System.out.print(
				"\n\n===========================\n"
				+ "Digite a operação desejada:\n"
				+ "[1] Sacar\n"
				+ "[2] Depositar\n"
				+ "[3] Transferir\n"
				+ "[0] Sair");
				System.out.print("\n===========================\n--->: ");
		Double inputValor;
		switch (sc.nextInt()) {
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

		case 0:
			System.exit(0);
			break;
			default: 
				System.out.println("Error 404 not Found!");
				menuPrincipal();
		}
		
		sc.close();
	}

	////////////SACAR
	public void sacar(double valorSacado, Conta conta) throws ContaException, IOException {
		try {
			Cliente cliente = new Cliente();
			Conta pessoa = cliente;

			if (conta.getSaldo() > valorSacado) {
				conta.setSaldo(conta.getSaldo() - valorSacado);
				System.out.println("\n\nOperação realizada com sucesso!");
				System.out.printf("\n\nValor sacado: R$%.2f", valorSacado);
				System.out.printf("\nTarifa para saque : R$%.2f", Tarifa.SAQUE);
				System.out.printf("\nSaldo atual: R$%.2f ", conta.getSaldo());
				List<Conta> listContas = le.leitorContas();
				menuCC(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);

			} else {
				List<Conta> listContas = le.leitorContas();
				menuCC(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);
				System.out.println("\nValor inválido. Tente novamente!\n");
			}

		} catch (NullPointerException e) {
			List<Conta> listContas = le.leitorContas( );
			menuCC(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);
			System.out.println("\nValor inválido. Tente novamente!\n");
		}
	}


	////////////DEPOSITAR
	public void depositar(double valorDepositado, Conta conta) throws ContaException, IOException {
		try {
			Cliente cliente = new Cliente();
			Conta pessoa = cliente;

			if (conta.getSaldo() < (Tarifa.DEPOSITO + valorDepositado)) {
				conta.setSaldo(conta.getSaldo() + (valorDepositado - Tarifa.DEPOSITO));
				System.out.println("\nOperação realizada com sucesso!");
				System.out.printf("\nValor depositado: R$%.2f", valorDepositado);
				System.out.printf("\nTarifa para depósito: R$%.2f", Tarifa.DEPOSITO);
				System.out.printf("\nSaldo atual: R$%.2f", conta.getSaldo());
				List<Conta> listContas = le.leitorContas();
				menuCC(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);

			} else {
				List<Conta> listContas = le.leitorContas();
				menuCC(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);
				System.out.println("\nValor inválido. Tente novamente!\n");
			}

		} catch (NullPointerException e) {
			List<Conta> listContas = le.leitorContas();
			menuCC(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);
			System.out.println("\nValor inválido. Tente novamente!\n");
		}
	}


	////////////TRANSFERIR
	public void transferir(double valorTransferido, Conta conta) throws ContaException, IOException {
		try {
			Cliente cliente = new Cliente();
			Conta pessoa = cliente;

			if (conta.getSaldo() >= 0 || conta.getSaldo() > valorTransferido) {
				conta.setSaldo(conta.getSaldo() - valorTransferido - Tarifa.TRANSFERENCIA);
				System.out.println("\nOperação realizada com sucesso!");
				System.out.printf("\nValor transferido: R$%.2f", valorTransferido);
				System.out.printf("\nTarifa para transferência: R$%.2f", Tarifa.TRANSFERENCIA);
				System.out.printf("\nSaldo atual: R$%.2f", conta.getSaldo());
				List<Conta> listContas = le.leitorContas();
				menuCC(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);

			} else {
				System.out.println("\nValor inválido. Tente novamente\n");
				List<Conta> listContas = le.leitorContas();
				menuCC(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);
				System.out.println("\nValor inválido. Tente novamente!\n");
			}

		} catch (NullPointerException e) {
			List<Conta> listContas = le.leitorContas( );
			menuCC(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);
			System.out.println("Valor inválido. Tente novamente!");
		}
	}

	@Override
	public void menuCC() {
	}

	@Override
	public void menuCP() {
	}

	@Override
	public void menuFuncionario() throws ContaException {
	}

}
