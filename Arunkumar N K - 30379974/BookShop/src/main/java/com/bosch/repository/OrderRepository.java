package com.bosch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bosch.model.Book;
import com.bosch.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Book, Long> {

	Order save(Order order);
}