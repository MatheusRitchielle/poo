package br.com.residencia.poo.menu;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import br.com.residencia.poo.contas.ContaException;
import br.com.residencia.poo.io.LeituraEscrita;
import br.com.residencia.poo.pessoas.Funcionario;
import br.com.residencia.poo.pessoas.Pessoa;
import br.com.residencia.poo.pessoas.Usuario;

public class Menu implements InterfaceMenu {

	double inputValor;
	static String inputCpf;
	static String inputSenha;

	Scanner sc = new Scanner(System.in);
	MenuContas menuContas = new MenuContas();
	LeituraEscrita le = new LeituraEscrita();
	
	
	@Override
	public void mostrarMenuPrincipal() throws ContaException, IOException {
		MenuContas menuContas = new MenuContas();
		System.out.println("\n\tMucha Lucha Bank");
		System.out.printf("\n[1] Login\n[2] Sair\n--->: ");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			
			List<Pessoa> pessoaImportada = le.leitorPessoa("entrada.txt");

			System.out.print("Digite seu CPF: ");
			inputCpf = (sc.next());
			System.out.print("Digite sua senha: ");
			inputSenha = (sc.next());
			for (Pessoa p : pessoaImportada) {
				if (p != null) {
					if (p.getSenha().equals(inputSenha) && p.getCpf().equals(inputCpf)) {
						menuContas.mostrarMenuCC(p.getCpf(),p.getSenha());
					}
				}
			}

			
			Usuario usuario = Usuario.mapaUsuarios.get(inputCpf);

			while (usuario == null) {
				
				
				System.out.println("CPF e/ou Senha incorreto(s)\n\n");
				System.out.print("Digite seu login: ");
				inputCpf = (sc.next());
				System.out.print("Digite sua senha: ");
				inputSenha = (sc.next());

				usuario = Usuario.mapaUsuarios.get(inputCpf);

				//conta = Conta.mapaContas.get(inputCpf);

				
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
