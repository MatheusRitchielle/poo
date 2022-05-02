package br.com.residencia.poo.contas;

public class ContaException extends Exception {

	static final long serialVersionUID = 0; //gerar serial
	
	public ContaException() {
		super();
	}
	
	public ContaException(String message) {
		super(message);
	}
	
	public ContaException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public ContaException(Throwable cause) {
		super(cause);
	}	
	
}