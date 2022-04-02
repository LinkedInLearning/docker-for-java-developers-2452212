package com.example.volumedemo;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Log
public class Application {
	@Value("${app.whereami}")
	private String whereAmI;

	@GetMapping
	public String getWhereAmI() {
		return whereAmI;
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
