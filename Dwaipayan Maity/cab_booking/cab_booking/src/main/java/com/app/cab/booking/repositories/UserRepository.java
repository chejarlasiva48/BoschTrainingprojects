package com.app.cab.booking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.cab.booking.entities.UsersEntity;

public interface UserRepository extends JpaRepository<UsersEntity, Integer> {
	UsersEntity findByUsername(String username);
}
