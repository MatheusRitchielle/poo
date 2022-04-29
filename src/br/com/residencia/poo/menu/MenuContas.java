package br.com.residencia.poo.menu;

import java.util.Scanner;
import br.com.residencia.poo.contas.ContaCorrente;
import br.com.residencia.poo.contas.ContaException;
import br.com.residencia.poo.contas.ContaPoupanca;

public class MenuContas implements InterfaceMenu {

	
	public void mostrarMenuCC() throws ContaException {

		ContaCorrente c1 = new ContaCorrente();
		Scanner sc = new Scanner(System.in);

		// * = Colocar o nome do cliente logado!

		System.out.println("\tDigite a opera��o desejada:");
		System.out.print("[1] Sacar\n[2] Depositar\n[3] Transferir\n[0] Sair\n--->: ");

		try {
			int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			c1.sacar(0.0);
			break;
		case 2:
			c1.depositar(0.0);
			break;
		case 3:
			c1.transferir(0.0);
			break;
		default:
			System.exit(0);
		break;
		}

		
		sc.close();
	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Eram as chavees que estavam erradas....
	@Override
	public void mostrarMenuCP() throws ContaException {

		ContaPoupanca c1 = new ContaPoupanca();
		Scanner sc = new Scanner(System.in);

		// * = Colocar o nome do cliente logado!

		System.out.println("Ol�, Cliente!");
		System.out.println("\tDigite a opera��o desejada:");
		System.out.print("[1] Sacar\n[2] Depositar\n[3] Transferir\n[4] Consultar rendimentos \n[0] Sair \n--->: ");

		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:

			c1.sacar(0.0);

		case 2:

			c1.depositar(0.0);

		case 3:

			c1.transferir(0.0);

		case 4:

			c1.render(0, 0);

		default:

			System.exit(0);

		}
		sc.close();
	}


	@Override
	public void mostrarMenuCliente() {		
	}


	@Override
	public void mostrarMenuFuncionario() {		
	}
}