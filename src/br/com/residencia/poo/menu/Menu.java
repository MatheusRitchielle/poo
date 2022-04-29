package br.com.residencia.poo.menu;

import java.util.Scanner;

import br.com.residencia.poo.bancodados.Cadastro;
import br.com.residencia.poo.contas.ContaException;
import br.com.residencia.poo.pessoas.Cliente;
import br.com.residencia.poo.pessoas.Pessoa;
import br.com.residencia.poo.principal.Principal;
import br.com.residencia.poo.menu.MenuContas;

public class Menu implements InterfaceMenu {

	// Menu Principal
	public void mostrarMenu() throws ContaException {

		Scanner sc = new Scanner(System.in);

		System.out.print("\t*** Bem vindo ao Mucha Lucha Bank *** \n"
				+ "Digite as opções de\n[1] Cliente\n[2] Funcionario\n[0] Sair\n--->: ");
	
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

	@Override
	public void mostrarMenuCliente() throws ContaException {
		
		Scanner sc = new Scanner(System.in);
		Cadastro c = new Cadastro();
		
		Autenticador validator = new Autenticador();
		
		String login;
		String senha;

		System.out.println("\t=== Mucha Lucha Bank ===");
		System.out.println("[1] Login");
		System.out.println("[2] Crie sua conta");
		System.out.print("[3] Sair \n-->: ");
		
		switch (sc.nextByte()) {
			
		case 1:
			System.out.print("Digite seu login: ");
			login = (sc.next());
			System.out.print("Digite sua senha: ");
			senha = (sc.next());
			if (login != null && senha != null) {
				// Método de autenticar
				validator.autenticarLogin(login, senha);
				mostrarMenuCC();
			} else {
				System.out.println("Opção inválida!");
			}
		break;

		case 2:		
			
		mostrarMenuCP();
		break;
		}

	}
		
	public void mostrarMenuFuncionário() throws ContaException {
		Scanner sc = new Scanner(System.in);
		Cadastro c = new Cadastro();
		Autenticador validator = new Autenticador();
		String login;
		String senha;

		System.out.println("\tMucha Lucha Bank");
		System.out.print("[1] Login\n" + "[2] Criar conta\n[3] Sair \n-->: ");
		switch (sc.nextByte()) {
		case 1:
			System.out.print("Digite seu login: ");
			login = (sc.next());
			System.out.print("Digite sua senha: ");
			senha = (sc.next());
			if (login != null && senha != null) {
				// Método de autenticar
				validator.autenticarFun(login, senha);
				
			} else {
			}
		
			System.out.println("Opção inválida!");
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mostrarMenuCP() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mostrarMenuFuncionario() {
		// TODO Auto-generated method stub
		
	}

}
