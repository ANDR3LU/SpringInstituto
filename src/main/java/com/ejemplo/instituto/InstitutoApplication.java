package com.ejemplo.instituto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InstitutoApplication {

	public static void main(String[] args) {
		System.out.println("Hola");
		
		SpringApplication.run(AppEvaluacionDiaria.class, args);
		//SpringApplication.run(InstitutoApplication.class, args);
	}

}
