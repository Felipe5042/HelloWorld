package org.codigorupestre.model;

import java.util.logging.Logger;

public class Cliente {

	private final static Logger LOGGER = Logger.getLogger(Cliente.class.getName());
	private String Nombre;
	private String Email;
	private String Telefono;
	private Tarjeta tarjeta;
	
	public void RealizarPago(Tarjeta tarjeta) {
		LOGGER.info("Realizo Pago:"+Nombre);
		
		LOGGER.info("Entidad Bancaria"+tarjeta.getBanco());
		LOGGER.info("Número de Tarjeta"+tarjeta.getNumero());
	}
	
	public void EnviarnotificacionEmail() {
		LOGGER.info("Se envia Email:"+Email);
		
	}
	
	public void EnviarnotiificacionSMS() {
		LOGGER.info("Se envia Notificación:"+Telefono);
	}

	
	
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	

	
	}

	

	


	
	
	

