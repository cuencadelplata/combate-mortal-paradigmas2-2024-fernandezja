package com.starwars.app.java_starwars_app;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.starwars.app.java_starwars_app.interfaces.IHasLightSaber;

@SpringBootTest
public class ClockTest {


    @Test
	void tick_suscribe_test() {
		
		Clock c1 = new Clock();

		ClockDemo demo1 = new ClockDemo();
		c1.suscribe(demo1);

		c1.tic();
		
		assertEquals(1, demo1.getTic());
		
	}

	@Test
	void tick_suscribes_test() {
		
		Clock c1 = new Clock();

		ClockDemo demo1 = new ClockDemo();
		c1.suscribe(demo1);

		c1.tic();
		
		assertEquals(1, demo1.getTic());
		
		ClockDemo demo2 = new ClockDemo();
		c1.suscribe(demo2);

		c1.tic();

		assertEquals(2, demo1.getTic());
		assertEquals(1, demo2.getTic());
		
	}

}
