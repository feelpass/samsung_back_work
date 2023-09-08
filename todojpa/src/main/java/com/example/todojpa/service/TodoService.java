package com.example.todojpa.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.todojpa.domain.Todo;
import com.example.todojpa.repository.TodoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoService {

	private final TodoRepository todoRepository;
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

}
