package com.bosch.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bosch.bookstore.dto.Book;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {
}