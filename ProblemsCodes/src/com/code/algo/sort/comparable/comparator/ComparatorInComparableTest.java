package com.code.algo.sort.comparable.comparator;

import java.util.Arrays;

public class ComparatorInComparableTest {
	public static void main(String[] args) {

		PersonComparatorInComparable[] persons = getPersonArray();
		// Before sort
		
		for(int i=0;i<4;i++) {
			System.out.println(persons[i].getfName()+", "+persons[i].getlName()+", "+persons[i].getAge());
		}
		
		// After sort by first name
		Arrays.sort(persons, PersonComparatorInComparable.FirstNameComparatorInComparable);
		

		System.out.println("\nSorted by on firstName: ");
		for(int i=0;i<4;i++) {
			System.out.println(persons[i].getfName()+", "+persons[i].getlName()+", "+persons[i].getAge());
		}

		
		// After sort by last Name
		Arrays.sort(persons, PersonComparatorInComparable.LastNameComaparatorInComparable);
		

		System.out.println("\nSorted by on LastName: ");
		for(int i=0;i<4;i++) {
			System.out.println(persons[i].getfName()+", "+persons[i].getlName()+", "+persons[i].getAge());
		}
		
		// After sort by last Name
		Arrays.sort(persons, PersonComparatorInComparable.AgeComaparatorInComparable);
		

		System.out.println("\nSorted by on Age: ");
		for(int i=0;i<4;i++) {
			System.out.println(persons[i].getfName()+", "+persons[i].getlName()+", "+persons[i].getAge());
		}
		
	}
	
	public static PersonComparatorInComparable[] getPersonArray() {

		PersonComparatorInComparable[] persons = new PersonComparatorInComparable[4];
		
		PersonComparatorInComparable person1 = new PersonComparatorInComparable();
		person1.setfName("Bob");
		person1.setlName("aurry");
		person1.setAge(34);
		
		persons[0] = person1;
		
		PersonComparatorInComparable person2 = new PersonComparatorInComparable();
		person2.setfName("sob");
		person2.setlName("gurry");
		person2.setAge(24);
		
		persons[1] = person2;

		
		PersonComparatorInComparable person3 = new PersonComparatorInComparable();
		person3.setfName("sob");
		person3.setlName("hurry");
		person3.setAge(4);
		
		persons[2] = person3;
		
		PersonComparatorInComparable person4 = new PersonComparatorInComparable();
		person4.setfName("qob");
		person4.setlName("aurry");
		person4.setAge(14);
		
		persons[3] = person4;

		return persons;
		
	}

}
