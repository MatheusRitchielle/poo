package br.com.residencia.poo.menu;

import java.util.Scanner;
import br.com.residencia.poo.contas.ContaCorrente;
import br.com.residencia.poo.contas.ContaException;
import br.com.residencia.poo.contas.ContaPoupanca;

public abstract class MenuContas implements InterfaceMenuContas {

	@Override
	public void mostrarMenuCC() throws ContaException {

		ContaCorrente c1 = new ContaCorrente();
		Scanner sc = new Scanner(System.in);

		// * = Colocar o nome do cliente logado!
		System.out.println("Área do Cliente:\n\n *Fulano,* seja bem-vindo ao Mucha Lucha Bank!");

		System.out.println("\tDigite a operação desejada:");
		System.out.println("[1] - Sacar\n2 - Depositar\n[3] - Transferir\n[0] - Sair");

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

		// Ela ta com uma classe "SistemaInterno"
		sc.close();
		// agora parecer que foi?
	}


/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Eram as chavees que estavam erradas....
	@Override
	public void mostrarMenuCP() throws ContaException {

		ContaPoupanca c1 = new ContaPoupanca();
		Scanner sc = new Scanner(System.in);

		// * = Colocar o nome do cliente logado!

		System.out.println("Área do Cliente\n\n * seja bem vindo ao Mucha Lucha Bank!");
		System.out.println("\tDigite a operação desejada:");
		System.out.println("[1] - Sacar\n2 - Depositar\n[3] - Transferir\n[4] - Consultar rendimentos \n[0] - Sair");

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
}