package com.healthcare.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HealthcareBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthcareBackendApplication.class, args);
	}

	@GetMapping("/hello")
	public String method() {
		return "Hello world";
	}

}
