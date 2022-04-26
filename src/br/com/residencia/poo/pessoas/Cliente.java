package br.com.residencia.poo.pessoas;

import java.sql.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Cliente extends Pessoa {
	private static final AtomicInteger count = new AtomicInteger(0); 
	Integer id;
	Integer idGerente;
	
	public Integer getId() {
		return this.id = count.incrementAndGet();
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdGerente() {
		return idGerente;
	}
	public void setIdGerente(Integer idGerente) {
		this.idGerente = idGerente;
	}
	
}
