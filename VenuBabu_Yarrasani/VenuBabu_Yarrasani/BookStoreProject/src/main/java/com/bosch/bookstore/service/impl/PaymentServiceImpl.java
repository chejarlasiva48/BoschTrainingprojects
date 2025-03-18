package com.bosch.bookstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.bookstore.dto.Payment;
import com.bosch.bookstore.repository.IPaymentRepository;
import com.bosch.bookstore.service.api.IPaymentService;

@Service
public class PaymentServiceImpl implements IPaymentService {

	@Autowired
	private IPaymentRepository paymentRepository;

	public Payment createPayment(Long orderId, Double amount) {
		Payment payment = new Payment();
		payment.setOrderId(orderId);
		payment.setAmount(amount);
		payment.setReceipt("Receipt for order " + orderId);
		return paymentRepository.save(payment);
	}
}