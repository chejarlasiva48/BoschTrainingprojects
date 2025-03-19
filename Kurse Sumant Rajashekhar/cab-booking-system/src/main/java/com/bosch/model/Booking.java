package com.bosch.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


//model for booking a car
@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long userId;
	private Long driverId;
	private String pickUpLocation;
	private String dropLocation;
	private LocalDateTime journeyTime;
	private String status;

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

	public String getDropLocation() {
		return dropLocation;
	}

	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}

	public LocalDateTime getJourneyTime() {
		return journeyTime;
	}

	public void setJourneyTime(LocalDateTime journeyTime) {
		this.journeyTime = journeyTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Booking(Long id, Long userId, Long driverId, String pickUpLocation, String dropLocation,
			LocalDateTime journeyTime, String status) {
		super();
		this.id = id;
		this.userId = userId;
		this.driverId = driverId;
		this.pickUpLocation = pickUpLocation;
		this.dropLocation = dropLocation;
		this.journeyTime = journeyTime;
		this.status = status;
	}

	public Booking() {
		// TODO Auto-generated constructor stub
	}

}