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

	int opcao;
	double inputValor;
	static String inputCpf;
	static String inputSenha;

	Scanner sc = new Scanner(System.in);
	MenuContas menuContas = new MenuContas();
	LeituraEscrita le = new LeituraEscrita();
	Cliente cliente = new Cliente();
	Conta pessoa = cliente;
	////////////////////////////////////// LOGIN
	@Override
	public void mostrarMenuPrincipal() throws IOException, ContaException {

		System.out.println("\n\tMucha Lucha Bank");
		System.out.printf("\n[1] Login\n[2] Sair\n--->: ");
		int opcao = sc.nextInt();
		cpfSenha(opcao);
	}	
	
	public void cpfSenha(int opcao) throws IOException, ContaException {
		if (opcao == 1) {
			List<Pessoa> pessoaImportada = le.leitorPessoa("entrada.txt");
			Pessoa pessoa = null;
			System.out.print("Digite seu CPF: ");
			inputCpf = (sc.next());
			System.out.print("Digite sua senha: ");
			inputSenha = (sc.next());
			
			for (Pessoa p : pessoaImportada) {
				if (p != null) {
					if (p.getSenha().equals(inputSenha) && p.getCpf().equals(inputCpf)) {
						List<Conta> listContas = le.leitorContas("entrada.txt");
						System.out.println("Bem vindo, " + cliente.getCpf() + "!");
						mostrarMenuCC(p.getCpf(), p.getNumeroConta(), listContas);
						pessoa = p;
					}
				
				}
			}
			System.out.println("\n\nUsuário ou senha inválidos =( \nTente novamente\n\n");
			cpfSenha(opcao);
		}
		sc.close();
	}
	////////////////////////////////////// FIM LOGIN
	public void mostrarMenuCC(String usuario, int conta, List<Conta> contas) throws ContaException, IOException {

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

		System.out.printf("\n\n\n\nDigite a operação desejada:\n[1] Sacar\n[2] Depositar\n[3] Transferir\n[0] Sair\n--->: ");
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
			
		case 0:
			System.exit(0);
			break;
		}
		sc.close();
	}
	
	////////////////////////////////////// SACAR
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
				List<Conta> listContas = le.leitorContas("entrada.txt");
				mostrarMenuCC(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);

			} else {
				List<Conta> listContas = le.leitorContas("entrada.txt");
				mostrarMenuCC(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);
				System.out.println("\nValor inválido. Tente novamente!\n");
			}
			
		} catch (NullPointerException e) {
			List<Conta> listContas = le.leitorContas("entrada.txt");
			mostrarMenuCC(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);
			System.out.println("\nValor inválido. Tente novamente!\n");
		}
	}
	////////////////////////////////////// FIM SACAR

	////////////////////////////////////// DEPOSITAR
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
				List<Conta> listContas = le.leitorContas("entrada.txt");
				mostrarMenuCC(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);
			
			} else {
				List<Conta> listContas = le.leitorContas("entrada.txt");
				mostrarMenuCC(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);
				System.out.println("\nValor inválido. Tente novamente!\n");
			}
			
		} catch (NullPointerException e) {
			List<Conta> listContas = le.leitorContas("entrada.txt\n");
			mostrarMenuCC(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);
			System.out.println("\nValor inválido. Tente novamente!\n");
		}
	}
	////////////////////////////////////// FIM DEPOSITAR

	////////////////////////////////////// TRANSFERIR
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
				List<Conta> listContas = le.leitorContas("entrada.txt");
				mostrarMenuCC(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);

			} else {
				System.out.println("\nValor inválido. Tente novamente\n");
				List<Conta> listContas = le.leitorContas("entrada.txt");
				mostrarMenuCC(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);
				System.out.println("\nValor inválido. Tente novamente!\n");
			}
	
		} catch (NullPointerException e) {
			List<Conta> listContas = le.leitorContas("entrada.txt");
			mostrarMenuCC(pessoa.getCpf(), pessoa.getNumeroConta(), listContas);
			System.out.println("Valor inválido. Tente novamente!");
		}
	}
	//////////////////////////////////// FIM TRANSFERIR

	@Override
	public void mostrarMenuCC() {
	}

	@Override
	public void mostrarMenuCP() {
	}

	@Override
	public void mostrarMenuFuncionario() throws ContaException {
	}

}
