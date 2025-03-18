package com.bosch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.model.Book;
import com.bosch.model.User;
import com.bosch.service.BookService;
import com.bosch.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private BookService bookService;

	@Autowired
	private UserService userService;

	@GetMapping("/all")
	public List<User> getUsers() {
		return userService.getAllUsers();
	}
	
	@PostMapping("/register")
	public User register(@RequestBody User user) {
		return userService.registerUser(user);
	}

	@PostMapping("/login")
	public User login(@RequestParam String username, @RequestParam String pass ) {
		return userService.login(username, pass);
	}

	@GetMapping("/view")
	public List<Book> viewBooks() {
		return bookService.getAllBooks();
	}
	
}