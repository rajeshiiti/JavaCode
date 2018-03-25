package com.java.memory;

import java.util.Map;

public class EscapingReferenceMain {
	public static void main(String[] args) {
		EscapingReferenceCustomerRecord customerRecord = new EscapingReferenceCustomerRecord();
		customerRecord.addCustomer(new EscapingReferenceCustomer("rajesh"));
		customerRecord.addCustomer(new EscapingReferenceCustomer("verma"));
		
		Map<String,EscapingReferenceCustomer> erCustomerRecords = customerRecord.getERCustomers();
		for(EscapingReferenceCustomer erCustomer:erCustomerRecords.values()) {
			System.out.println(erCustomer.getCustName());
		}
		erCustomerRecords.clear();
		
		

	}

}
