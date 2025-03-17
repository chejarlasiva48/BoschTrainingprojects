package com.app.cab.booking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.cab.booking.entities.BookingEntity;
import com.app.cab.booking.entities.UsersEntity;
import com.app.cab.booking.exceptions.CustomException;
import com.app.cab.booking.models.BookingRequest;
import com.app.cab.booking.service.BookingService;
import com.app.cab.booking.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/booking")
public class BookingController {

	@Autowired
	private BookingService bookingService;

	@Autowired
	private UserService userService;

	@PostMapping("/book/{username}")
	public String createBooking(@RequestBody @Valid BookingRequest booking, @PathVariable String username)
			throws CustomException {
		UsersEntity userEntity = userService.findByUsername(username);
		if (userEntity != null) {
			BookingEntity bookedEntity = bookingService.createBooking(booking, userEntity.getId());
			return "Booking created for user " + username + " with booking id- " + bookedEntity.getId();

		} else {
			throw new CustomException("User with name " + username + " not found",
					"User with name " + username + " not found");
		}
	}

	@GetMapping("/status/{id}")
	public BookingEntity viewBookingStatus(@PathVariable Integer id) throws CustomException {
		BookingEntity booking = bookingService.getBookingById(id);
		if (booking == null) {
			throw new CustomException("Booking with id " + id + " not found", "Booking with id " + id + " not found");
		}
		return booking;
	}

	@GetMapping("/cancel/{id}")
	public String cancelBooking(@PathVariable Integer id) throws CustomException {
		bookingService.cancelBooking(id);
		return "Booking cancelled.";

	}
}
