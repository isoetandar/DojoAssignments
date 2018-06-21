package com.irwan.displayDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
//import java.util.Date;

@Controller
public class timeSelected {
	@RequestMapping("/time")
	public String showTime(Model model) {
		String pattern = "hh:mm a";
		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
		model.addAttribute("setTime", formatter.format(new java.util.Date()));
		return "showTime.jsp";	
	}
}
