package com.java.comparator.interfac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MainClass {
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
		Collections.sort(list, new Comparator<Country>() {
			@Override
			public int compare(Country o1, Country o2) {
				return o1.name.compareTo(o2.name);
				
			}
		});
		
		System.out.println("After sorting array: \n\n");
		for(Country country:list) {
			System.out.println("Country Id: "+ country.id);
			System.out.println("Country Name: "+country.name);
		}
	}

}
