package br.com.residencia.poo.menu;

import br.com.residencia.poo.contas.ContaException;

public interface InterfaceMenu {
	
	String mostrarMenuCC = null; /// tem que ver essa merda

	void mostrarMenuPrincipal() throws ContaException;

	public void mostrarMenuFuncionario()throws ContaException;
	
	void mostrarMenuCC() throws ContaException;
	
	void mostrarMenuCP() throws ContaException;

	
}