package com.mycar;
/**
 * CarDetails
This class consists of all attributes  required to book a car.


 *
 */
public class CarDetails {
	
	private String vehicle_ID;
	private String car_brand;
	private String vehicle_Model;
	private String car_Type;
	private long car_YOM;
	private int car_NOS;
	private String car_Colour;
	private double car_Rent_Per_Day;
	private double car_Insurance_per_Day;
	private double car_Service_Fee;
	private double car_Discount;
	
	public CarDetails(String vehicle_ID, String car_brand, String vehicle_Model, String car_Type, long car_YOM,
			int car_NOS, String car_Colour, double car_Rent_Per_Day, double car_Insurance_per_Day,
			double car_Service_Fee, double car_Discount) {
		
		this.vehicle_ID = vehicle_ID;
		this.car_brand = car_brand;
		this.vehicle_Model = vehicle_Model;
		this.car_Type = car_Type;
		this.car_YOM = car_YOM;
		this.car_NOS = car_NOS;
		this.car_Colour = car_Colour;
		this.car_Rent_Per_Day = car_Rent_Per_Day;
		this.car_Insurance_per_Day = car_Insurance_per_Day;
		this.car_Service_Fee = car_Service_Fee;
		this.car_Discount = car_Discount;
	}
	public String getVehicle_ID() {
		return vehicle_ID;
	}
	public void setVehicle_ID(String vehicle_ID) {
		this.vehicle_ID = vehicle_ID;
	}
	
	public String getCar_brand() {
		return car_brand;
	}
	public void setCar_brand(String car_brand) {
		this.car_brand = car_brand;
	}
	public String getVehicle_Model() {
		return vehicle_Model;
	}
	public void setVehicle_Model(String vehicle_Model) {
		this.vehicle_Model = vehicle_Model;
	}
	public String getCar_Type() {
		return car_Type;
	}
	public void setCar_Type(String car_Type) {
		this.car_Type = car_Type;
	}
	public long getCar_YOM() {
		return car_YOM;
	}
	public void setCar_YOM(long car_YOM) {
		this.car_YOM = car_YOM;
	}
	public int getCar_NOS() {
		return car_NOS;
	}
	public void setCar_NOS(int car_NOS) {
		this.car_NOS = car_NOS;
	}
	public String getCar_Colour() {
		return car_Colour;
	}
	public void setCar_Colour(String car_Colour) {
		this.car_Colour = car_Colour;
	}
	public double getCar_Rent_Per_Day() {
		return car_Rent_Per_Day;
	}
	public void setCar_Rent_Per_Day(double car_Rent_Per_Day) {
		this.car_Rent_Per_Day = car_Rent_Per_Day;
	}
	public double getCar_Insurance_per_Day() {
		return car_Insurance_per_Day;
	}
	public void setCar_Insurance_per_Day(double car_Insurance_per_Day) {
		this.car_Insurance_per_Day = car_Insurance_per_Day;
	}
	public double getCar_Service_Fee() {
		return car_Service_Fee;
	}
	public void setCar_Service_Fee(double car_Service_Fee) {
		this.car_Service_Fee = car_Service_Fee;
	}
	public double getCar_Discount() {
		return car_Discount;
	}
	public void setCar_Discount(double car_Discount) {
		this.car_Discount = car_Discount;
	}
	
	
	public static double calculateRental(int noOfDays){
		return 0;
		
	  }
	public static double calculateDiscount(int noOfDays){
		return 0;
		
	  }
	public static double calculateInsurance(int noOfDays){
		return 0;
		
	  }
	
	public  void displayVehicleDetails(int noOfDays){
		System.out.println("-------------------------------------------------------");
		System.out.println("> Show vehicle details");
		System.out.println("-------------------------------------------------------");
	  }
	
	
	
}
