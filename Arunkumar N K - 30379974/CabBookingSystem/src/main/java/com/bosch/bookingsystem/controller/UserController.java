package com.bosch.bookingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.bookingsystem.model.User;
import com.bosch.bookingsystem.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/create")
	public User createBooking(@RequestBody User user) {
		return userService.createUser(user);
	}

	@GetMapping("/{id}")
	public User getUser(@PathVariable Long id) {
		return userService.getUserById(id);
	}
	
	@GetMapping("/all")
	public List<User> getAllUser() {
		return userService.getAllUsers();
	}

}