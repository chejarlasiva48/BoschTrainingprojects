package com.bosch.bookstore.service.api;

import com.bosch.bookstore.dto.User;

public interface IUserService {
	User registerUser(User user);

	User loginUser(String username);

}