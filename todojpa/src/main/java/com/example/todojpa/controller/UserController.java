package com.example.todojpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.todojpa.service.UserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userService;
	
	@PostMapping("/addUser")
	public String addUser(@RequestParam("email")String email, @RequestParam("password") String password) {
		userService.joinUser(email, password);
		return "redirect:/";
	}

}
