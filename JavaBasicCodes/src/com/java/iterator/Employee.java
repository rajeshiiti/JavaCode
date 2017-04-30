package com.java.iterator;

import java.util.List;

public class Employee implements CustomeIterator<String>{
	
	private List<String> companies;
	
	public Employee(List<String> companies) {
		this.companies = companies;
	}

	@Override
	public boolean hasNext() {
		return companies.iterator().hasNext();
	}

	@Override
	public String next() {
		return companies.iterator().next();
	}
	
	public List<String> getCompanies() {
		return this.companies;
	}

}
