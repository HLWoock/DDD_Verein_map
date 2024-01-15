package de.woock;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.JdbcConnectionDetails;
import org.springframework.context.annotation.Bean;

import de.woock.infra.service.MitgliederService;

@SpringBootApplication
public class Verein {

	public static void main(String[] args) {
		SpringApplication.run(Verein.class, args);
	}
	
	@Bean
	CommandLineRunner init(JdbcConnectionDetails jdbc, MitgliederService mitgliederService) {
		return args -> {
			System.out.println(jdbc.getJdbcUrl());
			System.out.println(jdbc.getXaDataSourceClassName());
			System.out.println(jdbc.getUsername());
			System.out.println(jdbc.getPassword());
		};
	}

}
