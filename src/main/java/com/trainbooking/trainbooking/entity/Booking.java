package com.trainbooking.trainbooking.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String source;
	private String destination;
	private String date;

	@Column(name="passenger_name")
	private String passengerName;

	public Booking() {
	}

	public Booking(int id, String source, String destination, String date, String passengerName) {
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.date = date;
		this.passengerName = passengerName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	@Override
	public String toString() {
		return "Booking{" +
				"id=" + id +
				", source='" + source + '\'' +
				", destination='" + destination + '\'' +
				", date='" + date + '\'' +
				", passengerName='" + passengerName + '\'' +
				'}';
	}
}