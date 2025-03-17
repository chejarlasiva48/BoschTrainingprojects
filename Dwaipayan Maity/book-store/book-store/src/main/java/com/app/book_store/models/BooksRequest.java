package com.app.book_store.models;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class BooksRequest {

	@NotNull
	@Size(min = 1, max = 1000, message = "book title cannot be empty")
	private String title;

	@NotNull
	@DecimalMin(value = "0.01", message = "book price must be at least 0.01")
	@DecimalMax(value = "10000", message = "book price cannot exceed 10000")
	private Double price;
}
