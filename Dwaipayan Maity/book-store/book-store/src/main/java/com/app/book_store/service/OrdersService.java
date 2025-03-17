package com.app.book_store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.book_store.entities.BooksEntity;
import com.app.book_store.entities.OrdersEntity;
import com.app.book_store.models.CustomException;
import com.app.book_store.models.PlaceOrderRequest;
import com.app.book_store.repository.BooksRepository;
import com.app.book_store.repository.OrdersRepository;

@Service
public class OrdersService {
	@Autowired
	private OrdersRepository ordersRepository;

	@Autowired
	private BooksRepository booksRepository;

	public OrdersEntity placeOrder(Integer userId, PlaceOrderRequest order) throws CustomException {
		double totalPrice = 0;
		OrdersEntity ordersEntity = new OrdersEntity();
		StringBuilder receiptBuilder = new StringBuilder();

		BooksEntity book = booksRepository.findByTitle(order.getTitle());

		if (book != null) {

			totalPrice = book.getPrice() * order.getQuantity();

			receiptBuilder.append("Book: ").append(book.getTitle()).append(" - ").append(book.getPrice()).append("\n");

			String paymentReceipt = "Receipt#" + System.currentTimeMillis();

			ordersEntity.setBookId(book.getId());
			ordersEntity.setUserId(userId);
			ordersEntity.setTotalPrice(totalPrice);
			ordersEntity.setPaymentReceipt(paymentReceipt);

			return ordersRepository.save(ordersEntity);
		} else {
			throw new CustomException("Exception while trying to update database", "Record not found");
		}
	}
}
