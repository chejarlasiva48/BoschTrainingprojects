package com.bosch.bookstore.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.bookstore.dto.Book;
import com.bosch.bookstore.dto.User;
import com.bosch.bookstore.service.api.IBookService;
import com.bosch.bookstore.service.api.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IBookService bookService;

	@Autowired
	private IUserService userService;

	@PostMapping("/register")
	public User register(@RequestBody User user) {
		return userService.registerUser(user);
	}

	@PostMapping("/login")
	public User login(@RequestParam String username) {
		return userService.loginUser(username);
	}

	@GetMapping("/view")
	public List<Book> viewBooks() {
		return bookService.getAllBooks();
	}
	
}