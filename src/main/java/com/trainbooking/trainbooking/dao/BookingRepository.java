package com.trainbooking.trainbooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trainbooking.trainbooking.entity.Booking;


public interface BookingRepository extends JpaRepository<Booking, Integer> {

    // that's it ... no need to write any code LOL!

}
