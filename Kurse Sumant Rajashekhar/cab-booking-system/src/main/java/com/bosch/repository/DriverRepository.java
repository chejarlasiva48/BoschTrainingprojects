package com.bosch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bosch.model.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {

	Driver findByName(String name);

	@SuppressWarnings("unchecked")
	Driver save(Driver driver);
}