package com.irwan.stringAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsAssignmentApplication.class, args);
	}
	@RequestMapping("/")
	public String rootVisitor() {
		return "Hello client! How are you doing?";
	}
	@RequestMapping("/Random")
	public String randomVisitor() {
		return "Spring Boot is great! So easy to just respond with strings";
	}
}
