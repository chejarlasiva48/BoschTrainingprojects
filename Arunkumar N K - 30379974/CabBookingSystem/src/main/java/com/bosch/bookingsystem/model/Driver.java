package com.bosch.bookingsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Driver {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String phone;
	private String vehicleNo;
	private String vehicleKind;

	public Driver() {
		// TODO Auto-generated constructor stub
	}
	
	public Driver(Long id, String name, String phone, String vehicleNo) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.vehicleNo = vehicleNo;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getVehicleKind() {
		return vehicleKind;
	}

	public void setVehicleKind(String vehicleKind) {
		this.vehicleKind = vehicleKind;
	}

	
}