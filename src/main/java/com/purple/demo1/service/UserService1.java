package com.purple.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purple.demo1.pojo.UserPojo1;
import com.purple.demo1.repository.IUserRepository1;

@Service
public class UserService1 implements IUserService1{

	@Autowired
	private IUserRepository1 userRepository;
	
	public UserPojo1 findUserById(int id) {
		
		return userRepository.findById(id).orElse(null);
		
	}

	
}
