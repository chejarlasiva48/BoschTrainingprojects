package com.bosch.bookstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.bookstore.dto.Book;
import com.bosch.bookstore.repository.IBookRepository;
import com.bosch.bookstore.service.api.IBookService;

@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	private IBookRepository bookRepository;

	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	public void addNewBook(Book book) {
		bookRepository.save(book);
	}

	public void removeBook(Long id) {
		bookRepository.deleteById(id);
	}

	public void updateBookPrice(Long id, int price) {
		Book book = bookRepository.findById(id).orElse(null);
		if (book != null) {
			book.setQuantity(price);
			bookRepository.save(book);
		}
	}

	@Override
	public Book getBookById(Long bookId) {
        return bookRepository.findById(bookId).orElse(null);
	}

}