package br.com.residencia.poo.principal;

import br.com.residencia.poo.agencias.Agencia;

//import br.com.residencia.poo.enuns.TipoPessoa;
//import br.com.residencia.poo.io.LeituraEscrita;
import br.com.residencia.poo.pessoas.Cliente;
import br.com.residencia.poo.pessoas.Diretor;
import br.com.residencia.poo.pessoas.Funcionario;
import br.com.residencia.poo.pessoas.Gerente;
import br.com.residencia.poo.pessoas.Pessoa;
import br.com.residencia.poo.pessoas.Presidente;

public class Principal {
	
//	Conta conta = new ContaCorrente();
//	agencia.getContas().add(conta);
	
	public String idBanco = "171 - Mucha Lucha Bank"; 

	public static void main(String[] args) {
	}

	public void Cadastros() {
	
	Funcionario p[] = new Presidente[1];
	p [0] = new Presidente (001, "Jorge", "01234567890", 40, "21985476314", "Rua A", "jorge@gamil.com", "10/05/1980" , "Gerente", 001, "Jorge", "321", 1000.0, 40);
		
	Funcionario d[] = new Diretor[2];
	
	d[0] = new Diretor (49, "Diretor 1", "12346578910", 45, "21910203040", "Rua V", "diretor1@gmail.com","10/11/2000", "Diretor", 001, "Diretor1", "123", 5000.00, 001, 2, 0001);
	d[1] = new Diretor (50, "Diretor 2", "12346578910", 50, "21910203040", "Rua W", "diretor2@gmail.com","10/11/2000", "Diretor", 002, "Diretor2", "123", 5000.00, 002, 2, 0002);		
	
	Funcionario g[] = new Gerente[4];
	
	g[0] = new Gerente (003, "Gerente 1", "12346578910", 50, "21910203040", "Rua C", "gerente1@gmail.com", "10/11/2000", "Geremte", 001, "gerente1", "gerente1", 250.00,0001);
	g[1] = new Gerente (004, "Gerente 2", "12346578910", 45, "21910203040", "Rua D", "gerente2@gmail.com", "10/11/2000", "Geremte", 002, "gerente2", "gerente4", 250.00,0002);		
	g[2] = new Gerente (005, "Gerente 3", "12346578910", 40, "21910203040", "Rua E", "gerente3@gmail.com", "10/11/2000", "Geremte", 003, "gerente3", "gerente3", 250.00,0003);
	g[3] = new Gerente (006, "Gerente 4", "12346578910", 35, "21910203040", "Rua F", "gerente4@gmail.com", "10/11/2000", "Geremte", 004, "gerente4", "gerente4", 250.00,0004);
			
	Pessoa c[] = new Cliente[12];
	
    c[0] =  new Cliente (007, "Cliente 1", "12346578910", 20, "21910203040", "Rua G", "cliente1@gmail.com",	"10/11/2001", "Cliente", 001, 001);
    c[1] =  new Cliente (020, "Cliente 2", "12346578910", 25, "21910203040", "Rua H", "cliente2@gmail.com",	"10/11/2001", "Cliente", 002, 002);
    c[2] =  new Cliente (021, "Cliente 3", "12346578910", 30, "21910203040", "Rua I", "cliente3@gmail.com",	"10/11/2001", "Cliente", 003, 003);
    c[3] =  new Cliente (010, "Cliente 4", "12346578910", 35, "21910203040", "Rua J", "cliente4@gmail.com",	"10/11/2001", "Cliente", 004, 004);
    c[4] =  new Cliente (011, "Cliente 5", "12346578910", 40, "21910203040", "Rua K", "cliente5@gmail.com",	"10/11/2001", "Cliente", 005, 001);
    c[5] =  new Cliente (012, "Cliente 6", "12346578910", 45, "21910203040", "Rua L", "cliente6@gmail.com",	"10/11/2001", "Cliente", 006, 002);
    c[6] =  new Cliente (013, "Cliente 7", "12346578910", 50, "21910203040", "Rua M", "cliente7@gmail.com",	"10/11/2001", "Cliente", 007, 003);
    c[7] =  new Cliente (014, "Cliente 8", "12346578910", 55, "21910203040", "Rua N", "cliente8@gmail.com",	"10/11/2001", "Cliente", 010, 004);
    c[9] =  new Cliente (015, "Cliente 9", "12346578910", 60, "21910203040", "Rua O", "cliente9@gmail.com",	"10/11/2001", "Cliente", 011, 001);
    c[10] =  new Cliente (016, "Cliente 10", "12346578910", 65, "21910203040", "Rua P", "cliente10@gmail.com",	"10/11/2001", "Cliente", 012, 002);
    c[11] =  new Cliente (017, "Cliente 11", "12346578910", 70, "21910203040", "Rua Q", "cliente11@gmail.com",	"10/11/2001", "Cliente", 013, 003);
    
	Agencia a[] = new Agencia[4];
	a[0] = new Agencia(1, 02, "Endereço R", 0001);
	a[1] = new Agencia(2, 01, "Endereço S", 0002);
	a[2] = new Agencia(3, 01, "Endereço T", 0003);
	a[3] = new Agencia(4, 01, "Endereço U", 0004);
	
	}	
}
