package com.bosch.bookstore.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.bookstore.dto.Payment;
import com.bosch.bookstore.service.api.IPaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private IPaymentService paymentService;

    @PostMapping("/pay")
    public Payment makePayment(@RequestParam Long orderId, @RequestParam Double amount) {
        return paymentService.createPayment(orderId, amount);
    }
}