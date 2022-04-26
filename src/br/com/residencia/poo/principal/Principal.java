package br.com.residencia.poo.principal;
import java.util.ArrayList;

import br.com.residencia.poo.io.LeituraEscrita;
import br.com.residencia.poo.pessoas.Cliente;
import br.com.residencia.poo.pessoas.Funcionario;
import br.com.residencia.poo.pessoas.Gerente;

public class Principal {

	public static void main(String[] args) {
		criarUsuario();
		
	}
	public static void criarUsuario(){
		Funcionario funcionario = new Funcionario(1254,"Fun01","123456", 1965.00, 0.15, "Atendente");
		System.out.println("\n==Funcionario== \n" + funcionario.toString());
 
		Gerente gerente = new Gerente(2456, "Geren01",
				"98741", 5551.91, 0.2, "Gerente Administrativo");
		System.out.println("\n==Gerente==\n"+ gerente.toString());

		Gerente G1 = new Gerente(6557, "Geren02",
				"388164", 6000.01, 0.2, "Gerente Operacional");
		System.out.println("\n==Gerente==\n" + G1.toString());
	}

}
