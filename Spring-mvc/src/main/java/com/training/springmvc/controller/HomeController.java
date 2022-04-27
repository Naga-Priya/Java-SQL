package com.training.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	@RequestMapping("/")
	public String displayLogin(ModelMap model) {
		model.addAttribute("message","Hello World from Spring MVC!");
		return "login";
	}
	
	//@RequestMapping("/validate?uname={name}&pwd={pwd}",method=RequestMethod.GET)
	@GetMapping("/validate")
//	public String validate(@RequestBody String fullName,ModelMap model)
	//public String validate(@PathVariable String uname,@PathVariable String pwd,ModelMap model)
	public String validate(@RequestParam String uname,
			@RequestParam String pwd,
			ModelMap model)
	{
		//String name = (String) request.getAttribute("uname");
		
		//model.addAttribute("name",uname+"-"+pwd);
	//model.addAttribute("name",fullName);
		if(uname.equalsIgnoreCase("priya")&&pwd.equals("password")) {
			model.addAttribute("name",uname);
			return "welcome";
		}
		else
			return "error";
	
	}
}
