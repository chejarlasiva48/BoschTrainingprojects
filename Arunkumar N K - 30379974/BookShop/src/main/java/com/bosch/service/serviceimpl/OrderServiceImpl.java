package com.bosch.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.model.Book;
import com.bosch.model.Order;
import com.bosch.repository.OrderRepository;
import com.bosch.service.BookService;
import com.bosch.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	    @Autowired
	    private BookService bookService;

	    @Autowired
	    private OrderRepository orderRepository;

	    public Order createOrder(Long bookId, Integer quantity) {
	        Book book = bookService.getBookById(bookId);
	        if (book != null && book.getQuantity() >= quantity) {
	            book.setQuantity(book.getQuantity() - quantity);;
	            Order order = new Order();
	            order.setBookId(bookId);
	            order.setQuantity(quantity);
	            order.setTotalAmount(book.getUnitPrice() * quantity);
	            return orderRepository.save(order);
	        }
	        return null;
	    }
	}