package com.bosch.bookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bosch.bookingsystem.model.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {

	Driver findByName(String name);
	Driver save(Driver driver);
}