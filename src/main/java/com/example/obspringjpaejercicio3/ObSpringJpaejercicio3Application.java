package com.example.obspringjpaejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringJpaejercicio3Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ObSpringJpaejercicio3Application.class, args);
		AlumnoRepository repository = context.getBean(AlumnoRepository.class);

		Alumno alumno1 = new Alumno(null, "Alonso", "Pina", "7vo");
		repository.save(alumno1);
		System.out.println(repository.findAll());
	}

}
