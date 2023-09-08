package com.example.todojpa.service;

import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.todojpa.domain.Role;
import com.example.todojpa.domain.User;
import com.example.todojpa.repository.RoleRepository;
import com.example.todojpa.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	private final UserRepository userRepository;
	private final RoleRepository roleRepository;
	private final PasswordEncoder passwordEncoder;
	
	public User joinUser(String email, String password) {
		User user = new User();
		user.setEmail(email);
		user.setPassword(passwordEncoder.encode(password));
		
		Role role =	roleRepository.findByRolename("ROLE_USER").orElseThrow();
		
		user.setRoles(List.of(role));
		
		return userRepository.save(user);
	}
}
