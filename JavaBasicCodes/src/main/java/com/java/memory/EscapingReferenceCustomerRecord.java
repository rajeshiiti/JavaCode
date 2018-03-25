package com.java.memory;

import java.util.HashMap;
import java.util.Map;

public class EscapingReferenceCustomerRecord {
	private Map<String,EscapingReferenceCustomer> records;
	
	public EscapingReferenceCustomerRecord() {
		this.records = new HashMap<String, EscapingReferenceCustomer>();
	}
	
	public void addCustomer(EscapingReferenceCustomer customer) {
		this.records.put(customer.getCustName(), customer);
	}
	
	public Map<String,EscapingReferenceCustomer> getERCustomers() {
		return this.records;
	}

}
