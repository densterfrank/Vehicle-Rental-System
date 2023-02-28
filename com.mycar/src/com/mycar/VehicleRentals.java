/**
 * 
 */
package com.mycar;

import java.time.LocalDate;

/**
 *


This class is parent of all Vehicles Rentals which takes two attributes and has method to calculate Total Amount.


 *
 */
abstract public class VehicleRentals {
	
	private LocalDate pickUpDate;
	private LocalDate returnDate;
	
	
	public VehicleRentals(LocalDate pickUpDate, LocalDate returnDate) {
		super();
		this.pickUpDate = pickUpDate;
		this.returnDate = returnDate;
	}
	
	
	


	public LocalDate getPickUpDate() {
		return pickUpDate;
	}


	public LocalDate getReturnDate() {
		return returnDate;
	}


	public int findNoOfDays() {
		return 0;
		
	}
	public abstract double calculateTotal();
}
