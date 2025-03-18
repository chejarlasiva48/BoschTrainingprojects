package com.bosch.carbookingsystem.service.api;

import com.bosch.carbookingsystem.dto.Driver;

public interface IDriverService {
	Driver createDriver(Driver driver);
	Driver getDriverById(Long id);
}