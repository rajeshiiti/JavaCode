package com.java.memory;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class CustomerRecordsIterableClass implements Iterable<CustomerIterableClass>{
	private Map<String,CustomerIterableClass> records;
	
	public CustomerRecordsIterableClass() {
		this.records = new HashMap<String,CustomerIterableClass>();
	}
	
	public Map<String,CustomerIterableClass> getRecords() {
		return new HashMap<String, CustomerIterableClass>(this.records);
	}
	
	public void addCustomer(CustomerIterableClass c) {
		records.put(c.getName(), c);
	}

	@Override
	public Iterator<CustomerIterableClass> iterator() {
		
		return records.values().iterator();
	}
	
	public CustomerIterableClassReadOnly getCustomerByName(String name) {
		return records.get(name);
	}
}
