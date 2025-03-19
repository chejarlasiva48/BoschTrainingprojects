package com.bosch.service;

import com.bosch.model.User;

public interface UserService {
	User signupUser(User user);

	User loginUser(String username);

}