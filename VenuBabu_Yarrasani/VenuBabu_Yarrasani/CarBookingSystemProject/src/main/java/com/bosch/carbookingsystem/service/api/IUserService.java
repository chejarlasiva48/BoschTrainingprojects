package com.bosch.carbookingsystem.service.api;

import com.bosch.carbookingsystem.dto.User;

public interface IUserService {
	User createUser(User user);
	User getUserById(Long id);
}