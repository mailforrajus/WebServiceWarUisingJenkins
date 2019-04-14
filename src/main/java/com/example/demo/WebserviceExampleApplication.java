package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebserviceExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebserviceExampleApplication.class, args);
	}

	@RequestMapping(value = "/getMessage")
	public String getMessage() {
		return "welcome to first Spring Boot Application With jenkins";
	}

}
