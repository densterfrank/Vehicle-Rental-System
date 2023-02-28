package com.mycar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
/**
 * 


This class is repository of complete application, it stores all all details in arraylist and hash map.


 *
 */
public class Database {
	//ArrayList to store all car objects.
	
	private static Map <String, CarDetails> id_details = new HashMap<String, CarDetails>();
	public void read_file(){
		CarDetails car=new CarDetails("C001","Totota", "Yaris", "Sedan", 2012, 4, "Blue", 50, 15, 10, 10);
		
		id_details.put("C001", car);
		
	  }
	static Scanner input=new Scanner(System.in);
	public  void searchByBrand(){
		System.out.print("Please provide a brand: ");
		String brand=input.next();
		System.out.println("-------------------------------------------------------");
		System.out.println("> Select from matching list");
		System.out.println("-------------------------------------------------------");
		
	  }
	public  void searchByVehicleType(){
		System.out.println("-------------------------------------------------------");
		System.out.println("> Browse by type of vehicle");
		System.out.println("-------------------------------------------------------");
		System.out.print("Please select: ");
		String type=input.next();
	  }
	public  void searchByPassenger(){
		System.out.print("Please provide the number of passengers: ");
		String passenger_input=input.next();
		System.out.println("-------------------------------------------------------");
		System.out.println("> Select from matching list");
		System.out.println("-------------------------------------------------------");
	  }
}
