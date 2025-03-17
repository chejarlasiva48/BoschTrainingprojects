package com.app.cab.booking.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserRequest {

	@NotNull
	@Size(min = 1, max = 1000, message = "username cannot be empty")
	private String username;

	@NotNull
	@Size(min = 1, max = 1000, message = "password cannot be empty")
	private String password;

}
