package com.bosch.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.model.Booking;
import com.bosch.repository.BookingRepository;
import com.bosch.service.BookingService;

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