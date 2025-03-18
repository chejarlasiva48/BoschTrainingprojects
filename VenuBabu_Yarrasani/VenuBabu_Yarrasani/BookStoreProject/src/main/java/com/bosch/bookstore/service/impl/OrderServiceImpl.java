package com.bosch.bookstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.bookstore.dto.Book;
import com.bosch.bookstore.dto.Order;
import com.bosch.bookstore.repository.IOrderRepository;
import com.bosch.bookstore.service.api.IBookService;
import com.bosch.bookstore.service.api.IOrderService;

@Service
public class OrderServiceImpl implements IOrderService {

	    @Autowired
	    private IBookService bookService;

	    @Autowired
	    private IOrderRepository orderRepository;

	    public Order createOrder(Long bookId, Integer quantity) {
	        Book book = bookService.getBookById(bookId);
	        if (book != null && book.getQuantity() >= quantity) {
	            book.setQuantity(book.getQuantity() - quantity);;
	            Order order = new Order();
	            order.setBookId(bookId);
	            order.setQuantity(quantity);
	            order.setTotalPrice(book.getPrice() * quantity);
	            return orderRepository.save(order);
	        }
	        return null;
	    }
	}