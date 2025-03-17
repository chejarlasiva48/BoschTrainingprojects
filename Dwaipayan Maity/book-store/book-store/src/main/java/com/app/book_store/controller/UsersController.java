package com.app.book_store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.book_store.entities.BooksEntity;
import com.app.book_store.entities.OrdersEntity;
import com.app.book_store.entities.UsersEntity;
import com.app.book_store.models.CustomException;
import com.app.book_store.models.PlaceOrderRequest;
import com.app.book_store.models.UserRequest;
import com.app.book_store.service.BooksService;
import com.app.book_store.service.OrdersService;
import com.app.book_store.service.UsersService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UsersController {

	@Autowired
	private UsersService usersService;

	@Autowired
	private OrdersService ordersService;

	@Autowired
	private BooksService booksService;

	@PostMapping("/register")
	public UsersEntity register(@RequestBody UserRequest user) {
		return usersService.createUser(user);
	}

	@PostMapping("/login")
	public UsersEntity login(@RequestBody @Valid UserRequest user) throws CustomException {
		return usersService.loginUser(user.getUsername(), user.getPassword());
	}

	@PostMapping("/placeOrder/{userId}")
	public OrdersEntity placeOrder(@PathVariable Integer userId, @RequestBody @Valid PlaceOrderRequest orderRequest)
			throws CustomException {
		return ordersService.placeOrder(userId, orderRequest);
	}

	@GetMapping("/viewBooks")
	public List<BooksEntity> viewBooks() {
		return booksService.getAllBooks();
	}
}
