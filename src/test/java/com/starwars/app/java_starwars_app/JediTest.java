package com.starwars.app.java_starwars_app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.starwars.app.java_starwars_app.interfaces.IHasLightSaber;

@SpringBootTest
public class JediTest {

	@Test
	void jedi_with_blue_laser_test() {
		Jedi jedi1 = new Jedi();
		LightSaber lightSaber1 = new LightSaber("blue");

		jedi1.setLightSaber(lightSaber1);

		assertEquals(true, jedi1.hasLightSaber());
		assertEquals("blue", jedi1.getLightSaber().getColor());
	}

	@Test
	void jedi_with_red_laser_test() {
		Jedi jedi1 = new Jedi();
		LightSaber lightSaber1 = new LightSaber("red");

		jedi1.setLightSaber(lightSaber1);

		assertEquals(true, jedi1.hasLightSaber());
		assertEquals("red", jedi1.getLightSaber().getColor());
	}

	@Test
	void hasLightSaber_test() {
		Jedi jedi1 = new Jedi();

		assertEquals(false, jedi1.hasLightSaber());
	}

	 @Test
	void jedi_hasLightSaber_test() {
		Jedi jedi1 = new Jedi();  
		
		assertEquals(false, jedi1.hasLightSaber());

        IHasLightSaber objHasLightSaber1 = jedi1;
        assertEquals(false, objHasLightSaber1.hasLightSaber());

		String nombre = ((Jedi)objHasLightSaber1).getName();
	}

}
