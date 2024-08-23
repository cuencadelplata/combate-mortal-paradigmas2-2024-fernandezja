package com.starwars.app.java_starwars_app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaStarwarsAppApplicationTests {

	@Test
	void test1() {
		var result = 1 + 3;
		assertEquals(4, result);
	}

	@Test
	void test2() {
		var result = 1 + 9;
		assertEquals(10, result);
	}

}
