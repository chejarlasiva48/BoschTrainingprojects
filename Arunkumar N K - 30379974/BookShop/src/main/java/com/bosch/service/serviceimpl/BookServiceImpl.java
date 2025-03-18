package com.bosch.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.model.Book;
import com.bosch.repository.BookRepository;
import com.bosch.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	public void addBook(Book book) {
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