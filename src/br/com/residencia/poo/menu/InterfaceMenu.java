package br.com.residencia.poo.menu;

import br.com.residencia.poo.contas.ContaException;

public interface InterfaceMenu {
	
	public void mostrarMenuCliente() throws ContaException;
	
	public void mostrarMenuFuncionario()throws ContaException;
	
	void mostrarMenuCC() throws ContaException;
	
	void mostrarMenuCP() throws ContaException;
	
}