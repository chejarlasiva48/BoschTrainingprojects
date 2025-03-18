package com.bosch.bookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bosch.bookingsystem.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {

	Booking save(Booking booking);
}