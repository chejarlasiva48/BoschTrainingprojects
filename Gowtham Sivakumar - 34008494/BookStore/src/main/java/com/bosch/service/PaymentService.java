package com.bosch.service;

import com.bosch.model.Payment;

public interface PaymentService {
	Payment createPayment(Long orderId, Double amount);
}
