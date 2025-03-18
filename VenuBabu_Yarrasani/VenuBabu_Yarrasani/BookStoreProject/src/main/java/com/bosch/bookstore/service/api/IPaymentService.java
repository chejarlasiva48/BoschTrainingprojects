package com.bosch.bookstore.service.api;

import com.bosch.bookstore.dto.Payment;

public interface IPaymentService {
	Payment createPayment(Long orderId, Double amount);
}
