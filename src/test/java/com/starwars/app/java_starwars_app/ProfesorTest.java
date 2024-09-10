// package com.starwars.app.java_starwars_app;


// import static org.junit.jupiter.api.Assertions.assertEquals;

// import java.util.ArrayList;

// import org.junit.jupiter.api.Test;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.util.Assert;

// import com.starwars.app.java_starwars_app.interfaces.IHasLightSaber;

// @SpringBootTest
// public class ProfesorTest {


//     @Test
// 	void profesor_se_crear_un_profesor_con_datos() {
		
// 		Profesor profesor1 = new Profesor();

// 		profesor1.setNombre("Jose");
// 		profesor1.setSalario(12,34);
// 		profesor1.getEmails().add(new Email("jose@demo.com"))
// 		profesor1.getTelefonos().add(new Telefono("+54", "379", "123456"));
// 		//profesor1.getDomicilios().add(new Domicilio("Calle ", "123"));
// 		profesor1.setDomicilio(new Domicilio("Calle ", "123"));

		
// 	}


// 	//¿Como se "obliga al objeto" Tutoria crear con un tutor, materia, y por lo menos 1 alumno?
// 	@Test
// 	void tutoria_completa() {
		
// 		Materia materia1 = new Materia("Materia1");
// 		Profesor tutor1 = new Profesor("Maria");
// 		Alumno alumno1 = new Alumno("Alumno 1");
// 		Alumno alumno2 = new Alumno("Alumno 2");

// 		ArrayList<Alumno> alumnos = new ArraList<Alumno>();
// 		alumnos.add(alumno1);
// 		alumnos.add(alumno2);

// 		Tutoria tutoria1 = new Tutoria(materia1, 
// 									   tutor1,
// 									   alumnos);

		

		
// 	}


// }
