package br.com.residencia.poo.menu;

import br.com.residencia.poo.bancodados.Cadastro;
import br.com.residencia.poo.contas.Conta;
import br.com.residencia.poo.pessoas.Cliente;
import br.com.residencia.poo.pessoas.Funcionario;
import br.com.residencia.poo.pessoas.Gerente;
import br.com.residencia.poo.pessoas.Pessoa;

public class Autenticador extends Cadastro {

	
	public static void main(String[] args) {
		Pessoa p1[] = Cadastro.cadastroCliente();
		
		for (Pessoa pessoa: p1) {
			System.out.println(pessoa);
		}
	}
	
	public boolean autenticarLogin(String login, String senha) {
		Pessoa p[] = new Cliente[2];
		p[0] = new Cliente("123", "123");
		p[1] = new Cliente("1234", "1234");
		Pessoa cliente = new Cliente();
		for (Pessoa pessoa : p) {
			if (pessoa.getCpf().equals(login)) {
				cliente.setCpf(pessoa.getCpf());
				cliente.setSenha(pessoa.getSenha());
			}
		}
		if (login.equals(cliente.getCpf()) && senha.equals(cliente.getSenha())) {
			System.out.println("Acesso permitido!");

			return true;
		} else {
			System.out.println("Acesso negado!" + cliente.getCpf());
			return false;
		}
	}

	public boolean autenticarFun(String login, String senha) {
		Funcionario g[] = new Gerente[1];

		g[0] = new Gerente("teste", "teste");
		Pessoa gerente = new Gerente();
		
		for (Funcionario gerentes : g) {
			if (gerente.getCpf().equals(login)) {
				gerente.setCpf(gerente.getCpf());
				gerente.setSenha(gerente.getSenha());
			}
		}
		if (login.equals(gerente.getCpf()) && senha.equals(gerente.getSenha())) {
			System.out.println("Acesso permitido!");

			return true;
		} else {
			System.out.println("Acesso negado!" + gerente.getCpf());
			return false;
		}
	}

}
