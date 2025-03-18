package com.bosch.bookingsystem.service;

import com.bosch.bookingsystem.model.Booking;

public interface BookingService {
	Booking createBooking(Booking booking);
	Booking getBookingById(Long id);
	void cancelBooking(Long id);
}