package com.example.iocexam.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.iocexam.domain.User;
@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public User getUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(User user) {
		System.out.println(user + "의 정보가 잘 저장되었습니다.");
	}

}
