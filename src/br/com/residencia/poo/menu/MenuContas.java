package br.com.residencia.poo.menu;

import java.util.Scanner;
import br.com.residencia.poo.contas.ContaCorrente;
import br.com.residencia.poo.contas.ContaException;
import br.com.residencia.poo.contas.ContaPoupanca;
import br.com.residencia.poo.pessoas.Cliente;

public class MenuContas implements InterfaceMenu {

	public void mostrarMenuCC() throws ContaException {

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
		default:
			System.exit(0);
			break;
		}

		sc.close();

	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public void mostrarMenuCP() throws ContaException {

		ContaPoupanca cp = new ContaPoupanca();
		Scanner sc = new Scanner(System.in);

		// * = Colocar o nome do cliente logado!

		System.out.println("�rea do Cliente\n\n * seja bem vindo ao Mucha Lucha Bank!");
		System.out.println("\tDigite a opera��o desejada:");
		System.out.println("[1] - Sacar\n2 - Depositar\n[3] - Transferir\n[4] - Consultar rendimentos \n[0] - Sair");

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
		default:
			System.exit(0);
			break;
		}
		sc.close();
	}

	@Override
	public void mostrarMenuCliente() throws ContaException {
		// TODO Auto-generated method stub

	}

	@Override
	public void mostrarMenuFuncionario() {
		// TODO Auto-generated method stub

	}
}