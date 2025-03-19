package com.bosch.service;

import com.bosch.model.User;

public interface UserService {
	User createUser(User user);
	User getUserById(Long id);
}