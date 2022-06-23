package com.centrahub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		System.out.println("Server started 1");
		SpringApplication.run(Application.class, args);
		System.out.println("Server started 2");
	}

}
