package com.example.iocexam.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.iocexam.config.UserConfig;
import com.example.iocexam.controller.UserController;

public class UserRun {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
		
		UserController userController = context.getBean("UserC",UserController.class);
		
		userController.joinUser();
	}

}
