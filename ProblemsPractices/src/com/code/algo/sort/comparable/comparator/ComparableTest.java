package com.code.algo.sort.comparable.comparator;

import java.util.Arrays;

public class ComparableTest {

	public static void main(String[] args) {

		PersonComparable[] persons = getPersonArray();
		// Before sort
		
		for(int i=0;i<4;i++) {
			System.out.println(persons[i].getfName()+", "+persons[i].getlName()+", "+persons[i].getAge());
		}
		
		// After sort by on age
		Arrays.sort(persons);
		

		System.out.println("\nSorted by on age: ");
		for(int i=0;i<4;i++) {
			System.out.println(persons[i].getfName()+", "+persons[i].getlName()+", "+persons[i].getAge());
		}
		
	}
	
	public static PersonComparable[] getPersonArray() {

		PersonComparable[] persons = new PersonComparable[4];
		
		PersonComparable person1 = new PersonComparable();
		person1.setfName("Bob");
		person1.setlName("furry");
		person1.setAge(34);
		
		persons[0] = person1;
		
		PersonComparable person2 = new PersonComparable();
		person2.setfName("sob");
		person2.setlName("gurry");
		person2.setAge(24);
		
		persons[1] = person2;

		
		PersonComparable person3 = new PersonComparable();
		person3.setfName("sob");
		person3.setlName("hurry");
		person3.setAge(4);
		
		persons[2] = person3;
		
		PersonComparable person4 = new PersonComparable();
		person4.setfName("qob");
		person4.setlName("aurry");
		person4.setAge(14);
		
		persons[3] = person4;

		return persons;
		
	}

}
