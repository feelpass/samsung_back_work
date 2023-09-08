package com.example.todojpa;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.todojpa.config.ApplicationConfig;
import com.example.todojpa.domain.Todo;
import com.example.todojpa.repository.TodoRepository;
import com.example.todojpa.service.TodoService;

public class TodoJpaRun {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		TodoRepository todoRepository = context.getBean(TodoRepository.class);

		// 1. 저장

//		for (int i = 0; i < 10; i++) {
//
//			Todo todo = new Todo();
//			todo.setTodo("hello "+ i);
//
//			todoRepository.save(todo);
//
//		}
		
//		//2. 조회 (한 건)
		Todo findTodo = todoRepository.findById(2L).orElseThrow();
		
		System.out.println(findTodo);
//		
//		//3. 조회 (여러건)
//		List<Todo> todos = null;
//		
////		todos = todoRepository.findAll();  //전체조회  
//		
//		Pageable pageable = PageRequest.of(2,7, Sort.by("todo").descending());
//		
//		todos = todoRepository.findAll(pageable).getContent();
//		
//		for (Todo todo : todos) {
//			System.out.println(todo);
//		}
		
		//4. 수정 
//		Todo updateTodo = todoRepository.findById(2L).orElseThrow();
//		
//		updateTodo.setTodo("jpa update test!!");
		
		TodoService todoService = context.getBean(TodoService.class);
		
		Todo updateTodo =todoService.updateTodo(2L);
		System.out.println(updateTodo);
		
		

	}

}
