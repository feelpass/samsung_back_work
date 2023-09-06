package com.example.todomvc.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.todomvc.domain.Todo;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class TodoDao {
	private final JdbcTemplate jdbcTemplate;
	
	@Transactional
	public int insertTodo(String todo) {
		String sql = "insert into todos(todo,done) values(?,false)";
		return jdbcTemplate.update(sql,todo);
	}
	
	@Transactional(readOnly = true)
	public List<Todo> getTodos(){
		String sql = "select id, todo, done from todos order by id desc";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Todo.class));
	}
	
	public Todo getTodo(Long id) {
		String sql = "select id, todo, done from todos where id = ?";
		return jdbcTemplate.queryForObject(sql,new TodoMapper() ,id);
	}
	@Transactional(readOnly = true)
	public static class TodoMapper implements RowMapper<Todo>{

		@Override
		public Todo mapRow(ResultSet rs, int rowNum) throws SQLException {
			Todo todo = new Todo();
			todo.setId(rs.getLong("id"));
			todo.setTodo(rs.getString("todo"));
			todo.setDone(rs.getBoolean("done"));
			return todo;
		}
		
	}
}
