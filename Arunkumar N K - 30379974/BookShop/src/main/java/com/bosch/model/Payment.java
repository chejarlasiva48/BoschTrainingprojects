package com.bosch.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "payments")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long orderId;
	private Double totalAmount;


	public Payment() {
		// default constructor
	}
	
	public Payment(Long id, Long orderId, Double amount) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.totalAmount = amount;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Double getAmount() {
		return totalAmount;
	}

	public void setAmount(Double amount) {
		this.totalAmount = amount;
	}

}
