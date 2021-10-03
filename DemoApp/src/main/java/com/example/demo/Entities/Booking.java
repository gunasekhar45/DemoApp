package com.example.demo.Entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Booking {
	public Booking(){
		
	}
	@Id
	@GeneratedValue
	int bookingId;
	@ManyToOne
	Shows show;
	@ManyToOne
	Users userId;
	int active;
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	@OneToMany(cascade=CascadeType.ALL)
	List<BookingDetail> bookingDetails;
	public List<BookingDetail> getBookingDetails() {
		return bookingDetails;
	}
	public void setBookingDetails(List<BookingDetail> bookingDetails) {
		this.bookingDetails = bookingDetails;
	}
	Date bookedDate;
	Date showDate;
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	
	public Shows getShow() {
		return show;
	}
	public void setShow(Shows show) {
		this.show = show;
	}
	public Date getShowDate() {
		return showDate;
	}
	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}
	public Users getUserId() {
		return userId;
	}
	public void setUserId(Users userId) {
		this.userId = userId;
	}
	public Date getBookedDate() {
		return bookedDate;
	}
	public void setBookedDate(Date bookedDate) {
		this.bookedDate = bookedDate;
	}
	
	
	public Booking(int bookingId, Shows show, Users userId, List<BookingDetail> bookingDetails, Date bookedDate,Date showDate) {
		super();
		this.bookingId = bookingId;
		this.show = show;
		this.userId = userId;
		this.bookingDetails = bookingDetails;
		this.bookedDate = bookedDate;
		this.showDate = showDate;
	}
	public Booking(Date bookedDate, Date showDate) {
		super();
		this.bookedDate = bookedDate;
		this.showDate = showDate;
	}
	
	
}