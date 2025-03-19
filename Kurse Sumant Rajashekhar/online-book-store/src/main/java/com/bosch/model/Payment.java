package com.bosch.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


//model to create payment receipt
@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long orderId;
	private Double amount;
	private String paymentReceipt;

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
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getReceipt() {
		return paymentReceipt;
	}

	public void setReceipt(String receipt) {
		this.paymentReceipt = receipt;
	}

	public Payment(Long id, Long orderId, Double amount, String paymentReceipt) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.amount = amount;
		this.paymentReceipt = paymentReceipt;
	}

	public Payment() {
	}

}
