package com.mycar;

import java.util.Scanner;
/**
 * 

This is main class where program starts
 *
 */
public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to MyCar!");
		Database read =new Database();
		read.read_file();
		boolean action=true;
		while(action ) {
			System.out.println("-------------------------------------------------------");
			System.out.println("> Select from main menu");
			System.out.println("-------------------------------------------------------");
			System.out.println("   1.) Search by brand");
			System.out.println("   2.) Search by vehicle type");
			System.out.println("   3.) Filter by number of passengers");
			System.out.println("   4.) Exit");
			Scanner input=new Scanner(System.in);
			System.out.print("Please select: ");
			String option=input.nextLine();
			if(option.isEmpty()) {
				System.out.println("Input cannot be empty, Please enter correct inputs from the options below.");
				continue;
			}
			else if (option.contentEquals("1"))
			{
				
				read.searchByBrand();
			}
			else if (option.contentEquals("2"))
			{
				read.searchByVehicleType();
			} 
			else if (option.contentEquals("3"))
			{
				read.searchByPassenger();
			}
			else if (option.contentEquals("4"))
			{
				System.out.println("you have exited from the program ");
				System.exit(0);
			}
			else {
				System.out.println("Please enter correct inputs from the options below.");
				continue;
			}
		}

	}

}
