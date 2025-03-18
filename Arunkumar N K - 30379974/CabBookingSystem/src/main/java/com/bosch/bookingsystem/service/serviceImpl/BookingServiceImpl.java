package com.bosch.bookingsystem.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.bookingsystem.model.Booking;
import com.bosch.bookingsystem.repository.BookingRepository;
import com.bosch.bookingsystem.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	private BookingRepository bookingRepository;

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