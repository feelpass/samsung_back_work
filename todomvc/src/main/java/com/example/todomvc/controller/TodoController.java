package com.example.todomvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.todomvc.domain.Todo;
import com.example.todomvc.service.TodoService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/todo")
public class TodoController {
	
	private  final	TodoService todoService;
	
	@GetMapping("/list")
//	@ResponseBody
	public String list(Model model) {
		
		List<Todo> todos =  todoService.getTodos();
		model.addAttribute("todoList", todos);
		
		return "list";
	}
	
	@PostMapping("/add")
	public String add(@RequestParam("todo") String todo) {
		todoService.addTodo(todo);
		
		return "redirect:/todo/list";
	}
	
	@GetMapping("/update")
	public String update(@RequestParam("id") Long id) {
		
		todoService.updateTodo(id);
		
		return "redirect:/todo/list";		
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("id") Long id) {
		
		todoService.deleteTodo(id);
		
		return "redirect:/todo/list";	
	}

}
