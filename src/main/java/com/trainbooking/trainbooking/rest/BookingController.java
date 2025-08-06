package com.trainbooking.trainbooking.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trainbooking.trainbooking.entity.Booking;
import com.trainbooking.trainbooking.service.BookingService;


@RestController
@RequestMapping("/api")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @Autowired
    public BookingController(BookingService theBookingService) {
        bookingService = theBookingService;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/bookings")
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @GetMapping("/bookings/{bookingId}")
    public Booking getBooking(@PathVariable int bookingId) {

        Booking theBooking = bookingService.findById(bookingId);

        if (theBooking == null) {
            throw new RuntimeException("Booking id not found - " + bookingId);
        }

        return theBooking;
    }

    @PostMapping("/bookings")
    public ResponseEntity<String> bookTicket(@RequestBody Booking booking) {
        bookingService.addBooking(booking);
        return ResponseEntity.ok("Booking successful!");
    }

    @DeleteMapping("/bookings/{bookingId}")
    public String deleteBooking(@PathVariable int bookingId) {

        Booking booking = bookingService.findById(bookingId);

        // throw exception if null

        if (booking == null) {
            throw new RuntimeException("Booking id not found - " + bookingId);
        }

        bookingService.deleteById(bookingId);

        return "Deleted booking id - " + bookingId;
    }
}





