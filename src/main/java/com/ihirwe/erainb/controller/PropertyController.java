package com.ihirwe.erainb.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ihirwe.erainb.model.Property;
import com.ihirwe.erainb.service.PropertyService;

@Controller
public class PropertyController {

	@Autowired
	PropertyService propertyService;
	
	@RequestMapping(value = "/create")
	public String createProperty(@ModelAttribute("property") Property property, Principal principal) throws Exception {
		System.out.println("Test 101: "+property);
		try {
			//model.addAttribute("property", new Property());
			propertyService.createProperty(property);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "createproperty";
	}
	
	
	@RequestMapping(value = "/properties")
	public String viewProperties(@ModelAttribute("property") Property property, Principal principal) throws Exception {
		return "propertieslistadmin";
	}
	
	
	
}
