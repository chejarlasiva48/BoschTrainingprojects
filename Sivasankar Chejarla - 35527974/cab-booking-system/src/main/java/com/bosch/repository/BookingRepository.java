package com.bosch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bosch.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {

	Booking save(Booking booking);
}