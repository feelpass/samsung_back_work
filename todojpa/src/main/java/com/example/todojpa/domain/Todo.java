package com.example.todojpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@Table(name="todos")
public class Todo {
	@Id
	@GeneratedValue
	private Long id;
	private String todo;
	private boolean done;
}
