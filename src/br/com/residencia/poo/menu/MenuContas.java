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

		System.out.println("\n�rea do Cliente:\n\n " + cliente.getCpf() + " seja bem-vindo ao Mucha Lucha Bank!");
		System.out.println("\tDigite a opera��o desejada:");
		System.out.println("\n[1] - Sacar\n[2] - Depositar\n[3] - Transferir\n[0] - Sair");

		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			System.out.print("Informe um valor para saque R$: ");
			Double valorSacado = sc.nextDouble();
			cc.sacar(valorSacado);
			break;
		case 2:
			System.out.print("Informe um valor para depositar R$: ");
			Double valorDepositado = sc.nextDouble();
			cc.depositar(valorDepositado);
			break;
		case 3:
			System.out.print("Informe um valor para transferir R$: ");
			Double valorTransferido = sc.nextDouble();
			cc.transferir(valorTransferido);
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



		System.out.println("\n\n�rea do Cliente\n\n " + cliente.getCpf() + " seja bem vindo ao Mucha Lucha Bank!");
		System.out.println("\tDigite a opera��o desejada:");
		System.out.println(
				"\n[1] - Sacar\n[2] - Depositar\n[3] - Transferir\n[4] - Simula��o de rendimentos \n[0] - Sair");

		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			System.out.print("Informe um valor para saque R$: ");
			Double valorSacado = sc.nextDouble();
			cp.sacar(valorSacado);
			break;
		case 2:
			System.out.print("Informe um valor para depositar R$: ");
			Double valorDepositado = sc.nextDouble();
			cp.depositar(valorDepositado);
			break;
		case 3:
			System.out.print("Informe um valor para saque R$: ");
			Double valorTransferido = sc.nextDouble();
			cp.transferir(valorTransferido);
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