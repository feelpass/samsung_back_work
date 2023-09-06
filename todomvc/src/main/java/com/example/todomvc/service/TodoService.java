package com.example.todomvc.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.todomvc.dao.TodoDao;
import com.example.todomvc.domain.Todo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoService {
	
	private final TodoDao todoDao;
	
	@Transactional(readOnly = true)
	public List<Todo> getTodos(){
		return todoDao.getTodos();
	}
	
	@Transactional(readOnly =  true)
	public Todo getTodo(Long id) {
		return todoDao.getTodo(id);
	}
	
	@Transactional
	public Todo addTodo(String todo) {
		return todoDao.addTodo(todo);
	}
	@Transactional
	public Todo updateTodo(Long id) {
		Todo todo = todoDao.getTodo(id);
		todo.setDone(!todo.isDone());
		
		todoDao.updateTodo(todo);
		
		return todo;
	}
	@Transactional
	public void deleteTodo(Long id) {
		todoDao.deleteTodo(id);
	}
}
