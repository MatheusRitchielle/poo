package br.com.residencia.poo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import br.com.residencia.poo.contas.ContaCorrente;
import br.com.residencia.poo.enuns.TipoConta;

public class LeituraEscrita {

	final static String DIRETORIO = "./banco_dados/";
	final static String EXTENSAO = "infos.txt";

	public static void escritor() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva o nome do arquivo: ");
		String nomeArquivo = (sc.nextLine());
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(DIRETORIO + nomeArquivo + EXTENSAO));
		

		System.out.println("Escreva algo: ");
		String linha = (sc.nextLine());

		buffWrite.append(sc.nextLine()).toString();
		buffWrite.close();
		sc.close(); 
		
	}

	public static void leitor() throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(DIRETORIO + EXTENSAO));
		String linha;

		try {
			while (true) {
				linha = buffRead.readLine();
				if (linha != null) {
					System.out.println(linha);
				} else {
					break;
				}
			}
			buffRead.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado no caminho " + DIRETORIO + EXTENSAO);
		}
	}
//	String file = "C:\\Users\\Chermaut\\Documents\\java\\poo\\banco_dados\\infos.csv";
//	BufferedReader reader = null;
//	String linha = "";
//
//	try {
//		reader = new BufferedReader(new FileReader(file));
//		while ((linha = reader.readLine()) != null) {
//			String[] row = linha.split(",");
//			var teste = verificarTipoConta(row[2]);
//			System.out.print(teste);
//
//			if(teste == TipoConta.POUPANCA){
//			var conta = new ContaCorrente(Double.parseDouble(row[3]));
//			
//				System.out.println(conta.getValor());
//				
//			}
//		}
//	} catch (Exception e) {
//		e.printStackTrace();
//
//	} finally {
//		try {
//			reader.close();
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}
//
//	}
//
//}
//
//	private static TipoConta verificarTipoConta(String tipoConta) {
//	
//	if (tipoConta.equals("Corrente")) {
//		return TipoConta.CORRENTE;
//	} else {
//		return TipoConta.POUPANCA;
//
//	}
//
//}
}