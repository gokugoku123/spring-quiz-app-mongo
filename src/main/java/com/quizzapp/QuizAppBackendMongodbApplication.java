package com.quizzapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class QuizAppBackendMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizAppBackendMongodbApplication.class, args);
	}

}
