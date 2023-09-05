package com.example.iocexam.controller;

import com.example.iocexam.domain.User;
import com.example.iocexam.service.UserService;

public class UserController {
	private UserService userService;
	
	public void joinUser() {
		//실제값은 사용자로 부터 얻어옴..
		User user = new User();
		user.setName("carami");
		user.setEmail("carami@gmail.com");
		user.setPassword("1111");
		
		
		userService.joinUser(user);
	}
}
