package com.irwan.sessionCounter;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class sessionCounter {
	Integer counter=0;
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		counter++;
		session.setAttribute("counter", counter);
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String userVisit(HttpSession session) {
		session.getAttribute("counter");
		return "sessionCounter.jsp";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		counter = 0;
		session.setAttribute("counter", counter);
		return "redirect:/";
	}
	
	@RequestMapping("/increment")
	public String increment(HttpSession session) {
		counter++;
		session.setAttribute("counter", counter);
		return "redirect:/counter";
	}
}
