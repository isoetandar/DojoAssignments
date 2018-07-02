package com.irwan.beltExam1.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.irwan.beltExam1.models.Idea;
import com.irwan.beltExam1.services.IdeaService;
import com.irwan.beltExam1.services.UserService;

  @Controller
  @RequestMapping("/ideas")
  public class IdeaController {
  	
  	private final IdeaService ideaService;
  	private final UserService userService;
  	
  	public IdeaController(IdeaService ideaService, UserService userService) {
  		this.ideaService = ideaService;
  		this.userService = userService;
  	}
  	
  	@RequestMapping("/new")
  	public String addIdea(Model model) {
  		model.addAttribute("idea", new Idea());
  		model.addAttribute("users", userService.showUsers());
  		return "newIdea.jsp";
  	}
  	
  	@PostMapping("/new")
  	public String createIdea(@Valid @ModelAttribute("idea") Idea idea, BindingResult result) {
  		if(result.hasErrors()) {
  			System.out.println(result.getAllErrors());
  			return "redirect:/new";
  		}
  		else {
  			Long newIdea = ideaService.addIdea(idea);
  			Long ideasUser = ideaService.findIdea(newIdea).getUser().getId();
  			return "redirect:/users/" + ideasUser;
  		}
  	}
  }