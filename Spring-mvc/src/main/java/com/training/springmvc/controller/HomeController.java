package com.training.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping("/greet")
	public String displayGreeting(ModelMap model) {
		model.addAttribute("message","Hello World from Spring MVC!");
		return "home";
	}
	@RequestMapping("/message")
	public String displayMessage(ModelMap model) {
		model.addAttribute("value","New message from Spring MVC!");
		return "message";
	}
	
}
