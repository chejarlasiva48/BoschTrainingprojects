package com.bosch.service;

import java.util.List;

import com.bosch.model.User;

public interface UserService {
	
	User registerUser(User user);

	User login(String username, String pass);
	
	List<User> getAllUsers();

}