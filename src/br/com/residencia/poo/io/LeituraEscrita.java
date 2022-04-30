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
	static final String EXTENSAO = ".txt";

	static List<ContaCorrente> contaCorrenteList = new ArrayList<>();
	static List<ContaPoupanca> contaPoupancaList = new ArrayList<>();
	static List<Presidente> presidenteList = new ArrayList<>();
	static List<Diretor> diretorList = new ArrayList<>();
	static List<Gerente> gerenteList = new ArrayList<>();
	static List<Cliente> clienteList = new ArrayList<>();

	public static void lerContas(String[] dados) {
		
		boolean isContaCorrente = (dados[0].equalsIgnoreCase(TipoConta.CORRENTE.getTipoConta()));
		boolean isContaPoupanca = (dados[0].equalsIgnoreCase(TipoConta.POUPANCA.getTipoConta()));

		if (isContaCorrente) {
			ContaCorrente contaCorrente = new ContaCorrente(dados[0], Integer.parseInt(dados[1]),
					Integer.parseInt(dados[2]), Double.parseDouble(dados[3]), dados[4]);
			contaCorrenteList.add(contaCorrente);
		}

		if (isContaPoupanca) {
			ContaPoupanca contaPoupanca = new ContaPoupanca(dados[0], Integer.parseInt(dados[1]),
					Integer.parseInt(dados[2]), Double.parseDouble(dados[3]), dados[4]);
			contaPoupancaList.add(contaPoupanca);
		}
	
	}

	public static void leitor(String path) throws IOException {
		
		BufferedReader buffRead = new BufferedReader(new FileReader(DIRETORIO + path));
		
		String linha = "";
		
		List<ContaCorrente> contaCorrenteList = new ArrayList<>();
		List<ContaPoupanca> contaPoupancaList = new ArrayList<>();
		List<Presidente> presidenteList = new ArrayList<>();
		List<Diretor> diretorList = new ArrayList<>();
		List<Gerente> gerenteList = new ArrayList<>();
		List<Cliente> clienteList = new ArrayList<>();

		while (true) {
			linha = buffRead.readLine();
			
			if (linha != null) {
				String[] dados = linha.split(";");
				lerContas(dados);
	
			}
			else {
				break;
			}
			//buffRead.close();
		}
	}

	public List<Pessoa> leitorPessoa (String path) throws IOException {

		BufferedReader buffRead = new BufferedReader(new FileReader(DIRETORIO + path));
		
		String linha = "";
		
//		List<ContaCorrente> contaCorrenteList = new ArrayList<>();
//		List<ContaPoupanca> contaPoupancaList = new ArrayList<>();
//		List<Presidente> presidenteList = new ArrayList<>();
//		List<Diretor> diretorList = new ArrayList<>();
//		List<Gerente> gerenteList = new ArrayList<>();
//		List<Cliente> clienteList = new ArrayList<>();
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

//		
//				else if (dados[0].equalsIgnoreCase(TipoPessoa.CLIENTE.getTipoUsuario())) {
//					// TIPO, NOME, CPF, SENHA, AGÊNCIA, NÚMERO DA CONTA
//
//					Usuario cliente = new Usuario(dados[0], dados[1], dados[2], dados[3], Integer.parseInt(dados[4]),
//							Integer.parseInt(dados[5]));
//
//					Usuario.mapaUsuarios.put(dados[2], cliente);
//					Usuario.OrdenaUsuarios.put(dados[1], cliente);
//
//				} else if (dados[0].equalsIgnoreCase(TipoPessoa.GERENTE.toString())) {
//
//					// TIPO, NOME, CPF, SENHA,
//
//					Usuario gerente = new Usuario(dados[0], dados[1], dados[2], dados[3], Integer.parseInt(dados[4]),
//							Integer.parseInt(dados[5]));
//							(dados[0], dados[1], dados[2], dados[3], Integer.parseInt(dados[4]),
//							Integer.parseInt(dados[5]), Double.parseDouble(dados[6]), Integer.parseInt(dados[7]));
//
//					Usuario.mapaUsuarios.put(dados[2], gerente);
//					Usuario.OrdenaUsuarios.put(dados[1], gerente);
//
//				}
//			} else {
//				break;
//			}
//		}
//		buffRead.close();
//
//	}
//
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
//
//	public static void relatorioContasPorAgencia(Conta conta) throws IOException {
//
//		String nomeArquivo = conta.getCpf() + "_" + conta.getNumeroAgencia() + "_" + conta.getNumeroConta()
//				+ "_contas_por_agencia";
//
//		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(DIRETORIO + nomeArquivo + EXTENSAO));
//
//		int totalContas = 0;
//
//		String linha = "********************** INFORMAÇÕES DO RESPONSÁVEL **********************";
//		buffWrite.append(linha + "\n\n");
//
//		linha = "CPF: " + conta.getCpf();
//		buffWrite.append(linha + "\n");
//
//		linha = "Agência : " + conta.getNumeroAgencia();
//		buffWrite.append(linha + "\n");
//
//		linha = "*******************************************************";
//		buffWrite.append(linha + "\n\n");
//
//		linha = "*************** TOTAL DE CONTAS NA MESMA AGÊNCIA ***************";
//		buffWrite.append(linha + "\n\n");
//
//		for (String cpf : Conta.mapaContas.keySet()) {
//			if (Conta.mapaContas.get(cpf).getNumeroAgencia().equals(conta.getNumeroAgencia())) {
//
//				linha = "CPF: " + Conta.mapaContas.get(cpf).getCpf();
//				buffWrite.append(linha + "\n");
//
//				linha = "Agência : " + Conta.mapaContas.get(cpf).getNumeroAgencia();
//				buffWrite.append(linha + "\n");
//
//				linha = "Conta: " + Conta.mapaContas.get(cpf).getNumeroConta();
//				buffWrite.append(linha + "\n");
//
//				totalContas++;
//
//				linha = "**********************************";
//				buffWrite.append(linha + "\n");
//			}
//
//		}
//
//		linha = "Total de contas: " + totalContas;
//		buffWrite.append(linha + "\n");
//
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		Date date = new Date();
//		linha = "Operação realizada em: " + simpleDateFormat.format(date);
//		buffWrite.append(linha + "\n");
//
//		linha = "************************************************************************";
//		buffWrite.append(linha + "\n\n");
//
//		buffWrite.close();
//
//	}
//
//	public static void relatorioTotalCapital(Conta conta, Map<String, Conta> mapaContas) throws IOException {
//
//		String nomeArquivo = conta.getCpf() + "_" + conta.getNumeroAgencia() + "_" + conta.getNumeroConta()
//				+ "_total_capital";
//
//		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(DIRETORIO + nomeArquivo + EXTENSAO, true));
//
//		double saldoTotal = 0.0;
//
//		String linha = "************************* TOTAL DE CAPITAL ARMAZENADO *************************";
//		buffWrite.append(linha + "\n\n");
//
//		for (String cpf : Conta.mapaContas.keySet()) {
//
//			saldoTotal += Conta.mapaContas.get(cpf).getSaldo();
//
//		}
//
//		linha = "O total de capital armazenado no banco é de: R$" + saldoTotal;
//		buffWrite.append(linha + "\n");
//
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		Date date = new Date();
//		linha = "Operação realizada em: " + simpleDateFormat.format(date);
//		buffWrite.append(linha + "\n");
//
//		linha = "*******************************************************************************";
//		buffWrite.append(linha + "\n\n");
//
//		buffWrite.close();
//
//	}
//
//	public static void comprovanteSaque(String conta, Double inputValor) {
//		// TODO Auto-generated method stub
//
//	}

}