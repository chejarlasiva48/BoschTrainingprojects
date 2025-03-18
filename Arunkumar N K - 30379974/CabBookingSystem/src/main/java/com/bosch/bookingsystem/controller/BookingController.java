package com.bosch.bookingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.bookingsystem.model.Booking;
import com.bosch.bookingsystem.service.BookingService;

@RestController
@RequestMapping("/bookings")
public class BookingController {

	@Autowired
	private BookingService bookingService;

	@PostMapping("/create")
	public Booking createBooking(@RequestBody Booking booking) {
		return bookingService.createBooking(booking);
	}

	@GetMapping("/{id}")
	public Booking getBooking(@PathVariable Long id) {
		return bookingService.getBookingById(id);
	}

	@PostMapping("/cancel/{id}")
	public void cancelBooking(@PathVariable Long id) {
		bookingService.cancelBooking(id);
	}

}