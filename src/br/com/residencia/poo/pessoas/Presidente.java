package br.com.residencia.poo.pessoas;

import java.util.ArrayList;
import java.util.List;

public class Presidente extends Funcionario{
		
	Integer idPresidente;
	List<Diretor> diretores = new ArrayList<>();
	
	public Presidente() {
		super();
	}
	
	public Presidente(int id, String login, String senha, double salario, String cargo) {
		super(id, login, senha, salario, cargo);
	}
	
}
