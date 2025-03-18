package com.bosch.bookingsystem.service;

import com.bosch.bookingsystem.model.Driver;

public interface DriverService {
	Driver createDriver(Driver driver);
	Driver getDriverById(Long id);
}