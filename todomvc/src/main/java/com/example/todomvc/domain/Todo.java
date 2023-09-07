package com.example.todomvc.domain;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Data;

@Data
public class Todo {
	@ApiModelProperty(name = "id" , example = "1")
	private Long id;
	@ApiParam(value = "todo", required = true)
	@ApiModelProperty(name = "todo", example = "spring study!!!")
	private String todo;
	private boolean done;
	
	
}
