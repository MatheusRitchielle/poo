package br.com.residencia.poo.menu;

import java.util.Scanner;

public class Menu implements InterfaceMenu {

	public void mostrarMenuCliente() {

		Integer opcao;
		Scanner sc = new Scanner(System.in);

		System.out.println("Seja bem vindo ao Mucha Lucha Bank");
		System.out.println("[1] Acesse sua conta\n [2] Criar conta\n[3] Sair");
		opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		}
		sc.close();
	}

	public void mostrarMenuFuncionário() {
		//relatórios
	}

}
