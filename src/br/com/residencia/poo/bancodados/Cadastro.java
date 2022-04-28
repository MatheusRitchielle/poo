package br.com.residencia.poo.bancodados;

import br.com.residencia.poo.agencias.Agencia;
import br.com.residencia.poo.contas.Conta;
import br.com.residencia.poo.pessoas.Cliente;
import br.com.residencia.poo.pessoas.Diretor;
import br.com.residencia.poo.pessoas.Funcionario;
import br.com.residencia.poo.pessoas.Gerente;
import br.com.residencia.poo.pessoas.Pessoa;
import br.com.residencia.poo.pessoas.Presidente;

public class Cadastro{
	
	public static Funcionario[] cadastroPresidente() {

		Funcionario p[] = new Presidente[1];
		p[0] = new Presidente(1, "Jorge", "01234567890", 40, "21985476314", "Rua A", "jorge@gamil.com", "10/05/1980",
				"Gerente", 001, "Jorge", "321", 1000.0, 40);
		return p;

	}
	
	public static Funcionario[] cadastroDiretor() {
		Funcionario d[] = new Diretor[2];

		d[0] = new Diretor(49, "Diretor 1", "12346578910", 45, "21910203040", "Rua V", "diretor1@gmail.com",
				"10/11/2000", "Diretor", 001, "Diretor1", "123", 5000.00, 001, 2, 0001);
		d[1] = new Diretor(50, "Diretor 2", "12346578910", 50, "21910203040", "Rua W", "diretor2@gmail.com",
				"10/11/2000", "Diretor", 002, "Diretor2", "123", 5000.00, 002, 2, 0002);
		return d;
	}

	public static Funcionario[] cadastroGerente() {
		Funcionario g[] = new Gerente[4];

//		g[0] = new Gerente(3, "Gerente 1", "12346578910", 50, "21910203040", "Rua C", "gerente1@gmail.com",
//				"10/11/2000", "Geremte", 001, "gerente1", "gerente1", 250.00, 0001);
//		g[1] = new Gerente(4, "Gerente 2", "12346578910", 45, "21910203040", "Rua D", "gerente2@gmail.com",
//				"10/11/2000", "Geremte", 002, "gerente2", "gerente4", 250.00, 0002);
//		g[2] = new Gerente(5, "Gerente 3", "12346578910", 40, "21910203040", "Rua E", "gerente3@gmail.com",
//				"10/11/2000", "Geremte", 003, "gerente3", "gerente3", 250.00, 0003);
//		g[3] = new Gerente(6, "Gerente 4", "12346578910", 35, "21910203040", "Rua F", "gerente4@gmail.com",
//				"10/11/2000", "Geremte", 004, "gerente4", "gerente4", 250.00, 0004);
		return g;
	}

	public static Pessoa[] cadastroCliente() {
		Pessoa addCliente[] = new Cliente[13];
//
//		addCliente[0] = new Cliente(7, "Cliente 1", "12346578910", 20, "21910203040", "Rua G", "cliente1@gmail.com",
//				"10/11/2001", "Cliente", 001, 001);
//		addCliente[1] = new Cliente(8, "Cliente 2", "12346578910", 25, "21910203040", "Rua H", "cliente2@gmail.com",
//				"10/11/2001", "Cliente", 002, 002);
//		addCliente[2] = new Cliente(9, "Cliente 3", "12346578910", 30, "21910203040", "Rua I", "cliente3@gmail.com",
//				"10/11/2001", "Cliente", 003, 003);
//		addCliente[3] = new Cliente(10, "Cliente 4", "12346578910", 35, "21910203040", "Rua J", "cliente4@gmail.com",
//				"10/11/2001", "Cliente", 004, 004);
//		addCliente[4] = new Cliente(11, "Cliente 5", "12346578910", 40, "21910203040", "Rua K", "cliente5@gmail.com",
//				"10/11/2001", "Cliente", 005, 001);
//		addCliente[5] = new Cliente(12, "Cliente 6", "12346578910", 45, "21910203040", "Rua L", "cliente6@gmail.com",
//				"10/11/2001", "Cliente", 006, 002);
//		addCliente[6] = new Cliente(13, "Cliente 7", "12346578910", 50, "21910203040", "Rua M", "cliente7@gmail.com",
//				"10/11/2001", "Cliente", 007, 003);
//		addCliente[7] = new Cliente(14, "Cliente 8", "12346578910", 55, "21910203040", "Rua N", "cliente8@gmail.com",
//				"10/11/2001", "Cliente", 010, 004);
//		addCliente[9] = new Cliente(15, "Cliente 9", "12346578910", 60, "21910203040", "Rua O", "cliente9@gmail.com",
//				"10/11/2001", "Cliente", 011, 001);
//		addCliente[10] = new Cliente(16, "Cliente 10", "12346578910", 65, "21910203040", "Rua P", "cliente10@gmail.com",
//				"10/11/2001", "Cliente", 012, 002);
//		addCliente[11] = new Cliente(17, "Cliente 11", "12346578910", 70, "21910203040", "Rua Q", "cliente11@gmail.com",
//				"10/11/2001", "Cliente", 013, 003);
		
		addCliente[12] = new Cliente("123", "123");
		return addCliente;
	}

	public static Agencia[] cadastroAgencia() {
		Agencia a[] = new Agencia[4];
		a[0] = new Agencia(1, 02, "Endereço J", 0001);
		a[1] = new Agencia(2, 01, "Endereço A", 0002);
		a[2] = new Agencia(3, 01, "Endereço V", 0003);
		a[3] = new Agencia(4, 01, "Endereço ", 0004);
		return a;

	}

	
}
