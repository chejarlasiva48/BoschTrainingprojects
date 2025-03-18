package com.bosch.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bosch.bookstore.dto.Book;
import com.bosch.bookstore.dto.Order;

@Repository
public interface IOrderRepository extends JpaRepository<Book, Long> {

	Order save(Order order);
}