package com.example.todojpa.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todojpa.domain.Todo;
import com.example.todojpa.service.TodoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/todos")
@RequiredArgsConstructor
public class TodoApiController {
	
	private  final	TodoService todoService;
	
	@GetMapping
	
	public List<Todo> getTodos(){
		return todoService.getTodos();
	}
	
	@GetMapping("/{id}")	
	public Todo getTodo(@PathVariable("id") Long id) {
		return todoService.getTodo(id);				
	}
	
	@PostMapping
	public Todo addTodo(@RequestBody Todo todo) {
		return todoService.addTodo(todo.getTodo());
	}
	
	@PatchMapping
	public Todo updateTodo(@RequestBody Todo todo) {
		return todoService.updateTodo(todo.getId());
	}
	
	@DeleteMapping
	public String deleteTodo(@RequestBody Todo todo) {
		todoService.deleteTodo(todo.getId());
		return "ok";
	}
}
