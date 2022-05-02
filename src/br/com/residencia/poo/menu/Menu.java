package br.com.residencia.poo.menu;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import br.com.residencia.poo.contas.Conta;
import br.com.residencia.poo.contas.ContaCorrente;
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
	MenuContas menuContas;
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
						System.out.println("\nBem vindo(a), " + p.getNome() + 
								"!");
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
				System.out.println("\n\nError 404 not found\n\nRedirecionando...");
				menuPrincipal();
				break;
		}
		sc.close();
	}

	///////////MENU CONTA CORRENTE
	public void menuCC(String usuario, int conta, List<Conta> contas) throws ContaException, IOException {

		Cliente cliente = new Cliente();
		Scanner sc = new Scanner(System.in);
		Conta tipoConta = null;

		for (Conta c : contas) {
			if (c != null) {
				if (c.getNumeroConta() == conta) {
					tipoConta = c;
				}
			}
		}
		System.out.printf("\nSaldo: R$%.2f", tipoConta.getSaldo());
		System.out.print(
				"\n---------------------------\n"
				+ "Digite a operação desejada:\n"
				+ "[1] Sacar\n"
				+ "[2] Depositar\n"
				+ "[3] Transferir\n"
				+ "[0] Sair");
				System.out.print("\n===========================\n--->: ");


		switch (sc.nextInt()) {
		case 1:
			System.out.print("\nInforme um valor para sacar R$: ");
			inputValor= (sc.nextDouble());
			tipoConta.sacar(inputValor);
			menuCC(usuario, conta, contas);

		break;

		case 2:
			System.out.print("\nInforme um valor para depositar R$: ");
			inputValor = (sc.nextDouble());
			tipoConta.depositar(inputValor);
			menuCC(usuario, conta, contas);
			break;

		case 3:
			System.out.print("\nInforme um valor para transferir R$: ");
			inputValor = (sc.nextDouble());
			tipoConta.transferir(inputValor);
			menuCC(usuario, conta, contas);
			break;

		case 0:
			menuPrincipal();
			break;
			default: 
				System.out.println("\n\nError 404 not Found!\nRedirecionando...");
				menuPrincipal();
		}
		
		sc.close();
	}


	@Override
	public void menuCP() {
		}

	@Override
	public void menuFuncionario() throws ContaException {
	}


}
