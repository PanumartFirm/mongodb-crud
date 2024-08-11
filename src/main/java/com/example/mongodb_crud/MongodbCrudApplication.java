package com.example.mongodb_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.example.mongodb_crud.repository")
public class MongodbCrudApplication {

	public static void main(String[] args) {
		System.out.println("Hello Worlds");
		SpringApplication.run(MongodbCrudApplication.class, args);
	}

}
