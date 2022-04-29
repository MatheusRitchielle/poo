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

		System.out.println("Área do Cliente\n\n *** Mucha Lucha Bank ***");
		System.out.println("\tDigite a operação desejada:");
		System.out.print("[1] Sacar\n[2] Depositar\n[3] Transferir\n[4] Consultar rendimentos \n[0] Sair\n--->: ");

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