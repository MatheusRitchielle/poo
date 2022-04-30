package br.com.residencia.poo.menu;

import java.io.IOException;

import br.com.residencia.poo.contas.ContaException;

public interface InterfaceMenu {

	
	String mostrarMenuCC = null; /// tem que ver essa merda

	void mostrarMenuPrincipal() throws ContaException, IOException;

	public void mostrarMenuFuncionario()throws ContaException;
	
	void mostrarMenuCC() throws ContaException;
	
	void mostrarMenuCP() throws ContaException;

	
}