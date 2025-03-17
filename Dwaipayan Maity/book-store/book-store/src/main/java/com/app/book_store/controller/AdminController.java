package com.app.book_store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.book_store.entities.BooksEntity;
import com.app.book_store.models.BooksRequest;
import com.app.book_store.service.BooksService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private BooksService booksService;

	@PostMapping("/addBook")
	public BooksEntity addBook(@RequestBody @Valid BooksRequest book) {
		return booksService.addBook(book);
	}

	@GetMapping("/viewBooks")
	public List<BooksEntity> viewBooks() {
		return booksService.getAllBooks();
	}

	@DeleteMapping("/removeBook/{bookId}")
	public String removeBook(@PathVariable Integer bookId) {
		booksService.removeBook(bookId);
		return "Record with id " + bookId + " deleted successfully";
	}

	@PutMapping("/increasePrice/{bookId}/{priceIncrease}")
	public String increasePrice(@PathVariable Integer bookId, @PathVariable double priceIncrease) throws Exception {
		booksService.increaseBookPrice(bookId, priceIncrease);
		return "Record with id " + bookId + " updated successfully";
	}
}
