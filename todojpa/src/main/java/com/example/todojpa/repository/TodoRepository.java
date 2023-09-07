package com.example.todojpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todojpa.domain.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
