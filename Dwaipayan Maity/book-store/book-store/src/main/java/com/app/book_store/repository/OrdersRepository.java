package com.app.book_store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.book_store.entities.BooksEntity;
import com.app.book_store.entities.OrdersEntity;

public interface OrdersRepository extends JpaRepository<OrdersEntity, Long> {
	List<BooksEntity> findByUserId(Integer userId);
}
