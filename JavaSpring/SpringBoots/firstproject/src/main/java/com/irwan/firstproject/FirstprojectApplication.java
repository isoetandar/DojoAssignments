package com.irwan.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController  //convenience annotation that does nothing more than adding the @Controller and
				//@ResponseBody annotations
public class FirstprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);
	}
	// Below is disable because conflict with @RequestMapping in HomeController class
//	@RequestMapping("/") //Allow to Response to root request
//	public String hello() { //How to response to root route request
//		return "Hello World!";
//	}
}
