package br.com.residencia.poo.menu;

import java.util.Scanner;

public class Menu {

	    public void mostrarMenu() {

	        Integer opcao;
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Seja bem vindo ao Mucha Lucha Bank");
	        System.out.println("[1] Acesse sua conta\n [2] Criar conta\n[3] Sair");
	        opcao = sc.nextInt();
	        switch (opcao) {
	        case 1:
	            //acesso();
	            break;
	        case 2:
	        //    criarConta();
	            break;
	        case 3:
	        //    sair();
	            break;
	        }

	    }
	}
	



}
