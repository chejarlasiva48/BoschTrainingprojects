package com.app.book_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.book_store.entities.BooksEntity;

public interface BooksRepository extends JpaRepository<BooksEntity, Integer> {

	BooksEntity findByTitle(String title);
}
