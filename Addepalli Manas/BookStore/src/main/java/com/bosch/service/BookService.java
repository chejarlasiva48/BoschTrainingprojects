package com.bosch.service;

import java.util.List;

import com.bosch.model.Book;

public interface BookService {
	List<Book> getAllBooks();

	void addNewBook(Book book);

	void removeBook(Long id);

	void updateBookPrice(Long id, int price);

	Book getBookById(Long bookId);

}