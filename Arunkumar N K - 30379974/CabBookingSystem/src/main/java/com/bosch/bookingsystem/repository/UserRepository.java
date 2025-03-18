package com.bosch.bookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bosch.bookingsystem.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUserName(String userName);
	User findByEmail(String email);
	User save(User user);
}