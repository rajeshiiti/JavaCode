package com.java.comparable.interfac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Country> list = new ArrayList<Country>();
		list.add(new Country(11,"India"));
		list.add(new Country(1112,"Ind21ia"));
		list.add(new Country(121,"Ind3ia"));
		list.add(new Country(14,"Ind12ia"));
		list.add(new Country(21,"Ind12ia"));
		list.add(new Country(-1,"Indi123a"));
		for(Country country:list) {
			System.out.println("Country Id: "+ country.id);
			System.out.println("Country Name: "+country.name);
		}
		Collections.sort(list);
		System.out.println("After Sort: ");
		for(Country country:list) {
			System.out.println("Country Id: "+ country.id);
			System.out.println("Country Name: "+country.name);
		}
		
		
		
	}
}
