package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.DBRepositories;


@Service
public class UserService {

	@Autowired
	private DBRepositories userRepository;
	
	public List<User> getAllUser() {
		List<User> userList=new ArrayList<>();
		userRepository.findAll().forEach(userList::add);
		return userList;
	}
	
	public void addUser(User user) {
		userRepository.save(user);
	}
}
