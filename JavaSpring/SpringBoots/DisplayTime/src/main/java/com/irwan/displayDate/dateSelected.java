package com.irwan.displayDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
//import java.util.Date;

@Controller
public class dateSelected {
	@RequestMapping("/date")
	public String showDate(Model model) {
		String pattern = "EEEE, dd MMMM, yyyy";
		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
		model.addAttribute("setDate", formatter.format(new java.util.Date()));
		return "showDate.jsp";	
	}
}
