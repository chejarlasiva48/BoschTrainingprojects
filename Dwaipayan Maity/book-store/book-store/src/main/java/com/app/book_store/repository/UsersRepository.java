package com.app.book_store.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.book_store.entities.UsersEntity;

public interface UsersRepository extends JpaRepository<UsersEntity, Long> {
    Optional<UsersEntity> findByUsername(String username);
}
