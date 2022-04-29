package br.com.residencia.poo.principal;

import br.com.residencia.poo.contas.ContaException;
import br.com.residencia.poo.menu.Menu;

public class Principal {
		
	
	public static void main(String[] args) throws ContaException { 
	
	Menu menu = new Menu();
	menu.mostrarMenu();

	}
	
}
