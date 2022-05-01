package br.com.residencia.poo.menu;

import java.io.IOException;

import br.com.residencia.poo.contas.ContaException;

public interface InterfaceMenu {

	
	String mostrarMenuCC = null; /// tem que ver essa merda

	void menuPrincipal() throws ContaException, IOException;

	public void menuFuncionario()throws ContaException;
	
	void menuCC() throws ContaException;
	
	void menuCP() throws ContaException;

	
}