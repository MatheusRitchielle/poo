package br.com.residencia.poo.contas;

import br.com.residencia.poo.pessoas.Gerente;

public class ControleConta {
	
	
	public void abrirConta(String tipo) {
		setTipoConta(tipo);
		setConta(true);
		if (tipo == "CC") {
			this.setSaldo(50);
		} else if (tipo == "CP") {
			this.setSaldo(150);
		}

	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta com débito");
		} else {
			this.setConta(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}


	public static void criarUsuario(){
		//Funcionario funcionario = new Funcionario(1254,"Fun01","123456", 1965.00, 0.15, "Atendente");
		//System.out.println("\n==Funcionario== \n" + funcionario.toString());
 
		Gerente gerente = new Gerente(2456, "Geren01",
				"98741", 5551.91, 0.2, "Gerente Administrativo");
		System.out.println("\n==Gerente==\n"+ gerente.toString());

		Gerente G1 = new Gerente(6557, "Geren02",
				"388164", 6000.01, 0.2, "Gerente Operacional");
		System.out.println("\n==Gerente==\n" + G1.toString());
}
