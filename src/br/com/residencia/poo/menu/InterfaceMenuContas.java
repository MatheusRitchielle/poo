package br.com.residencia.poo.menu;

import br.com.residencia.poo.contas.ContaException;

public interface InterfaceMenuContas {

	void mostrarMenuCC() throws ContaException;
	
	void mostrarMenuCP() throws ContaException;
	
}