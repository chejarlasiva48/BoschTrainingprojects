package com.app.cab.booking.models;

import java.util.Date;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class BookingRequest {

	@NotNull
	@Size(min = 1, max = 1000, message = "pickupLocation cannot be empty")
	private String pickupLocation;

	@NotNull
	@Size(min = 1, max = 1000, message = "destination cannot be empty")
	private String destination;

	@NotNull
	private Date pickupDate;

	@NotNull
	@Size(min = 1, max = 1000, message = "driver name cannot be empty")
	private String driverName;

	@NotNull
	@Size(min = 1, max = 1000, message = "driverContact cannot be empty")
	private String driverContact;
}
