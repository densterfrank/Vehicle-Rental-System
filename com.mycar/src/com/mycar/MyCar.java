package com.mycar;

import java.time.LocalDate;
import java.util.Scanner;
/**
 * 
MyCar
This class is child of VehicleRental and inherited two attributes and override method called Total Amount.


 *
 */
public class MyCar extends VehicleRentals {
	private CarDetails car;
	
	public MyCar(CarDetails car,LocalDate pickUpDate, LocalDate returnDate) {
		super(pickUpDate, returnDate);
		this.car=car;
	}
	
	public static int calculateNoOfDays(){
		System.out.println("-------------------------------------------------------");
		System.out.println("> Provide dates");
		System.out.println("-------------------------------------------------------");
		return 0;
	  }
	
	public void displaycarDetails(){
		System.out.println("-------------------------------------------------------");
		System.out.println("> Show vehicle details");
		System.out.println("-------------------------------------------------------");
	  }
	@Override
	public double calculateTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
}
