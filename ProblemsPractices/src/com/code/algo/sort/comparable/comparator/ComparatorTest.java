package com.code.algo.sort.comparable.comparator;

import java.util.Arrays;

public class ComparatorTest {

	public static void main(String[] args) {

		PersonComparator[] persons = getPersonArray();
		// Before sort
		
		for(int i=0;i<4;i++) {
			System.out.println(persons[i].getfName()+", "+persons[i].getlName()+", "+persons[i].getAge());
		}
		
		// After sort by first name
		Arrays.sort(persons, new FirstNameComaprator());
		

		System.out.println("\nSorted by on firstName: ");
		for(int i=0;i<4;i++) {
			System.out.println(persons[i].getfName()+", "+persons[i].getlName()+", "+persons[i].getAge());
		}

		
		// After sort by last Name
		Arrays.sort(persons, new LastNameComaparator());
		

		System.out.println("\nSorted by on LastName: ");
		for(int i=0;i<4;i++) {
			System.out.println(persons[i].getfName()+", "+persons[i].getlName()+", "+persons[i].getAge());
		}
		
	}
	
	public static PersonComparator[] getPersonArray() {

		PersonComparator[] persons = new PersonComparator[4];
		
		PersonComparator person1 = new PersonComparator();
		person1.setfName("Bob");
		person1.setlName("aurry");
		person1.setAge(34);
		
		persons[0] = person1;
		
		PersonComparator person2 = new PersonComparator();
		person2.setfName("sob");
		person2.setlName("gurry");
		person2.setAge(24);
		
		persons[1] = person2;

		
		PersonComparator person3 = new PersonComparator();
		person3.setfName("sob");
		person3.setlName("hurry");
		person3.setAge(4);
		
		persons[2] = person3;
		
		PersonComparator person4 = new PersonComparator();
		person4.setfName("qob");
		person4.setlName("aurry");
		person4.setAge(14);
		
		persons[3] = person4;

		return persons;
		
	}

}
