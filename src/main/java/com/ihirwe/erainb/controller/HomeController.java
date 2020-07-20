package com.ihirwe.erainb.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.ihirwe.erainb.model.Property;


@Controller
public class HomeController {

	@GetMapping("/index")
	public String home() {
		return "index";
	}
	@GetMapping("/login")
	public String login(@ModelAttribute("username") String username,@ModelAttribute("password") String password, Principal principal) throws Exception {
		
		if(!username.equals("arthur") | !password.equals("12345")) {
			return "login";
		}
		else {
			return "login";
		}
	}
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	@GetMapping("/propertyviewall")
	public String allproperties() {
		return "propertyviewall";
	}
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
}