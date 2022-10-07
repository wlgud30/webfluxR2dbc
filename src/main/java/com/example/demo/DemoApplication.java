package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import reactor.blockhound.BlockHound;

@SpringBootApplication

@EnableR2dbcRepositories(basePackages = "com.example.demo.repository")
@EnableJpaRepositories(basePackages = "com.example.demo.jpa.repository")
public class DemoApplication {

	public static void main(String[] args) {
		BlockHound.install();
		SpringApplication.run(DemoApplication.class, args);
	}

}
