package com.example.todojpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.todojpa.domain.Todo;
import com.example.todojpa.repository.TodoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoService {

	private final TodoRepository todoRepository;
	
	@Transactional(readOnly =  true)
	public List<Todo> getTodos(){
		return todoRepository.findAll();
	}
	
	@Transactional(readOnly =  true)
	public Todo getTodo(Long id) {
		return todoRepository.findById(id).get();
	}
	
	@Transactional
	public Todo addTodo(String todo) {
		Todo todoObj = new Todo();
		todoObj.setTodo(todo);
		return todoRepository.save(todoObj);
	}
	
	
	@Transactional
	public Todo updateTodo(Long id) {
		System.out.println("service update start!!");

		Todo updateTodo = null;
		try {

			updateTodo = todoRepository.findById(id).orElseThrow();
			updateTodo.setDone(!updateTodo.isDone());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("service update end!!");
		}
		
		return updateTodo;
	}
	
	@Transactional
	public void deleteTodo(Long id) {
		Optional<Todo> findTodo = todoRepository.findById(id);
		
		if(findTodo.isEmpty())
			return;
		
		todoRepository.delete(findTodo.get());
	}

}
