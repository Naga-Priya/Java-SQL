package com.training.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.springmvc.model.User;
import com.training.springmvc.repository.UserRepository;
//import com.training.springmvc.repository.UserRepository;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	UserRepository repository;

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
	//@GetMapping("/validate")
	@PostMapping("/validate")
//	public String validate(@RequestBody String fullName,ModelMap model)
	//public String validate(@PathVariable String uname,@PathVariable String pwd,ModelMap model)
	public String validate(@RequestParam String uname,
			@RequestParam String pwd,
			ModelMap model)
	{
		//String name = (String) request.getAttribute("uname");
		
		//model.addAttribute("name",uname+"-"+pwd);
	//model.addAttribute("name",fullName);
		List<User> users = repository.findAll();
		
		String userName = null;
		for(User usr:users) {
			System.out.println("Read: "+usr.getUserName());
			userName = usr.getUserName();
			if(uname.equalsIgnoreCase(userName)){
				if(pwd.equals(usr.getPassword())){
					model.addAttribute("name",uname);
					return "welcome";
				}
				else
					return "error";
			}
		}
		return "error";
		
//		if(uname.equalsIgnoreCase("priya")&&pwd.equals("password")) {
//			model.addAttribute("name",uname);
//			return "welcome";
//		}
//		else
//			return "error";
	
	}
	
//	@RequestMapping("/users")
//	public String getUsers(ModelMap model) {
//		List<User> users = repository.findAll();
//		
//		String userName = null;
//		for(User usr:users) {
//			userName = usr.getUserName();
//		}
//		model.addAttribute("value",userName);
//		return "user";
//	}
	
	@RequestMapping("/users")
	@ResponseBody
	public List<User> getUsers(){
		System.out.println("Getting users::::");
		List<User> users = repository.findAll();
		return users;
	}
	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST,
			consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE}) 
	 public ResponseEntity<Void> addPersons(User user) {
//		final HttpHeaders httpHeaders= new HttpHeaders();
//	    httpHeaders.setContentType(MediaType.APPLICATION_JSON);
	 System.out.println("Adding new users::"); 
	 repository.save(user); 
	 return new ResponseEntity<Void>(HttpStatus.CREATED);
	 //return new ResponseEntity<Void>(httpHeaders, HttpStatus.OK);
	  
	  }
	
	//Value specifies URL
	//Produces is for Media mapping
//	@RequestMapping(value = "/allusers", produces="application/json")
//	@ResponseBody
//	public List<User> getUsers() {
//		List<User> users = repository.findAll();
//		
//		String userName = null;
//		for(User usr:users) {
//			userName = usr.getUserName();
//		}
//		model.addAttribute("value",userName);
//		return users;
//	}
	
}
