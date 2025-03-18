package com.bosch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.model.Order;
import com.bosch.model.Payment;
import com.bosch.service.OrderService;
import com.bosch.service.PaymentService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;
    
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/create")
    public Order createOrder(@RequestParam Long bookId, @RequestParam Integer quantity) {
        return orderService.createOrder(bookId, quantity);
    }
    
    @PostMapping("/payment")
    public Payment makePayment(@RequestParam Long orderId, @RequestParam Double amount) {
        return paymentService.createPayment(orderId, amount);
    }
}