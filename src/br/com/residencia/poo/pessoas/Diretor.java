package br.com.residencia.poo.pessoas;

import java.util.ArrayList;
import java.util.List;

import br.com.residencia.poo.agencias.Agencia;

public class Diretor extends Funcionario{


	protected int idDiretor;
	protected int qtdAgencia;
	protected byte idAgencia;
	
	List<Agencia> agencias = new ArrayList<>();
	

	public Integer getIdDiretor() {
		return idDiretor;
	}

	public void setIdDiretor(Integer idDiretor) {
		this.idDiretor = idDiretor;
	}

	public Integer getQtdAgencia() {
		return qtdAgencia;
	}

	public void setQtdAgencia(Integer qtdAgencia) {
		this.qtdAgencia = qtdAgencia;
	}

	public int getIdAgencia() {
		return idAgencia;
	}

	public void setIdAgencia(int idAgencia) {
		this.idAgencia = (byte) idAgencia;
	}

	public List<Agencia> getAgencias() {
		return agencias;
	}

	public void setAgencias(List<Agencia> agencias) {
		this.agencias = agencias;
	}
	

}
