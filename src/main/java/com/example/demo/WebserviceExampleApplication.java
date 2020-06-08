package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebserviceExampleApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(WebserviceExampleApplication.class, args);
	}

	@RequestMapping(value = "/getMessage")
	public String getMessage() {
		return "welcome to first Spring Boot Application With jenkins";
	}


	@RequestMapping(value = "/getMessage")
	public String getHellowowrldMessage() {
		return "This is the first sommit from Gt and then Job will start automcatically in Jnkins";
	}

}
