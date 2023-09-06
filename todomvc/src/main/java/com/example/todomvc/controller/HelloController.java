package com.example.todomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/hi")
	public String hhh(Model model ) {
		
		String name = "carami";
		
//		req.setAttribute("name", name);
		
		model.addAttribute("name", name);
		
		return "hi";
	}
}
