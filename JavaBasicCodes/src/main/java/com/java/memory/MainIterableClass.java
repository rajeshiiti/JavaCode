package com.java.memory;


public class MainIterableClass {

	public static void main(String[] args) {
		CustomerRecordsIterableClass cRecodsIteClas = new CustomerRecordsIterableClass();
		cRecodsIteClas.addCustomer(new CustomerIterableClass("rajesh"));
		cRecodsIteClas.addCustomer(new CustomerIterableClass("minu"));
		for(CustomerIterableClassReadOnly c:cRecodsIteClas.getRecords().values()) {
			System.out.println(c.getName());
		}
		CustomerIterableClassReadOnly cc = cRecodsIteClas.getCustomerByName("rajesh");
		for(CustomerIterableClassReadOnly c:cRecodsIteClas.getRecords().values()) {
			System.out.println(c.getName());
		}

	}

} 
