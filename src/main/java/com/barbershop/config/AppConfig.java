package com.barbershop.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.barbershop")
@EntityScan("com.barbershop.entity")
@EnableJpaRepositories("com.barbershop.repository")
public class AppConfig {}
