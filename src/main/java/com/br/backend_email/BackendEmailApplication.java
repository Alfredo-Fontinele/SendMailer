package com.br.backend_email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendEmailApplication.class, args);
		System.out.println("\nServer is running in http://localhost:8080\n");
	}

}
