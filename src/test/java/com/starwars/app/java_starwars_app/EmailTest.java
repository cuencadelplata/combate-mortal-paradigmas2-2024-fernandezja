package com.starwars.app.java_starwars_app;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.starwars.app.java_starwars_app.interfaces.IHasLightSaber;

@SpringBootTest
public class EmailTest {

    @Test
	void debe_crear_un_email_simple() {

		var remitente = new Contacto("remitente1@ucp.edu.ar");

		var email1 = new Email(remitente);        
		email1.setAsunto("Test 1");  

		var destinatario1 = new Contacto("contacto1@ucp.edu.ar");
		email1.getDestinatarios().add(destinatario1);

		assertEquals("Test 1", email1.getAsunto());
		assertEquals("remitente1@ucp.edu.ar", email1.getRemitente().getEmail());
		//assertEquals("contacto1@ucp.edu.ar", email1.getDestinatarios()[0].getEmail());

	}

	@Test
	void filtrarPorAsunto_se_debe_poder_filtrar_emails_con_asunto() {

		var bandejaEntrada = new Bandeja();

		var email1 = generarEmailSimple("Demo 1");
		var email2 = generarEmailSimple("Demo 2");
		var email3 = generarEmailSimple("Demo 3");
		var email4 = generarEmailSimple("Demo 2 v2.0");
		
		bandejaEntrada.add(email1);
		bandejaEntrada.add(email2);
		bandejaEntrada.add(email3);
		bandejaEntrada.add(email4);

		var asuntoParaFiltrar = "Demo 2";

		var emailsFiltrados = bandejaEntrada.filtrarPorAsunto(asuntoParaFiltrar);

		assertEquals(2, emailsFiltrados.size());

	}


	
	@Test
	void filtrar_se_debe_poder_filtrar_por_asunto() {

		var bandejaEntrada = new Bandeja();

		var email1 = generarEmailSimple("Demo 1");
		var email2 = generarEmailSimple("Demo 2");
		var email3 = generarEmailSimple("Demo 3");
		var email4 = generarEmailSimple("Demo 2 v2.0");
		
		bandejaEntrada.add(email1);
		bandejaEntrada.add(email2);
		bandejaEntrada.add(email3);
		bandejaEntrada.add(email4);

		var asuntoParaFiltrar = "Demo 2";

		var filtro = bandejaEntrada.generarFiltroPorAsunto(asuntoParaFiltrar);

		var emailsFiltrados = bandejaEntrada.filtrar(filtro);

		assertEquals(2, emailsFiltrados.size());

	}


	/*
	@Test
	void filtrar_se_debe_poder_filtrar_por_asunto() {

		var bandejaEntrada = new Bandeja();

		var email1 = generarEmailSimple("Demo 1");
		var email2 = generarEmailSimple("Demo 2");
		var email3 = generarEmailSimple("Demo 3");
		var email4 = generarEmailSimple("Demo 2 v2.0");
		
		bandejaEntrada.add(email1);
		bandejaEntrada.add(email2);
		bandejaEntrada.add(email3);
		bandejaEntrada.add(email4);

		var asuntoParaFiltrar = "Demo 2";

		var filtro1 = bandejaEntrada.generarFiltroPorAsunto(asuntoParaFiltrar);
		var filtro2 = bandejaEntrada.generarFiltroPorDestinatario(asuntoParaFiltrar);

		var filtroCompuesto = filtro1.and.filtro2;

		var emailsFiltrados = bandejaEntrada.filtrar(filtroCompuesto);

		assertEquals(2, emailsFiltrados.size());

	}
	*/

	private Email generarEmailSimple(String asunto){

		var remitente = new Contacto("remitente1@ucp.edu.ar");

		var email1 = new Email(remitente);        
		email1.setAsunto(asunto);  

		var destinatario1 = new Contacto("contacto1@ucp.edu.ar");
		email1.getDestinatarios().add(destinatario1);

		return email1;
	}


	@Test
	void enviar_email_simple() {

		var emailManager = new EmailManager();

		var email1 = generarEmailSimple("Demo 1");
		
		emailManager.enviar(email1);

		var xxx = emailManager.getXXX("remitente1@ucp.edu.ar");
		var emailEnviado = xxx.getBandejaEnviados().get(0);

		assertEquals("Demo 1", emailEnviado.getAsunto());

		var yyyy = emailManager.getXXX("contacto1@ucp.edu.ar");
		var emailRecibido = yyyy.getBandejaEntrada().get(0);

		assertEquals("Demo 1", emailRecibido.getAsunto());


		

	}


	@Test
	void los_filtros_son_carpetas() {

		var emailManager = new EmailManager();

		var xxx = emailManager.getXXX("remitente1@ucp.edu.ar");
		
		xxx.agregarCarpeta("correos de la UCP", filtro);

		var emailsDeLaUCP = xxx.getEmailsDesdeCarpeta("correos de la UCP");

		assertEquals(10, emailsDeLaUCP.size());


		

	}



}
