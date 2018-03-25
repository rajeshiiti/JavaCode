package com.cab.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.cab.common.RatingInput;
import com.cab.customer.Customer;
import com.cab.driver.Driver;

public class MainInputClass {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		boolean isExit = true;
		Map<String, Customer> customerList = new HashMap<String, Customer>();
		Map<String, Driver> driverList = new HashMap<String, Driver>();	
		System.out.println("Please Give your input. For Exit enter 1");
		while(isExit) {
			System.out.println("Your input type: ");
			String input = inp.nextLine();
			if(input.equals("AVG_RATING CUSTOMER")) {
				String customerId = inp.nextLine();
				if(customerList.containsKey(customerId)) {
					Customer customer = customerList.get(customerId);
					System.out.println(customer.getAvgRating());
				} else {
					System.out.println("Customerid invalid.");
				}
				
			} else if(input.equals("AVG_RATING DRIVER")) {
				String driverId = inp.nextLine();
				if(driverList.containsKey(driverId)) {
					Driver driver = driverList.get(driverId);
					System.out.println(driver.getAvgRating());
				} else {
					System.out.println("DriverId invalid.");
				}
				
			} else if(input.equals("ELIGIBLE_DRIVER")) {
				String customerId = inp.nextLine();
				if(customerList.containsKey(customerId)) {
					Customer customer = customerList.get(customerId);
					Map<String, Float> eligibleDrivers =  customer.getEligibleDrivers(driverList);
					for (Entry<String, Float> entry : eligibleDrivers.entrySet()) {
					    System.out.println(entry.getKey()+" "+ entry.getValue());
					}
				} else {
					System.out.println("No Driver Available");
				}
				
			} else if(input.equals("ADD_TRIP")) {
				String customerId = inp.nextLine();
				float customerRating = inp.nextFloat();
				inp.nextLine();
				String driverId = inp.nextLine();
				float driverRating = inp.nextFloat();
				inp.nextLine();
				if(customerRating>5 ||customerRating<0 || driverRating>5 || driverRating<0) {
					System.out.println("Invalid customerRating or driverRating..");
				}
				else {
				if(customerList.containsKey(customerId)) {
					Customer customer = customerList.get(customerId);
					customer.rateMe(customerId, customerRating, driverId, driverRating);
				} else {
					Customer customer = new Customer(customerId);
					customer.rateMe(customerId, customerRating, driverId, driverRating);
					customerList.put(customerId, customer);
				}
	
				
				if (driverList.containsKey(driverId)) {
					Driver driver = driverList.get(driverId);
					driver.rateMe(driverId, driverRating, customerId, customerRating);
				} else {
					Driver driver = new Driver(driverId);
					driver.rateMe(driverId, driverRating, customerId, customerRating);
					driverList.put(driverId, driver);
				}
//				for (Entry<String, Customer> entry : customerList.entrySet()) {
//				    System.out.println(entry.getKey());
//				}
//				for (Entry<String, Driver> entry : driverList.entrySet()) {
//				    System.out.println(entry.getKey());
//				}
				System.out.println("Trip added...");
				}
				
			} else if(input.equals("1")) {
				isExit = false;
			} else {
				System.out.println("Please enter valid input.");
			}
		}
		System.out.println("You exist successfully");
		
		inp.close();
		
	}

}
