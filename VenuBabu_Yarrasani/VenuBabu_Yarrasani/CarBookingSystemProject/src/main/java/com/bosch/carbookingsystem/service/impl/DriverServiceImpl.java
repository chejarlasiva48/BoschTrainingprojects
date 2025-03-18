package com.bosch.carbookingsystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.carbookingsystem.dto.Driver;
import com.bosch.carbookingsystem.repository.IDriverRepository;
import com.bosch.carbookingsystem.service.api.IDriverService;

@Service
public class DriverServiceImpl implements IDriverService {

	@Autowired
	private IDriverRepository driverRepository;

	public Driver createDriver(Driver driver) {
		return driverRepository.save(driver);
	}

	public Driver getDriverById(Long id) {
		return driverRepository.findById(id).orElse(null);
	}

}
