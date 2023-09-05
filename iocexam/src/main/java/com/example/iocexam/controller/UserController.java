package com.example.iocexam.controller;

import org.springframework.stereotype.Controller;

import com.example.iocexam.domain.User;
import com.example.iocexam.service.UserService;

import lombok.RequiredArgsConstructor;

@Controller("UserC")
@RequiredArgsConstructor
public class UserController {
//	@Autowired
	private final UserService userService;
	

	
//	@Autowired
//	public void setUserService(UserService userService) {
//		this.userService = userService;
//	}
//	
//	public UserController(UserService userService) {
//		this.userService = userService;
//	}

	public void joinUser() {
		//실제값은 사용자로 부터 얻어옴..
		User user = new User();
		user.setName("carami");
		user.setEmail("carami@gmail.com");
		user.setPassword("1111");
		
		
		userService.joinUser(user);
	}
}
