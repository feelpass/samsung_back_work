package com.example.todomvc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.todomvc.config.ApplicationConfig;
import com.example.todomvc.dao.TodoDao;

public class TodoDaoRun {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		TodoDao todoDao = context.getBean(TodoDao.class);
		
		
		todoDao.insertTodo("운동가자!!");
	}

}
