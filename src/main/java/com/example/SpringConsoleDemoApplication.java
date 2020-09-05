package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.service.IPersonaService;

@SpringBootApplication
public class SpringConsoleDemoApplication implements CommandLineRunner{
	
	@Autowired
	private IPersonaService service;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringConsoleDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		service.registrar("Registro de usuario, utilizando inyección de dependencias en la capa Servicio");
	}

}
