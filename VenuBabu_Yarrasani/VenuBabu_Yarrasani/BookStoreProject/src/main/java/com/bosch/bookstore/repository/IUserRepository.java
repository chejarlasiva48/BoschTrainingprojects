package com.bosch.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bosch.bookstore.dto.User;


@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}