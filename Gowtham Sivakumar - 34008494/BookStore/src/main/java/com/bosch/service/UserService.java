package com.bosch.service;

import com.bosch.model.User;

public interface UserService {
	User registerUser(User user);

	User loginUser(String username);

}