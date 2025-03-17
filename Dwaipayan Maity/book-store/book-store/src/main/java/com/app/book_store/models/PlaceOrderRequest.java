package com.app.book_store.models;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PlaceOrderRequest {

	@NotNull
	@Size(min = 1, max = 1000, message = "book title cannot be empty")
	private String title;

	@NotNull
	@Min(value = 1, message = "book quantity must be at least 1")
	@Max(value = 100000, message = "book quantity cannot exceed 10000")
	private int quantity;
}