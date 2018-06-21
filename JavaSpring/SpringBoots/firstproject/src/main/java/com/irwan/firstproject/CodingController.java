package com.irwan.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {
	@RequestMapping("")
	public String getRequest () {
		return "Hello Coding Dojo";
	}
	@RequestMapping("/python")
	public String getReqPython () {
		return "Hello Python/Django was awesome";
	}
	
	@RequestMapping("/java")
	public String getReqJava () {
		return "Java/Spring is better";
	}

}
