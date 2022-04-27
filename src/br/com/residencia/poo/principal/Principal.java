package br.com.residencia.poo.principal;
import java.util.ArrayList;
import java.util.List;

import br.com.residencia.poo.agencias.Agencia;
import br.com.residencia.poo.enuns.TipoPessoa;
import br.com.residencia.poo.io.LeituraEscrita;
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
	
	p[0] = new Presidente (001, "32672203711", "789", 7000.00, "Presidente");
		
	Funcionario d[] = new Diretor[2];
	
	d[0] = new Diretor (002, "João" , "82648122723", "456");
	d[1] = new Diretor (003, "Maria", "98733482162", "456");		
	
	Funcionario g[] = new Gerente[4];
	
	g[0] = new Gerente (002, "João", "82648122723", "456");
	g[1] = new Gerente (002, "João", "82648122723", "456");		
	g[2] = new Gerente (002, "João", "82648122723", "456");
	g[3] = new Gerente (002, "João", "82648122723", "456");
			
	Pessoa c[] = new Cliente[12];
	
    c[0] =  new Cliente (025, "João" ,"66484326320", "456");
    c[1] =  new Cliente (045, "Oswaldo","43392574279", "456");
    c[2] =  new Cliente (010, "Joana","72608868207", "456");
    c[3] =  new Cliente (011, "Fernanda","11260434001", "456");
    c[4] =  new Cliente (012, "Anna","87517757350", "456");
    c[5] =  new Cliente (013, "Josvaldo","38878432156", "456");
    c[6] =  new Cliente (014, "Maria","65947512354", "456");
    c[7] =  new Cliente (015, "João","89421354879", "456");
    c[9] =  new Cliente (017, "Carlos","30214879562", "456");
    c[10] =  new Cliente (023, "Alberto","48132548793", "456");
    c[11] =  new Cliente (020, "Carla","21548756235", "456");
	
	Agencia a[] = new Agencia[4];
	a[0] = new Agencia(1, 01, "Endereço 01", 0001);
	a[1] = new Agencia(1, 01, "Endereço 01", 0001);
	a[2] = new Agencia(1, 01, "Endereço 01", 0001);
	a[3] = new Agencia(1, 01, "Endereço 01", 0001);
	
	}	
}
