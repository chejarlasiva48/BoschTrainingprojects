package com.bosch.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.model.Payment;
import com.bosch.repository.PaymentRepository;
import com.bosch.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;

	public Payment createPayment(Long orderId, Double amount) {
		Payment payment = new Payment();
		payment.setOrderId(orderId);
		payment.setAmount(amount);
		payment.setReceipt("Payment receipt generated successfully");
		return paymentRepository.save(payment);
	}
}