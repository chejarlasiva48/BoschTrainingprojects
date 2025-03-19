package com.bosch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.model.Driver;
import com.bosch.service.DriverService;


//api for driver details
@RestController
@RequestMapping("/api/driver")
public class DriverController {

	@Autowired
	private DriverService driverService;

	@PostMapping("/create")
	public Driver createBooking(@RequestBody Driver driver) {
		return driverService.createDriver(driver);
	}

	@GetMapping("/{id}")
	public Driver getDriver(@PathVariable Long id) {
		return driverService.getDriverById(id);
	}

}