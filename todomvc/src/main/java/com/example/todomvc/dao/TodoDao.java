package com.example.todomvc.dao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class TodoDao {
	private final JdbcTemplate jdbcTemplate;
	
	public int insertTodo(String todo) {
		String sql = "insert into todos(todo,done) values(?,false)";
		return jdbcTemplate.update(sql,todo);
	}

}
