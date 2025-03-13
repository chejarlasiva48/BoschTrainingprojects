package com.bosch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bosch.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUserName(String userName);

	User save(User user);
}