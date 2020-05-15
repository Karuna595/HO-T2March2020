package com.mastek.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/greeting")// for any request
public class GreetingController {

	@RequestMapping(method=RequestMethod.GET)
	public String GetGreeting(ModelMap modelmap) {
		modelmap.addAttribute("message","Welcome to Spring sent");
		return "firstpage";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String postGreeting(ModelMap modelmap) {
		modelmap.addAttribute("message","Welcome to Spring Post");
		return "firstpage";
	}

}
