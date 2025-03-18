package com.bosch.carbookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bosch.carbookingsystem.dto.User;

public interface IUserRepository extends JpaRepository<User, Long> {
	User findByUserName(String userName);

	User save(User user);
}