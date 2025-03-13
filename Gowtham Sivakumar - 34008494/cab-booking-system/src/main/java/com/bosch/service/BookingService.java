package com.bosch.service;

import com.bosch.model.Booking;

public interface BookingService {
	Booking createBooking(Booking booking);
	Booking getBookingById(Long id);
	void cancelBooking(Long id);
}