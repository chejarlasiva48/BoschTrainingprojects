package com.bosch.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String author;
	private int quantity;
	private double unitprice;

	
	public Book() {
        //Default constructor is explicitly added as we have parameterized constructor.
    }
	
	public Book(Long id, String title, String author, int quantity, double unitPrice) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.quantity = quantity;
		this.unitprice = unitPrice;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitprice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitprice = unitPrice;
	}

	

}
