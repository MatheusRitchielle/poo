package br.com.residencia.poo.menu;

import java.util.List;
import java.util.Scanner;

import br.com.residencia.poo.contas.Conta;
import br.com.residencia.poo.contas.ContaCorrente;
import br.com.residencia.poo.contas.ContaException;
import br.com.residencia.poo.pessoas.Cliente;


public class MenuContas implements InterfaceMenu {
	
	Cliente cliente = new Cliente();

	public void mostrarMenuCC(String usuario, int conta,List<Conta> contas) throws ContaException {
		
		ContaCorrente cc = new ContaCorrente();
		Cliente cliente = new Cliente();
		Scanner sc = new Scanner(System.in);
		
		Conta contaFuncionario = null;
		for (Conta c : contas) {
			if (c != null) {
				if (c.getNumeroConta() == conta) {
					contaFuncionario = c;
				}
			}
		}
		
		//INTERAÇÃO CLIENTE
		System.out.printf("\nBem vindo, " + cliente.getCpf() + "."
				+ "\nDigite a operação desejada:\n"
				+ "[1] Sacar\n[2] "
				+ "Depositar\n[3] "
				+ "Transferir\n[0] Sair\n--->: ");

		
		int opcao = sc.nextInt();
		Double inputValor;
		switch (opcao) {
		case 1:	
			System.out.print("\nInforme um valor para sacar R$: ");
			inputValor = Double.parseDouble(sc.next());
			cc.sacar(inputValor, contaFuncionario);
//			LeituraEscrita.comprovanteSaque(conta, inputValor);
			break;
		case 2:
			System.out.print("\nInforme um valor para depositar R$: ");
			inputValor = Double.parseDouble(sc.next());
			cc.depositar(inputValor);
//			LeituraEscrita.comprovanteSaque(conta, inputValor);
			break;
		case 3:
			System.out.print("\nInforme um valor para transferir R$: ");
			inputValor = Double.parseDouble(sc.next());
			cc.transferir(inputValor);
//			LeituraEscrita.comprovanteSaque(conta, inputValor);

			break;
		case 0:
			default:
			System.exit(0);
			break;
		}

		sc.close();

	}


	@Override
	public void mostrarMenuFuncionario() {
	}

	@Override
	public void mostrarMenuPrincipal() throws ContaException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mostrarMenuCC() throws ContaException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mostrarMenuCP() throws ContaException {
		// TODO Auto-generated method stub
		
	}

}