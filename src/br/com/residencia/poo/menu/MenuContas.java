package br.com.residencia.poo.menu;

import java.util.Scanner;
import br.com.residencia.poo.contas.ContaCorrente;
import br.com.residencia.poo.contas.ContaException;
import br.com.residencia.poo.contas.ContaPoupanca;
import br.com.residencia.poo.pessoas.Cliente;

public class MenuContas implements InterfaceMenu {
	
	Cliente cliente = new Cliente();

	public void mostrarMenuCC() throws ContaException {
		Menu menu = new Menu();
		ContaCorrente cc = new ContaCorrente();
		Cliente cliente = new Cliente();
		Scanner sc = new Scanner(System.in);

		System.out.println("\nBem vindo, " + cliente.getCpf() + ".");
		System.out.println("\nDigite a operação desejada:");
		System.out.print("[1] Sacar\n[2] Depositar\n[3] Transferir\n[0] Sair\n--->: ");

		switch (sc.nextByte()) {
		case 1:
			System.out.print("Informe um valor para saque R$: ");
			cc.sacar(sc.nextDouble());
			break;
		case 2:
			System.out.print("Informe um valor deposito R$: ");
			cc.depositar(sc.nextDouble());
			break;
		case 3:
			System.out.print("Informe um valor para transferir R$: ");
			cc.transferir(sc.nextDouble());
			break;
		case 0:
			menu.mostrarMenu();
		default:
			System.exit(0);
			break;
		}

		sc.close();

	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public void mostrarMenuCP() throws ContaException {
		
		Menu menu = new Menu();
		ContaPoupanca cp = new ContaPoupanca();
		Scanner sc = new Scanner(System.in);


<<<<<<< HEAD
		System.out.println("Área do Cliente\n\n *** Mucha Lucha Bank ***");
		System.out.println("\tDigite a operação desejada:");
		System.out.print("[1] Sacar\n[2] Depositar\n[3] Transferir\n[4] Consultar rendimentos \n[0] Sair\n--->: ");
=======

		System.out.println("\n\nÁrea do Cliente\n\n " + cliente.getCpf() + " seja bem vindo ao Mucha Lucha Bank!");
		System.out.println("\tDigite a operação desejada:");
		System.out.println(
				"\n[1] - Sacar\n[2] - Depositar\n[3] - Transferir\n[4] - Simulação de rendimentos \n[0] - Sair");
>>>>>>> 09a63da95f6988c64086e51b923f0cf9a19382f0

		switch (sc.nextByte()) {
		case 1:
			System.out.print("Informe um valor para saque R$: ");
			cp.sacar(sc.nextDouble());
			break;
		case 2:
			System.out.print("Informe um valor para depositar R$: ");
			cp.depositar(sc.nextDouble());
			break;
		case 3:
			System.out.print("Informe um valor para saque R$: ");
			cp.transferir(sc.nextDouble());
			break;
		case 4:
			System.out.print("Informe um valor de aporte: R$");
			Double aporte = sc.nextDouble();
			System.out.print("Informe a quantidade de dias: ");
			int qtdDias = sc.nextInt();
			cp.render(aporte, qtdDias);
			break;
		case 0:
			menu.mostrarMenu();
		default:
			System.exit(0);
			break;
		}
		sc.close();
	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void mostrarMenuFuncionario() {
	}

	@Override
	public void mostrarMenuCliente() throws ContaException {
	}

}