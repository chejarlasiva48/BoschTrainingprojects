package com.bosch.bookstore.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.bookstore.dto.Order;
import com.bosch.bookstore.service.api.IOrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @PostMapping("/create")
    public Order createOrder(@RequestParam Long bookId, @RequestParam Integer quantity) {
        return orderService.createOrder(bookId, quantity);
    }
}