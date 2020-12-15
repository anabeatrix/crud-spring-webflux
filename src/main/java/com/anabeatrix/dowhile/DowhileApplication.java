package com.anabeatrix.dowhile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class DowhileApplication {

	public static void main(String[] args) {
		SpringApplication.run(DowhileApplication.class, args);
		System.out.println("Fala dev!");
	}

}
