package br.com.residencia.poo.pessoas;

import java.sql.Date;
import java.util.concurrent.atomic.AtomicInteger;

import br.com.residencia.poo.contas.Conta;

public class Pessoa extends Conta {

	private static final AtomicInteger count = new AtomicInteger(0);
	protected Integer id;
	protected int idade;
	protected String genero;
	protected String estadoCivil;
	protected String nome;
	protected String cpf;
	protected String telefone;
	protected String endereco;
	protected String email;
	protected Date dataNascimento;
	protected String tipoPessoa;

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public int getId() {
		return this.id = count.incrementAndGet();
	}

	public void setIdate(int idade) {
		this.idade = idade;
	}
}
