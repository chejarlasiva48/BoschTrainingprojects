package com.app.cab.booking.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.cab.booking.entities.BookingEntity;
import com.app.cab.booking.entities.UsersEntity;
import com.app.cab.booking.exceptions.CustomException;
import com.app.cab.booking.models.BookingRequest;
import com.app.cab.booking.repositories.BookingRepository;
import com.app.cab.booking.repositories.UserRepository;

@Service
public class BookingService {

	@Autowired
	private BookingRepository bookingRepository;

	@Autowired
	private UserRepository userRepository;

	public BookingEntity createBooking(BookingRequest booking, Integer Id) {
		BookingEntity bookEntity = new BookingEntity();
		bookEntity.setDestination(booking.getDestination());
		bookEntity.setDriverContact(booking.getDriverContact());
		bookEntity.setDriverName(booking.getDriverName());
		bookEntity.setPickupDate(booking.getPickupDate());
		bookEntity.setPickupLocation(booking.getPickupLocation());

		Optional<UsersEntity> userEntity = userRepository.findById(Id);
		if (userEntity.isPresent()) {
			bookEntity.setUser(userEntity.get());
		}
		return bookingRepository.save(bookEntity);
	}

	public BookingEntity getBookingById(Integer bookingId) {
		Optional<BookingEntity> bookingEntity = bookingRepository.findById(bookingId);
		if (bookingEntity.isPresent()) {
			return bookingEntity.get();
		}
		return null;
	}

	public void cancelBooking(Integer bookingId) throws CustomException {
		Optional<BookingEntity> booking = bookingRepository.findById(bookingId);
		if (booking.isEmpty()) {
			throw new CustomException("Booking with id " + bookingId + " not found",
					"Booking with id " + bookingId + " not found");
		}
		bookingRepository.delete(booking.get());
	}
}
