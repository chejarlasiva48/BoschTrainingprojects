package com.bosch.bookingsystem.service;

import java.util.List;

import com.bosch.bookingsystem.model.User;

public interface UserService {
	User createUser(User user);
	User getUserById(Long id);
	User getUserByEmail(String email);
	List<User> getAllUsers();
}