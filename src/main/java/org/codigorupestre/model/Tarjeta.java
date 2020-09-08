package org.codigorupestre.model;

public class Tarjeta {
	
	private String Banco;
	private String Numero;
	
	public Tarjeta() {
		
	}
	
	public Tarjeta(String banco, String numero) {
		super();
		Banco = banco;
		Numero = numero;
	}

	public String getBanco() {
		return Banco;
	}

	public void setBanco(String banco) {
		Banco = banco;
	}

	public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		Numero = numero;
	}
	
	
	

}
