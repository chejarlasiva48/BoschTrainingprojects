package com.bosch.carbookingsystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.carbookingsystem.dto.Booking;
import com.bosch.carbookingsystem.repository.IBookingRepository;
import com.bosch.carbookingsystem.service.api.IBookingService;

@Service
public class BookingServiceImpl implements IBookingService {

	@Autowired
	private IBookingRepository bookingRepository;

	public Booking createBooking(Booking booking) {
		return bookingRepository.save(booking);
	}

	public Booking getBookingById(Long id) {
		return bookingRepository.findById(id).orElse(null);
	}

	public void cancelBooking(Long id) {
		Booking booking = bookingRepository.findById(id).orElse(null);
		if (booking != null) {
			booking.setStatus("Cancelled");
			bookingRepository.save(booking);
		}
	}

}