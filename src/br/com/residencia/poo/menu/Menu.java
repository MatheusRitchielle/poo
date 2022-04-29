package br.com.residencia.poo.menu;

import java.util.Scanner;

import br.com.residencia.poo.contas.Conta;
import br.com.residencia.poo.contas.ContaException;
import br.com.residencia.poo.pessoas.Usuario;

public class Menu implements InterfaceMenu {

	double inputValor;
	static String inputCpf;
	public String inputSenha;

	Scanner sc = new Scanner(System.in);
	MenuContas menuContas = new MenuContas();

	@Override
	public void mostrarMenuPrincipal() throws ContaException {

		System.out.println("\n\tMucha Lucha Bank");
		System.out.printf("\n[1] Login\n" + 
		"[2] Sair\n--->: ");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			System.out.print("Digite seu login: ");
			inputCpf = (sc.next());
			System.out.print("Digite sua senha: ");
			inputSenha = (sc.next());

			Usuario usuario = Usuario.mapaUsuarios.get(inputCpf);

			Conta conta = Conta.mapaContas.get(inputCpf);

			while (usuario == null || !(usuario.getSenha().equalsIgnoreCase(inputSenha))) {
				System.out.println("CPF e/ou Senha incorreto(s)\n\n");
				System.out.print("Digite seu login: ");
				inputCpf = (sc.next());
				System.out.print("Digite sua senha: ");
				inputSenha = (sc.next());

				usuario = Usuario.mapaUsuarios.get(inputCpf);

				conta = Conta.mapaContas.get(inputCpf);

				
			}
			menuContas.mostrarMenuCC(inputCpf, inputSenha);
			case 2: 
			
			break;
		}
		sc.close();
	}

	@Override
	public void mostrarMenuCC() {
	}

	@Override
	public void mostrarMenuCP() {

	}

	@Override
	public void mostrarMenuFuncionario() throws ContaException {
		// TODO Auto-generated method stub
		
	}

}
