package com.barbershop;

import com.barbershop.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class BarbershopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppConfig.class, args);
	}

}
