package com.example.todomvc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.todomvc.config.ApplicationConfig;
import com.example.todomvc.dao.TodoDao;
import com.example.todomvc.domain.Todo;

public class TodoDaoRun {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		TodoDao todoDao = context.getBean(TodoDao.class);
		
		
//		todoDao.insertTodo("운동가자!!");
	
//		List<Todo> todos =	todoDao.getTodos();
//		
//		for (Todo todo : todos) {
//			System.out.println(todo);
//		}
		
		System.out.println(todoDao.getTodo(1L));
	
	}
	

}
