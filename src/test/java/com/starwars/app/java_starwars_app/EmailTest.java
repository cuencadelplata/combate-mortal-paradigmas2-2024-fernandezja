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
}
