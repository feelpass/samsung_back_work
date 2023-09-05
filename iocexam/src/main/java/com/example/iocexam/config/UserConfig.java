package com.example.iocexam.config;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.example.iocexam")
public class UserConfig {
//	@Bean
//	public UserDao userDao() {
//		return new UserDaoImpl();
//	}
//	
//	@Bean
//	public UserService userService(UserDao userDao) {
//		return new UserServiceImpl(userDao);
//	}
//	
//	@Bean
//	public UserController userController(UserService userService) {
//		UserController controller = new UserController();
//		controller.setUserService(userService);
//		
//		return controller;
//	}
}
