package com.example.iocexam.service;

import org.springframework.stereotype.Service;

import com.example.iocexam.dao.UserDao;
import com.example.iocexam.domain.User;

@Service
public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void joinUser(User user) {
		// 회원 가입에 필요한 비지니스는 여기에 구현!!  
		
		userDao.addUser(user);

	}

}
