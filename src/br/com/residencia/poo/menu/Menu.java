package br.com.residencia.poo.menu;

import java.util.Scanner;
import br.com.residencia.poo.contas.ContaException;

public class Menu implements InterfaceMenu {
	
	MenuContas menuContas = new MenuContas();
	
	public void mostrarMenu() throws ContaException {

		Scanner sc = new Scanner(System.in);

		System.out.print("\tSeja bem vindo ao Mucha Lucha Bank. \n"
				+ "Deseja acessar como:\n1 - Cliente\n2 - Funcionario\n0 - Sair \t");

		switch (sc.nextByte()) {
		case 1:
			mostrarMenuCliente();
		case 2:
			mostrarMenuFuncionario();
		default:
			System.exit(0);
		}
		sc.close();
	}


	@Override
	public void mostrarMenuCliente() throws ContaException {

		Scanner sc = new Scanner(System.in);

		Autenticador validator = new Autenticador();

		String login;
		String senha;

		System.out.println("\tMucha Lucha Bank");
		System.out.print("[1] Login\n" + "[2] Criar conta\n[3] Sair  ");

		switch (sc.nextByte()) {
		case 1:
			System.out.print("Digite seu login: ");
			login = (sc.next());
			System.out.print("Digite sua senha: ");
			senha = (sc.next());
			if (login != null && senha != null) {
				validator.autenticarLogin(login, senha);
			} else {
				System.out.println("Opção inválida!");
			}
			break;
		case 2:
			break;
		case 3:
			mostrarMenu();
		default:
			System.exit(0);
		}
		sc.close();
	}

	public void mostrarMenuFuncionario() throws ContaException {
		Scanner sc = new Scanner(System.in);
		Autenticador validator = new Autenticador();
		String login;
		String senha;

		System.out.println("\tMucha Lucha Bank");
		System.out.println("[1] Login\n" + "[2] Criar conta\n[3] Sair  ");
		switch (sc.nextByte()) {
		case 1:
			System.out.println("Digite seu login: ");
			login = (sc.next());
			System.out.println("Digite sua senha: ");
			senha = (sc.next());
			if (login != null && senha != null) {
				validator.autenticarFun(login, senha);
				menuContas.mostrarMenuCC();
			} else {
				System.out.println("Opção inválida!");
			}
			break;
		case 2:

			break;
		case 3:

			break;
		case 0:
			mostrarMenu();
		}
		sc.close();

	}

	@Override
	public void mostrarMenuCC() {
	}

	@Override
	public void mostrarMenuCP() {

	}


}
