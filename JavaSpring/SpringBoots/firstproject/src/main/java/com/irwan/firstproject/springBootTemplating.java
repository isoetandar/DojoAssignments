package com.irwan.firstproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class springBootTemplating {
	@RequestMapping("/template")
	public String home() {
		return "index.jsp";
//	public String index(Model model) {
//		model.addAttribute("dojoName", "Burbank");
//		return "index.jsp";
	}
}