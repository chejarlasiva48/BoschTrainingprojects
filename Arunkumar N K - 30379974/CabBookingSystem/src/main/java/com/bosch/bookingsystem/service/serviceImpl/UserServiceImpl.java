package com.bosch.bookingsystem.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.bookingsystem.model.User;
import com.bosch.bookingsystem.repository.UserRepository;
import com.bosch.bookingsystem.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	public User createUser(User user) {
		return userRepository.save(user);
	}

	public User getUserById(Long id) {
		return userRepository.findById(id).orElse(null);
	}

	@Override
	public User getUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

}
