package com.app.cab.booking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.cab.booking.entities.UsersEntity;
import com.app.cab.booking.models.UserRequest;
import com.app.cab.booking.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/signup")
	public UsersEntity signup(@RequestBody @Valid UserRequest user) {
		return userService.saveUser(user);
	}

	@PostMapping("/login")
	public String login(@RequestBody @Valid UserRequest user) {
		UsersEntity userEntity = userService.findByUsername(user.getUsername());
		if (userEntity != null) {
			return user.getUsername() + " is logged in!";
		} else {
			return user.getUsername() + " doesn't exist";
		}
	}
}
