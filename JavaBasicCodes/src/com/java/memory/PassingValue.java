package com.java.memory;

public class PassingValue {

	public static void main(String[] args) {
		Customer  customer = new Customer("rajesh");
		reNameCustomer(customer);
		System.out.println(customer.getCustName());

	}

	private static void reNameCustomer(Customer customer) {
		customer.setCustName("Verma");
		
	}

}
