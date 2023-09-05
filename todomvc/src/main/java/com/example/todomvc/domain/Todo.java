package com.example.todomvc.domain;

import lombok.Data;

@Data
public class Todo {
	private Long id;
	private String todo;
	private boolean done;
	
	
}
