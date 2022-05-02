package br.com.residencia.poo.principal;

import java.io.IOException;
import br.com.residencia.poo.contas.ContaException;
import br.com.residencia.poo.io.LeituraEscrita;
import br.com.residencia.poo.menu.Menu;

public class Principal {
	
	public static void main(String[] args) throws ContaException, IOException {

		Menu menu = new Menu();
		LeituraEscrita leituraEscrita = new LeituraEscrita();
		leituraEscrita.leitorContas("entrada.txt");	
		menu.clienteFuncionario();
	}
}