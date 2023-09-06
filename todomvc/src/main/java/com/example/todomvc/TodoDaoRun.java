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
		
//		todoDao.deleteTodo(5L);
//	
//		List<Todo> todos =	todoDao.getTodos();
//		
//		for (Todo todo : todos) {
//			System.out.println(todo);
//		}
//		
//		
//		
//		System.out.println("수정전!!"+todoDao.getTodo(1L));
//		Todo todo = todoDao.getTodo(1L);
//		todo.setDone(!todo.isDone());
//		
//		todoDao.updateTodo(todo);
//		
//		System.out.println("수정후!!"+todoDao.getTodo(1L));
		
		System.out.println(todoDao.addTodo("spring jdbc study!!"));
	
	}
	

}
