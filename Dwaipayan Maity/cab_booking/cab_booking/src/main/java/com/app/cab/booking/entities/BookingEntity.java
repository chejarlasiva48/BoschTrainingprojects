package com.app.cab.booking.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "booking")
public class BookingEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private UsersEntity user;

	@Column(name = "pickup_location")
	private String pickupLocation;
	
	@Column(name = "destination")
	private String destination;
	
	@Column(name = "pickup_date")
	private Date pickupDate;
	
	@Column(name = "driver_name")
	private String driverName;
	
	@Column(name = "driver_contact")
	private String driverContact;
}
