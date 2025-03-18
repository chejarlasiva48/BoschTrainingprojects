package com.bosch.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bosch.bookstore.dto.Book;
import com.bosch.bookstore.dto.Payment;

@Repository
public interface IPaymentRepository extends JpaRepository<Book, Long> {

	Payment save(Payment payment);
}