package com.starwars.app.java_starwars_app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.starwars.app.java_starwars_app.interfaces.IHasLightSaber;

import java.util.*;
import java.util.stream.Stream;
import java.util.function.Predicate; 

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


	@Test
	void jedi_filter_endWith00Counter_test() {

		ArrayList<Jedi> jedis = new ArrayList<Jedi>();
	
		for (int i = 0; i < 10000; i++) {
			jedis.add(new Jedi("Jedi " + i));
			
		}
		
		assertEquals(10000, jedis.size());

		long endWith00Counter = jedis.stream()
									.filter(j -> j.getName().endsWith("00"))
									.count();	

		assertEquals(99, endWith00Counter);
			


	}


	

	@Test
	void jedi_filter_jedisWithLongerNames_test() {

		var jedis = new ArrayList<Jedi>();
	
		for (int i = 0; i < 10000; i++) {
			jedis.add(new Jedi("Jedi " + i));
			
		}
		
		assertEquals(10000, jedis.size());

		Stream<Jedi> jedisWithLongerNames = jedis.stream()
												.sorted((a, b) -> b.getName().compareTo(a.getName()))
												.limit(2);

		// Stream<Jedi> jedisWithLongerNames = jedis.stream()
		// 										.sorted((a, b) -> {
		// 											return b.getName().length() >
		// 										})

		// 										.limit(2);
		
			


		assertEquals("Jedi 9999", jedisWithLongerNames.findFirst().get().getName());
	}


	
	@Test
	void jedi_filter_endWith00Counter_predicate_test() {

		ArrayList<Jedi> jedis = new ArrayList<Jedi>();
	
		for (int i = 0; i < 10000; i++) {
			jedis.add(new Jedi("Jedi " + i));
			
		}

		Predicate<Jedi> filterEndWith00 = j -> j.getName().endsWith("00");
		
		assertEquals(10000, jedis.size());

		long endWith00Counter = jedis.stream()
									.filter(filterEndWith00)
									.count();	

		assertEquals(99, endWith00Counter);


		Predicate<Jedi> filterNameContain1000 = j -> j.getName().endsWith("1000");
		
		
		long jediWithNameContain1000Counter = jedis.stream()
									.filter(filterNameContain1000)
									.count();	

		assertEquals(1, jediWithNameContain1000Counter);

		
		long jedi00And1000 = jedis.stream()
									.filter(filterEndWith00
											.and(filterNameContain1000))
									.count();	

		assertEquals(1, jedi00And1000);
			


	}

}
