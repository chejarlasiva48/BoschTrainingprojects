package com.app.cab.booking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.cab.booking.entities.BookingEntity;

public interface BookingRepository extends JpaRepository<BookingEntity, Integer> {
}
