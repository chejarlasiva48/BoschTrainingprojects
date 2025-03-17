package com.app.book_store.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.book_store.entities.BooksEntity;
import com.app.book_store.models.BooksRequest;
import com.app.book_store.models.CustomException;
import com.app.book_store.repository.BooksRepository;

@Service
public class BooksService {

	@Autowired
	private BooksRepository booksRepository;

	public List<BooksEntity> getAllBooks() {
		return booksRepository.findAll();
	}

	public BooksEntity addBook(BooksRequest booksRequest) {
		BooksEntity book = new BooksEntity();
		book.setPrice(booksRequest.getPrice());
		book.setTitle(booksRequest.getTitle());
		return booksRepository.save(book);
	}

	public void removeBook(Integer bookId) {
		booksRepository.deleteById(bookId);
	}

	public void increaseBookPrice(Integer bookId, double priceIncrease) throws CustomException {
		Optional<BooksEntity> book = booksRepository.findById(bookId);
		BooksEntity booksEntity = book.get();
		if (booksEntity != null) {
			booksEntity.setPrice(booksEntity.getPrice() + priceIncrease);
			booksRepository.save(booksEntity);
		} else {
			throw new CustomException("Exception while trying to increase book price", "Book not found");
		}
	}
}
