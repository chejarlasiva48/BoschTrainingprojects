package com.bosch.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.model.Driver;
import com.bosch.repository.DriverRepository;
import com.bosch.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	private DriverRepository driverRepository;

	public Driver createDriver(Driver driver) {
		return driverRepository.save(driver);
	}

	public Driver getDriverById(Long id) {
		return driverRepository.findById(id).orElse(null);
	}

}
