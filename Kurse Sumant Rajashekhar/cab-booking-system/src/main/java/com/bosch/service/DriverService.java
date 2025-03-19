package com.bosch.service;

import com.bosch.model.Driver;

public interface DriverService {
	Driver createDriver(Driver driver);
	Driver getDriverById(Long id);
}