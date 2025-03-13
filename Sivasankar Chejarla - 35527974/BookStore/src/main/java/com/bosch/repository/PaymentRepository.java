package com.bosch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bosch.model.Book;
import com.bosch.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Book, Long> {

	Payment save(Payment payment);
}