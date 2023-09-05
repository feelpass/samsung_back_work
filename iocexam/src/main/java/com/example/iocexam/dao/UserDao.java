package com.example.iocexam.dao;

import java.util.List;

import com.example.iocexam.domain.User;

public interface UserDao {
	public User getUser(String email);
	public List<User> getUsers();
	public void addUser(User user);
}
