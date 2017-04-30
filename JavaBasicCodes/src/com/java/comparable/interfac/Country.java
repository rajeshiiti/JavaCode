package com.java.comparable.interfac;


public class Country implements Comparable{
	int id;
	String name;
	public Country(int id,String name) {
		super();
		this.id=id;
		this.name=name;
	}
	@Override
	public int compareTo(Object obj) {
		Country country = (Country)obj;
		return (this.id<country.id) ? -1 : (this.id>country.id) ? 1:0;
	}

}
