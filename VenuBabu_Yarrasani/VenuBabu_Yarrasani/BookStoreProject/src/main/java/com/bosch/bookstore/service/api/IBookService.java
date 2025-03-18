package com.bosch.bookstore.service.api;

import java.util.List;

import com.bosch.bookstore.dto.Book;

public interface IBookService {
	List<Book> getAllBooks();

	void addNewBook(Book book);

	void removeBook(Long id);

	void updateBookPrice(Long id, int price);

	Book getBookById(Long bookId);

}