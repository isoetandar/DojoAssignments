package com.irwan.displayDate;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model; //Not used - No needed for this application
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //-this need for spring boot to connect with jsp
public class selectDateTime {
	@RequestMapping("/")
	public String index() { 
		return "index.jsp";
	}
}