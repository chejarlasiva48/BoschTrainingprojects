package com.bosch.bookstore.service.api;

import com.bosch.bookstore.dto.Order;

public interface IOrderService {
	Order createOrder(Long bookId, Integer quantity);
}