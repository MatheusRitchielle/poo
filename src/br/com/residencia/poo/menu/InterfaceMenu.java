package br.com.residencia.poo.menu;

import br.com.residencia.poo.contas.ContaException;

public interface InterfaceMenu {
	
	public void mostrarMenuCliente() throws ContaException;
	
<<<<<<< HEAD
	public void mostrarMenuFuncionario() throws ContaException;
=======
	public void mostrarMenuFuncionario()throws ContaException;
>>>>>>> 09a63da95f6988c64086e51b923f0cf9a19382f0
	
	void mostrarMenuCC() throws ContaException;
	
	void mostrarMenuCP() throws ContaException;
	
}