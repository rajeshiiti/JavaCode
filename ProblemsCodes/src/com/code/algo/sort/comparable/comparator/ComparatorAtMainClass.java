package com.code.algo.sort.comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorAtMainClass {
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		Person p1 = new Person();
		p1.setFirstName("asd");
		p1.setLastName("gff");
		p1.setAge(21);
		personList.add(p1);
		
		Person p2 = new Person();
		p2.setFirstName("dsd");
		p2.setLastName("fdff");
		p2.setAge(11);
		personList.add(p2);
		
		Person p3 = new Person();
		p3.setFirstName("vvsd");
		p3.setLastName("rff");
		p3.setAge(31);
		personList.add(p3);
		
		Person p4 = new Person();
		p4.setFirstName("asd");
		p4.setLastName("aff");
		p4.setAge(51);
		personList.add(p4);
		
		for(Person p:personList) {
			System.out.println(p.getFirstName()+" "+p.getLastName()+" "+p.getAge());
		}
		
		Collections.sort(personList, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				if( !(p1.getFirstName().equals(p2.getFirstName())) ) {
					return p1.getFirstName().compareTo(p2.getFirstName());
				} else {
					return p1.getLastName().compareTo(p2.getLastName());
				}
			}
		});
		System.out.println("\nAfter sort:");
		for(Person p:personList) {
			System.out.println(p.getFirstName()+" "+p.getLastName()+" "+p.getAge());
		}
	}

}
