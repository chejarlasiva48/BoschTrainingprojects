package com.bosch.carbookingsystem.service.api;

import com.bosch.carbookingsystem.dto.Booking;

public interface IBookingService {
	Booking createBooking(Booking booking);
	Booking getBookingById(Long id);
	void cancelBooking(Long id);
}