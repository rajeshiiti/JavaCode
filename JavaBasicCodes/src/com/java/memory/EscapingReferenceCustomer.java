package com.java.memory;

public class EscapingReferenceCustomer {
	private String custName;

	public EscapingReferenceCustomer(String custName) {
		this.custName = custName;
	}
	
	public String getCustName() {
		return custName;
	}

	public String toString() {
		return this.custName;
	}
}
