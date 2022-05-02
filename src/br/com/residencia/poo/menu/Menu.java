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
	double saldoAcumulado;

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
			gdp();
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

	public void gdp() throws IOException, ContaException {

		System.out.println("\n\tMucha Lucha Bank");
		System.out.print("\n\n[1] Gerente \n[2] Diretor \n[3] Presidente\n--->: ");
		opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			Acessorio.velha();
			gerente();
			break;

		case 2:
			Acessorio.velha();
			diretor();
			break;

		case 3:
			Acessorio.velha();
			presidente();
			break;
		}

	}

	public void diretor() throws IOException, ContaException {

		List<Pessoa> pessoaImportada = le.leitorPessoa("entrada.txt");
		List<Conta> contaImportada = le.leitorContas("entrada.txt");

		System.out.println("\n\tMucha Lucha Bank");
		System.out.print("Digite seu CPF: ");
		String cpf = sc.next();
		System.out.print("Digite sua senha: ");
		String senha = sc.next();
		Acessorio.velha();

		for (Pessoa p : pessoaImportada) {
			if (p != null) {
				if (p.getSenha().equals(senha) && p.getCpf().equalsIgnoreCase(cpf)) {
					System.out.println("Bem vindo, " + p.getNome() + "!");

					switch (p.getNumeroAgencia()) {
					case 201:
						try {
							for (Conta c : contaImportada) {
								if (c.getNumeroAgencia() == 201) {
									System.out.println(c);
								}
							}
						} catch (NullPointerException e) {
							clienteFuncionario();
						}
						break;

					case 202:
						try {
							for (Conta c : contaImportada) {
								if (c.getNumeroAgencia() == 202) {
									System.out.println(c);
								}
							}
						} catch (NullPointerException e) {
							clienteFuncionario();
						}
						break;

					case 203:
						try {
							for (Conta c : contaImportada) {

								if (c.getNumeroAgencia() == 203) {
									System.out.println(c);
								}
							}
						} catch (NullPointerException e) {
							clienteFuncionario();
						}
						break;

					case 204:
						try {
							for (Conta c : contaImportada) {
								if (c.getNumeroAgencia() == 204) {
									System.out.println(c);
								}
							}
						} catch (NullPointerException e) {
							clienteFuncionario();
						}
						break;

					default:
						System.exit(0);
					}
				}
			}
		}
	}

	@Override
	public void gerente() throws IOException, ContaException {

		List<Pessoa> pessoaImportada = le.leitorPessoa("entrada.txt");
		List<Conta> contaImportada = le.leitorContas("entrada.txt");

		System.out.println("\n\tMucha Lucha Bank");
		System.out.print("Digite seu CPF: ");
		String cpf = sc.next();
		System.out.print("Digite sua senha: ");
		String senha = sc.next();
		Acessorio.velha();

		for (Pessoa p : pessoaImportada) {
			if (p != null) {
				if (p.getSenha().equals(senha) && p.getCpf().equalsIgnoreCase(cpf)) {
					System.out.println("Bem vindo, " + p.getNome() + "!");

					switch (p.getNumeroAgencia()) {
					case 201:
						try {
							for (Conta c : contaImportada) {
								if (c.getNumeroAgencia() == 201) {
									System.out.println(c);
								}
							}
						} catch (NullPointerException e) {
							clienteFuncionario();
						}
						break;

					case 202:
						try {
							for (Conta c : contaImportada) {
								if (c.getNumeroAgencia() == 202) {
									System.out.println(c);
								}
							}
						} catch (NullPointerException e) {
							clienteFuncionario();
						}
						break;

					case 203:
						try {
							for (Conta c : contaImportada) {

								if (c.getNumeroAgencia() == 203) {
									System.out.println(c);
								}
							}
						} catch (NullPointerException e) {
							clienteFuncionario();
						}
						break;

					case 204:
						try {
							for (Conta c : contaImportada) {
								if (c.getNumeroAgencia() == 204) {
									System.out.println(c);
								}
							}
						} catch (NullPointerException e) {
							clienteFuncionario();
						}
						break;

					default:
						System.exit(0);
					}
				}
			}
		}
	}

	@Override
	public void presidente() throws IOException, ContaException {

		List<Pessoa> pessoaImportada = le.leitorPessoa("entrada.txt");
		List<Conta> contaImportada = le.leitorContas("entrada.txt");

		System.out.println("\n\tMucha Lucha Bank");
		System.out.print("Digite seu CPF: ");
		String cpf = sc.next();
		System.out.print("Digite sua senha: ");
		String senha = sc.next();
		Acessorio.velha();

		for (Pessoa p : pessoaImportada) {
			if (p != null) {
				if (p.getSenha().equals(senha) && p.getCpf().equalsIgnoreCase(cpf)) {
					System.out.println("Bem vindo, " + p.getNome() + "!");
						
					switch (p.getNumeroAgencia()) {
					case 171:
						try {
							for (Conta c : contaImportada) {
								if (c.getNumeroAgencia() == 201 || c.getNumeroAgencia() == 202 || c.getNumeroAgencia() == 203 || c.getNumeroAgencia() == 204) {
									System.out.println(c);
									saldoAcumulado = saldoAcumulado + c.getSaldo();
								}
							}	
						} catch (NullPointerException e) {
							System.out.printf("\nO saldo acumulado é de R$:%.2f \n", saldoAcumulado);
							clienteFuncionario();
						}
						break;
						
					default:
						System.exit(0);
					}
				}
			}
		}
	}

	public void cpfSenha() throws IOException, ContaException {

		ContaCorrente contaCorrente = new ContaCorrente();
		ContaPoupanca contaPoupanca = new ContaPoupanca();

		List<Pessoa> pessoaImportada = le.leitorPessoa("entrada.txt");
		List<Conta> contaImportada = le.leitorContas("entrada.txt");

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
		case 4:

			for (Conta c : contaImportada) {
				if (c.getNumeroAgencia() == 201) {
					System.out.println(c);
				}
			}

		}

	}

	@Override
	public void mostrarMenuCC() throws ContaException {

	}

	@Override
	public void mostrarMenuCP() throws ContaException {

	}

	@Override
	public void mostrarMenuFuncionario() {		
	}

}
