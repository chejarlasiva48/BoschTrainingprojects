package com.app.cab.booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.cab.booking.entities.UsersEntity;
import com.app.cab.booking.models.UserRequest;
import com.app.cab.booking.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public UsersEntity saveUser(UserRequest user) {
		UsersEntity userEntity = new UsersEntity();
		userEntity.setPassword(user.getPassword());
		userEntity.setUsername(user.getUsername());
		return userRepository.save(userEntity);
	}

	public UsersEntity findByUsername(String username) {
		return userRepository.findByUsername(username);
	}
}
