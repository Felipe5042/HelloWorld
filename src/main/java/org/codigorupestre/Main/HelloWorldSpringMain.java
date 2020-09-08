package org.codigorupestre.Main;
import java.util.logging.Logger;

import org.codigorupestre.model.Cliente;
import org.codigorupestre.model.Tarjeta;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class HelloWorldSpringMain {

	private final static Logger LOGGER=Logger.getLogger(HelloWorldSpringMain.class.getName());
	
	
public static void main(String[] args){
	LOGGER.info(":::Inicio de Contexto :::");
	
	ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
	Cliente cliente=null;
	//cliente=appContext.getBean("pago");
	
	cliente=appContext.getBean("pago",Cliente.class);
	

	cliente.RealizarPago(cliente.getTarjeta());
	cliente.EnviarnotificacionEmail();
	cliente.EnviarnotiificacionSMS();
	
	
	
	LOGGER.info(":::Termina de Contexto :::");
	
}
}
