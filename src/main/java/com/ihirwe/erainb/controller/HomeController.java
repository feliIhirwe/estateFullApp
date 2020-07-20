package com.ihirwe.erainb.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

	@GetMapping("/index")
	public String home() {
		return "index";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
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