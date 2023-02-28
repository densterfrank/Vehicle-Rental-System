package com.mycar;

import java.time.LocalDate;
/**
 
This class consists of all attributes of customer .

 *
 */
public class Customer {
	private String cus_GivenName;
	private String cus_LastName;
	private String cus_Email;
	private int passenger;
	private LocalDate pickUpDate;
	private LocalDate returnDate;
	private boolean pay;
	public Customer(String cus_GivenName, String cus_LastName, String cus_Email, int passenger, LocalDate pickUpDate,
			LocalDate returnDate, boolean pay) {
		super();
		this.cus_GivenName = cus_GivenName;
		this.cus_LastName = cus_LastName;
		this.cus_Email = cus_Email;
		this.passenger = passenger;
		this.pickUpDate = pickUpDate;
		this.returnDate = returnDate;
		this.pay = pay;
	}
	public String getCus_GivenName() {
		return cus_GivenName;
	}
	public void setCus_GivenName(String cus_GivenName) {
		this.cus_GivenName = cus_GivenName;
	}
	public String getCus_LastName() {
		return cus_LastName;
	}
	public void setCus_LastName(String cus_LastName) {
		this.cus_LastName = cus_LastName;
	}
	public String getCus_Email() {
		return cus_Email;
	}
	public void setCus_Email(String cus_Email) {
		this.cus_Email = cus_Email;
	}
	public int getPassenger() {
		return passenger;
	}
	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}
	public LocalDate getPickUpDate() {
		return pickUpDate;
	}
	public void setPickUpDate(LocalDate pickUpDate) {
		this.pickUpDate = pickUpDate;
	}
	public LocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	public boolean isPay() {
		return pay;
	}
	public void setPay(boolean pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return "Customer [cus_GivenName=" + cus_GivenName + ", cus_LastName=" + cus_LastName + ", cus_Email="
				+ cus_Email + "]";
	}
	
	public void bookingDetails(){
		System.out.println("-------------------------------------------------------");
		System.out.println("> ongratulations! Your vehicle is booked. A receipt has been sent to your email.\r\n"
				+ " We will soon be in touch before your pick-up date.");
		System.out.println("-------------------------------------------------------");
	  }
	
	
	
}
