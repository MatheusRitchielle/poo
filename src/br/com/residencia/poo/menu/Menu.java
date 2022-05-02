package br.com.residencia.poo.menu;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import br.com.residencia.poo.contas.Conta;
import br.com.residencia.poo.contas.ContaCorrente;
import br.com.residencia.poo.contas.ContaException;
import br.com.residencia.poo.contas.ContaPoupanca;
import br.com.residencia.poo.io.LeituraEscrita;
import br.com.residencia.poo.pessoas.Cliente;
import br.com.residencia.poo.pessoas.Pessoa;

public class Menu implements InterfaceMenu {

	int opcao;
	double inputValor;
	static String inputCpf;
	static String inputSenha;
	static int inputConta;
	static String inputTipoPessoa;
	static String inputTipoConta;
	
	
	Scanner sc = new Scanner(System.in);
	MenuContas menuContas = new MenuContas();
	LeituraEscrita le = new LeituraEscrita();
	Cliente cliente = new Cliente();
	Conta pessoa = cliente;

	public void clienteFuncionario() throws IOException, ContaException {

		System.out.println("\n\tMucha Lucha Bank");
		System.out.print("Deseja ter acesso ao menu de:\n\n[1] Cliente \n[2] Funcionário\n--->: ");
		opcao = sc.nextInt();
	
		switch (opcao) {
		case 1:
			inputTipoPessoa = "Cliente";
			Acessorio.velha();
			mostrarMenuPrincipal();
			break;
		case 2:
			inputTipoPessoa = "Funcionario";
			System.out.println("Menu de Fucionário");
			break;

		}

	}

	@Override
	public void mostrarMenuPrincipal() throws IOException, ContaException {

		System.out.println("\n\tMucha Lucha Bank");
		System.out.printf("\n[1] Login\n[2] Sair\n--->: ");
		int opcao = sc.nextInt();
		Acessorio.velha();
		
		switch (opcao) {
		case 1:
			cpfSenha();
			break;
		default:
			System.exit(0);
		}

	}

	public void cpfSenha() throws IOException, ContaException {

		ContaCorrente contaCorrente = new ContaCorrente();
		ContaPoupanca contaPoupanca = new ContaPoupanca();

		List<Pessoa> pessoaImportada = le.leitorPessoa("entrada.txt");

		System.out.print("Selecione uma opção:\n\n[1] Conta Corrente\n[2] Conta Poupança\n--->: ");
		inputConta = (sc.nextInt());
		Acessorio.velha();
		System.out.print("\nDigite seu CPF: ");
		inputCpf = (sc.next());
		System.out.print("Digite sua senha: ");
		inputSenha = (sc.next());
		Acessorio.velha();
		
		switch (inputConta) {
		case 1:
			inputTipoConta = "Corrente";
			for (Pessoa p : pessoaImportada) {
				if (p != null) {
					if (p.getSenha().equals(inputSenha) && p.getCpf().equals(inputCpf)) {
						List<Conta> listContas = le.leitorContas("entrada.txt");
						System.out.println("Bem vindo, " + p.getNome() + "!");
						contaCorrente.menuContaCorrente(p.getCpf(), p.getNumeroConta(), listContas);
					}

				}
			}
			System.out.println("\n\nUsuário ou senha inválidos =( \nTente novamente\n\n");
			cpfSenha();

			sc.close();
			break;
		case 2:
			for (Pessoa p : pessoaImportada) {
				if (p != null) {
					if (p.getSenha().equals(inputSenha) && p.getCpf().equals(inputCpf)) {
						List<Conta> listContas = le.leitorContas("entrada.txt");
						System.out.println("Bem vindo, " + p.getNome() + "!");
						contaPoupanca.menuContaPoupanca(p.getCpf(), p.getNumeroConta(), listContas);
						pessoa = p;
					}
				}
			}
			System.out.println("\n\nUsuário ou senha inválidos =( \nTente novamente\n\n");
			cpfSenha();
			sc.close();
		}
	}

	@Override
	public void mostrarMenuFuncionario() throws ContaException {

	}

	@Override
	public void mostrarMenuCC() throws ContaException {

	}

	@Override
	public void mostrarMenuCP() throws ContaException {

	}

}
