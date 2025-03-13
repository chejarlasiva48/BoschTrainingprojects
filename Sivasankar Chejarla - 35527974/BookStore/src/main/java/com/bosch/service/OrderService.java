package com.bosch.service;

import com.bosch.model.Order;

public interface OrderService {
	Order createOrder(Long bookId, Integer quantity);
}