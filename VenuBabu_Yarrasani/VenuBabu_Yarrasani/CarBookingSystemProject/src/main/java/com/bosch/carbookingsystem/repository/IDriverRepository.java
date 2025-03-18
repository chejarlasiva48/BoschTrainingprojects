package com.bosch.carbookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bosch.carbookingsystem.dto.Driver;

public interface IDriverRepository extends JpaRepository<Driver, Long> {

	Driver findByName(String name);

	Driver save(Driver driver);
}