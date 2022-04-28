package br.com.residencia.poo.pessoas;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Presidente extends Funcionario{
	private static final AtomicInteger count = new AtomicInteger(0); 
	
	Integer idPresidente;
	List<Diretor> diretores = new ArrayList<>();
		
	public Presidente(String login, String senha) {
		super(login, senha);
		
	}

}
