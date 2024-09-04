package com.starwars.app.java_starwars_app;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.starwars.app.java_starwars_app.interfaces.IHasLightSaber;

@SpringBootTest
public class PooTest {
    @Test
	void identity_test() {
		Jedi jedi1 = new Jedi();   
		jedi1.setName("Yoda");   
		
		Jedi jedi2 = new Jedi();   
		jedi2.setName("Yoda");
		
		Jedi jedi3 = jedi1;

		assertEquals(false, jedi1 == jedi2);
		assertEquals(false, jedi1.equals(jedi2));

		assertEquals(true, jedi1 == jedi3);

		jedi3.setName("Yoda 3");
		assertEquals("Yoda 3", jedi1.getName());

		
	}


	@Test
	void identity2_test() {
		Jedi jedi1 = new Jedi();   
		jedi1.setName("Yoda");   
		
		Jedi jedi2 = new Jedi();   
		jedi2.setName("Yoda");
		
		Jedi jedi3 = jedi1;

		assertEquals(false, jedi1 == jedi2);
		assertEquals(false, jedi1.equals(jedi2));

		assertEquals(true, jedi1 == jedi3);

		jedi3.setName("Yoda 3");
		assertEquals("Yoda 3", jedi1.getName());

		MasterJedi masterJedi1 = new MasterJedi();
		masterJedi1.setName("Master A");

		Jedi jedi4 = masterJedi1;

		Object obj1 = jedi4;
		Object obj2 = masterJedi1;
		
		//MasterJedi masterJedi2 = jedi1;
		MasterJedi masterJedi2 = (MasterJedi)obj1;
		assertEquals("Master A", masterJedi2.getName());
		
	}
}
