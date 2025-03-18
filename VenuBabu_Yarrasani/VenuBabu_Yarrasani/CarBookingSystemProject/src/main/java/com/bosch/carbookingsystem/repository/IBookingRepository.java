package com.bosch.carbookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bosch.carbookingsystem.dto.Booking;

public interface IBookingRepository extends JpaRepository<Booking, Long> {

	Booking save(Booking booking);
}