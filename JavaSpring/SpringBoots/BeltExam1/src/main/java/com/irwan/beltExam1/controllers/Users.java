package com.irwan.beltExam1.controllers;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.irwan.beltExam1.models.Idea;
import com.irwan.beltExam1.models.User;
import com.irwan.beltExam1.services.IdeaService;
import com.irwan.beltExam1.services.UserService;


@Controller
public class Users {
	private final UserService userService;
	private final IdeaService ideaService;
	
 
 	public Users(UserService userService, IdeaService ideaService) {
     this.userService = userService;
     this.ideaService = ideaService;
 	}
 	
 
 	@RequestMapping("/registration")
 	public String registerForm(@ModelAttribute("user") User user) {
     return "registrationPage.jsp";
 	}
// 	@RequestMapping("/login")
// 	public String login() {
// 		return "loginPage.jsp";
// 	}
 	
 	@RequestMapping("/")
 	public String index(@ModelAttribute("user") User user) {
     return "index.jsp";
 	}
 	
 	@RequestMapping(value="/registration", method=RequestMethod.POST)
 	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
//		 if result has errors, return the registration page (don't worry about validations just now)copy
// 		else, save the user in the database, save the user id in session, and redirect them to the /home route
 		if(result.hasErrors()) {
// 			return "redirect:/registration";
 			return "redirect:/";
 		}
 		else { 
 			User u = userService.registerUser(user);
 			session.setAttribute("userId", u.getId());
// 			return "redirect:/home";
 			return "redirect:/";
 		}
 	}
 
 	@RequestMapping(value="/login", method=RequestMethod.POST)
 	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
     // if the user is authenticated, save their user id in session
     // else, add error messages and return the login page
 		if (userService.authenticateUser(email, password) == true) {
 			User l = userService.findByEmail(email);
 			session.setAttribute("userId", l.getId());
 			return "redirect:/ideas";
 		} else {
 			model.addAttribute("error","Your login is incorrect. Try again!");
 			return "index.jsp";
// 			return "loginPage.jsp";
 		}
 	}
 	
 	@RequestMapping("/ideas")
 	public String home(HttpSession session, Model model) {
     // get user from session, save them in the model and return the home page
 		Long userId = (Long) session.getAttribute("userId");
 		User u = userService.findUserById(userId);
 		model.addAttribute("user", u);
 		List<Idea> i = ideaService.findAllIdeas(); //
 		model.addAttribute("ideas", i); //
// 		System.out.println(i);
 		return "ideasPage.jsp";
	 	}

 	@RequestMapping("/logout")
 	public String logout(HttpSession session) {
 		session.invalidate();
 		return "redirect:/";
 	}
}