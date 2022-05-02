package br.com.residencia.poo.menu;

import java.io.IOException;

import br.com.residencia.poo.contas.ContaException;

public interface InterfaceMenu {

	
	String mostrarMenuCC = null;

	void mostrarMenuPrincipal() throws ContaException, IOException;

	void mostrarMenuCC() throws ContaException;
	
	void mostrarMenuCP() throws ContaException;

	void gerente() throws IOException, ContaException;

	void presidente() throws IOException, ContaException;

	void mostrarMenuFuncionario();

	
}