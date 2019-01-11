package com.purple.demo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.purple.demo1.pojo.UserPojo1;
import com.purple.demo1.service.IUserService1;

@RestController
public class UserController1 {

	@Autowired
	private IUserService1 userService;
	//test
	@GetMapping("/find/{id}")
	public UserPojo1 findById(@PathVariable int id) {
		return userService.findUserById(id);
	}
}
