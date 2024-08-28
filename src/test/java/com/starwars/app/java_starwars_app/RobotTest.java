package com.starwars.app.java_starwars_app;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.starwars.app.java_starwars_app.interfaces.IHasLightSaber;

@SpringBootTest
public class RobotTest {
    @Test
	void robot_test() {
		Robot robot1 = new Robot();        

		assertEquals(false, robot1.hasLightSaber());

        IHasLightSaber objHasLightSaber1 = robot1;
        assertEquals(false, objHasLightSaber1.hasLightSaber());
	}
}
