package com.irwan.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHuman {
	@RequestMapping("/")
	public String helloMan(@RequestParam(value="first_name", required=false) String firstID, 
			@RequestParam(value="last_name", required=false) String lastID) {
		if (firstID == null & lastID == null) {
//		if (searchID.equals("")) {
			return "<h3> Hello Human!</h3><br><p>Welcome to SpringBoot!</p>";	
		} else { 
			if (lastID == null) {lastID="";}
			if (firstID == null) {firstID="";}
			return "<h3> Hello "+ firstID+" "+lastID+" !</h3><br><p>Welcome to SpringBoot!</p>";
			}			
	}
}
