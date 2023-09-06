package com.example.todomvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.todomvc.domain.Todo;
import com.example.todomvc.service.TodoService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/todo")
public class TodoController {
	
	private  final	TodoService todoService;
	
	@GetMapping("/list")
	public String list(Model model) {
		
		List<Todo> todos =  todoService.getTodos();
		model.addAttribute("todoList", todos);
		
		return "list";
	}
	
	

}
