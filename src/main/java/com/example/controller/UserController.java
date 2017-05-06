package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/getusers")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}
	
	@RequestMapping(value="/adduser",method=RequestMethod.POST)
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
}
