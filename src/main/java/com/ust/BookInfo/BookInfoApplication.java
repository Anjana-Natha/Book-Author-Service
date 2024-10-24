package com.ust.BookInfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class BookInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookInfoApplication.class, args);
	}

}
