package com.trainbooking.trainbooking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trainbooking.trainbooking.dao.BookingRepository;
import com.trainbooking.trainbooking.entity.Booking;


@Service
public class BookingService {

	@Autowired
	private BookingRepository bookingRepository;

	public List<Booking> getAllBookings() {
		return bookingRepository.findAll();
	}

	public Booking findById(int theId) {
		Optional<Booking> result = bookingRepository.findById(theId);

		Booking theBooking = null;

		if (result.isPresent()) {
			theBooking = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find booking id - " + theId);
		}

		return theBooking;
	}

	public void addBooking(Booking booking) {
		bookingRepository.save(booking);
	}

	public void deleteById(int theId) {
		bookingRepository.deleteById(theId);
	}

}
