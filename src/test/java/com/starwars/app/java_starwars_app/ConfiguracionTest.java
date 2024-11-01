package com.starwars.app.java_starwars_app;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.starwars.app.java_starwars_app.interfaces.IHasLightSaber;

@SpringBootTest
public class ConfiguracionTest {
    @Test
	void robot_test() {
		Configuracion config1 = Configuracion.getInstancia();      

		assertNotNull(config1);

		Configuracion config2 = Configuracion.getInstancia(); 
		
		assertNotNull(config2);

		
		assertEquals(config1, config2);

	}
}
