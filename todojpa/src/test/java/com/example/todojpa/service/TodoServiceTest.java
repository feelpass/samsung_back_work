package com.example.todojpa.service;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.transaction.annotation.Transactional;

import com.example.todojpa.config.ApplicationConfig;
import com.example.todojpa.domain.Todo;

@SpringJUnitConfig(classes = ApplicationConfig.class)

@SqlGroup({
	@Sql(value = "classpath:db/test-data.sql", config = @SqlConfig(encoding = "utf-8", separator = ";", commentPrefix = "--"), executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD),
	@Sql(value = "classpath:db/clean-up.sql", config = @SqlConfig(encoding = "utf-8", separator = ";", commentPrefix = "--"), executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD), })
@Transactional
public class TodoServiceTest {
	@Autowired
	private TodoService todoService;
	
	private static Logger logger = LoggerFactory.getLogger(TodoServiceTest.class);
	
	@Test
	@DisplayName("3번 id에 해당하는 todo를 구합니다.")
	void getTodo() {
		Todo todo =	todoService.getTodo(3L);
		
		assertNotNull(todo);
	}
	
	@Test
	void updateTodo() {
		Todo beforeTodo = 	todoService.getTodo(3L);
		todoService.updateTodo(3L);
		Todo afterTodo = 	todoService.getTodo(3L);
		
		assertNotEquals(beforeTodo.isDone(), afterTodo.isDone());
	}
	
	
	@Test
	void test() {
		logger.info("================test=======================");
	}
	
	
	@Test
	void test2() {
		logger.info("================test2=======================");
	}
	
	
	@BeforeEach
	void init() {
		logger.info("================init=======================");
	}
	
	@AfterEach
	void dispose() {
		logger.info("================dispose=======================");
	}
	
	@BeforeAll
	static void setup() {
		logger.info("================setup=======================");
	}
	
	@AfterAll
	static void terarDown() {
		logger.info("================terarDown=======================");
	}

}
