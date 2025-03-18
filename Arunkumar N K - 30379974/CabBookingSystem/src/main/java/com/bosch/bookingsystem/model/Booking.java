package com.bosch.bookingsystem.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long userId;
	private Long driverId;
	private String pickUpLocation;
	private String dropOffLocation;
	private LocalDateTime pickupTime;
	private String status;

	public Booking() {
		// TODO Auto-generated constructor stub
	}
	
	public Booking(Long id, Long userId, Long driverId, String pickUpLocation, String dropOffLocation,
			LocalDateTime pickupTime, String status) {
		super();
		this.id = id;
		this.userId = userId;
		this.driverId = driverId;
		this.pickUpLocation = pickUpLocation;
		this.dropOffLocation = dropOffLocation;
		this.pickupTime = pickupTime;
		this.status = status;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getDriverId() {
		return driverId;
	}

	public void setDriverId(Long driverId) {
		this.driverId = driverId;
	}

	public String getPickUpLocation() {
		return pickUpLocation;
	}

	public void setPickUpLocation(String pickUpLocation) {
		this.pickUpLocation = pickUpLocation;
	}

	public String getDropOffLocation() {
		return dropOffLocation;
	}

	public void setDropOffLocation(String dropOffLocation) {
		this.dropOffLocation = dropOffLocation;
	}

	public LocalDateTime getPickupTime() {
		return pickupTime;
	}

	public void setPickupTime(LocalDateTime pickupTime) {
		this.pickupTime = pickupTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


}