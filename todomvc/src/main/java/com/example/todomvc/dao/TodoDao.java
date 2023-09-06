package com.example.todomvc.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.todomvc.domain.Todo;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class TodoDao {
	private final JdbcTemplate jdbcTemplate;
	
	private SimpleJdbcInsert simpleJdbcInsert;
	
	
	@PostConstruct
	public void init() {
		simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate).withTableName("todos").usingGeneratedKeyColumns("id");
	}
	
	
	public Todo addTodo(String todo) {
		Map<String, Object> parmas = new HashMap();
		parmas.put("todo", todo);
		parmas.put("done", false);
		
		
		Number pk =	simpleJdbcInsert.executeAndReturnKey(parmas);
		
		Todo resultTodo = new Todo();
		resultTodo.setId(pk.longValue());
		resultTodo.setTodo(todo);
		resultTodo.setDone(false);
		
		return resultTodo;
	}
	
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
	@Transactional(readOnly = true)
	public Todo getTodo(Long id) {
		String sql = "select id, todo, done from todos where id = ?";
		return jdbcTemplate.queryForObject(sql,new TodoMapper() ,id);
	}
	
	@Transactional
	public void updateTodo(Todo todo) {
		String sql = "update todos set done=? where id = ?";
		jdbcTemplate.update(sql,todo.isDone(), todo.getId());
	}
	
	
	public void deleteTodo(Long id) {
		String sql = "delete from todos where id = ?";
		jdbcTemplate.update(sql,id);
	}
	
	
	
	
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
