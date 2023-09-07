package com.example.todomvc.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todomvc.domain.Todo;
import com.example.todomvc.service.TodoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/todos")
@RequiredArgsConstructor
@Api(tags = "carami's todos!!")
public class TodoApiController {
	
	private  final	TodoService todoService;
	
	@GetMapping
	@ApiOperation(value = "ToDo 리스트 얻어오기", notes = "전체 할일에 대한 목록을 보여줍니다.")
	public List<Todo> getTodos(){
		return todoService.getTodos();
	}
	
	@GetMapping("/{id}")
	@ApiImplicitParam(name = "id", value = "할일 아이디",  required = true, paramType = "path", defaultValue = "1")
	@ApiResponses({
		@ApiResponse(code = 200, message = "성공"),
		@ApiResponse(code=500, message = "아이디가 존재하는지 확인해보세요."),
		@ApiResponse(code = 403, message = "권한이 있는지 확인해 보세요.")
	})
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
