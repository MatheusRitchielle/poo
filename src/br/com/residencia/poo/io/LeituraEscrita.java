package br.com.residencia.poo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.residencia.poo.contas.Conta;
import br.com.residencia.poo.contas.ContaCorrente;
import br.com.residencia.poo.contas.ContaPoupanca;
import br.com.residencia.poo.enuns.TipoConta;
import br.com.residencia.poo.enuns.TipoPessoa;
import br.com.residencia.poo.pessoas.Cliente;
import br.com.residencia.poo.pessoas.Diretor;
import br.com.residencia.poo.pessoas.Gerente;
import br.com.residencia.poo.pessoas.Pessoa;
import br.com.residencia.poo.pessoas.Presidente;

public class LeituraEscrita {

	static final String DIRETORIO = "./temp/";
	static final String EXTENSAO = "entrada.txt";

	static List<ContaCorrente> contaCorrenteList = new ArrayList<>();
	static List<ContaPoupanca> contaPoupancaList = new ArrayList<>();
	static List<Presidente> presidenteList = new ArrayList<>();
	static List<Diretor> diretorList = new ArrayList<>();
	static List<Gerente> gerenteList = new ArrayList<>();
	static List<Cliente> clienteList = new ArrayList<>();

	public Conta lerContas(String[] dados) {
		
		boolean isContaCorrente = (dados[0].equalsIgnoreCase(TipoConta.CORRENTE.getTipoConta()));
		boolean isContaPoupanca = (dados[0].equalsIgnoreCase(TipoConta.POUPANCA.getTipoConta()));
		
		Conta conta = null;

		if (isContaCorrente) {
			ContaCorrente contaCorrente = new ContaCorrente(dados[0], Integer.parseInt(dados[1]), Integer.parseInt(dados[2]), Double.parseDouble(dados[3]), dados[4]);
			contaCorrenteList.add(contaCorrente);
			conta = contaCorrente;
		}

		if (isContaPoupanca) {
			ContaPoupanca contaPoupanca = new ContaPoupanca(dados[0], Integer.parseInt(dados[1]), Integer.parseInt(dados[2]), Double.parseDouble(dados[3]), dados[4]);
			contaPoupancaList.add(contaPoupanca);
			conta = contaPoupanca;
		}
	return conta;
	}


	
	public List<Conta> leitorContas() throws IOException{
		BufferedReader buffRead = new BufferedReader(new FileReader(DIRETORIO + EXTENSAO));
		
		String linha = "";
		List<Conta> conta = new ArrayList<>();
		Conta c = null;
		String[] dados = null;
		while (true) {
			linha = buffRead.readLine();
			
			if (linha != null) {
			dados = linha.split(";");
			 c = lerContas(dados);
			 conta.add(c);
			}
			else {
				break;
			}
			//buffRead.close();
		}
		return conta;
	}
	
	public List<Pessoa> leitorPessoa () throws IOException {

		BufferedReader buffRead = new BufferedReader(new FileReader(DIRETORIO + EXTENSAO));
		
		String linha = "";
		
		List<Pessoa> lista = new ArrayList<>();
		Pessoa p = null;
		String[] dados = null;
		while (true) {
			linha = buffRead.readLine();
			
			if (linha != null) {
			dados = linha.split(";");
			 p = lerPessoa(dados);
			 lista.add(p);
			}
			else {
				break;
			}
			//buffRead.close();
		}
		return lista;
	}

	
	public Pessoa lerPessoa(String[] dados) {

		Pessoa pessoa = null;
		
		boolean isPessoaPresidente = (dados[0].equalsIgnoreCase(TipoPessoa.PRESIDENTE.getTipoUsuario()));
		boolean isPessoaGerente = (dados[0].equalsIgnoreCase(TipoPessoa.GERENTE.getTipoUsuario()));
		boolean isPessoaDiretor = (dados[0].equalsIgnoreCase(TipoPessoa.DIRETOR.getTipoUsuario()));
		boolean isPessoaCliente = (dados[0].equalsIgnoreCase(TipoPessoa.CLIENTE.getTipoUsuario()));

		if (isPessoaPresidente) {				
			Presidente presidente = new Presidente(dados[0], dados[1], dados[2], dados[3], Integer.parseInt(dados[4]), Integer.parseInt(dados[5]), Double.parseDouble(dados[6]));
			presidenteList.add(presidente);
			pessoa = presidente;
		}

		if (isPessoaGerente) {					 
			Gerente gerente = new Gerente(dados[0], dados[1], dados[2], dados[3], Integer.parseInt(dados[4]), Integer.parseInt(dados[5]), Double.parseDouble(dados[6]));
			gerenteList.add(gerente);
			pessoa = gerente;
		}

		if (isPessoaDiretor) {
			Diretor diretor = new Diretor(dados[0], dados[1], dados[2], dados[3], Integer.parseInt(dados[4]), Integer.parseInt(dados[5]), Double.parseDouble(dados[6]));
			diretorList.add(diretor);
			pessoa = diretor;
		}
		if (isPessoaCliente) {
			Cliente cliente = new Cliente(dados[0], dados[1], dados[2], dados[3], Integer.parseInt(dados[4]),Integer.parseInt(dados[5]));
			clienteList.add(cliente);
			pessoa = cliente;
		}
		return pessoa;

	}

	public static void comprovanteSaque(Conta conta, double valorSaque) throws IOException {
		String nomeArquivo = conta.getCpf() + "_" + conta.getNumeroAgencia() + "_" + conta.getNumeroConta()
				+ "_transacoes";
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(DIRETORIO + nomeArquivo + EXTENSAO));

		String linha = "*************** SAQUE ***************";
		buffWrite.append(linha + "\n");

		linha = "CPF: " + conta.getCpf();
		buffWrite.append(linha + "\n");

		linha = "Agência: " + conta.getNumeroAgencia();
		buffWrite.append(linha + "\n");

		linha = "Conta: " + conta.getNumeroConta();
		buffWrite.append(linha + "\n");

		linha = "Valor: R$" + valorSaque;
		buffWrite.append(linha + "\n");

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		linha = "Operação realizada em: " + simpleDateFormat.format(date);
		buffWrite.append(linha + "\n");

		linha = "*************** FIM DO SAQUE ***************";
		buffWrite.append(linha + "\n\n");

		buffWrite.close();

	}

	}
