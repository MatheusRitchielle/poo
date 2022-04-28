package br.com.residencia.poo.menu;

import java.util.Scanner;

import br.com.residencia.poo.bancodados.Cadastro;
import br.com.residencia.poo.pessoas.Cliente;
import br.com.residencia.poo.pessoas.Pessoa;

public class Menu implements InterfaceMenu {

	// Menu Principal
	public void mostrarMenu() {

		Scanner sc = new Scanner(System.in);

		System.out.print("\tSeja bem vindo ao Mucha Lucha Bank. \n"
				+ "Deseja acessar como:\n1 - Cliente\n2 - Funcionario\n0 - Sair");

		switch (sc.nextByte()) {
		case 1:
			mostrarMenuCliente();
		case 2:
			mostrarMenuFuncionário();
		default:
			System.exit(0);

		}
		sc.close();
	}

	public void mostrarMenuCliente() {
		Scanner sc = new Scanner(System.in);
		Cadastro c = new Cadastro();
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
				// Método de autenticar
				validator.autenticarLogin(login, senha);
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

	public void mostrarMenuFuncionário() {
		Scanner sc = new Scanner(System.in);
		Cadastro c = new Cadastro();
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
				// Método de autenticar
				validator.autenticarFun(login, senha);
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

}
