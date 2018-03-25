package com.code.algo.sort;

import java.util.Comparator;

public class PersonComaprator {

	private String fName;

	private String lName;

	private int age;

	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static Comparator<PersonComaprator> FirstNameSort = new Comparator<PersonComaprator>() {

		@Override
		public int compare(PersonComaprator person, PersonComaprator anotherPerson) {
			if( !(person.getfName().equals(anotherPerson.getfName())) ) {
				return person.getfName().compareTo(anotherPerson.fName);
			} else {
				return person.getlName().compareTo(anotherPerson.lName);
			}
		}
	}; 
	
	
	public static Comparator<PersonComaprator> LastNameSort = new Comparator<PersonComaprator>() {

		@Override
		public int compare(PersonComaprator person, PersonComaprator anotherPerson) {
			if( !(person.getlName().equals(anotherPerson.getlName())) ) {
				return person.getlName().compareTo(anotherPerson.lName);
			} else {
				return person.getfName().compareTo(anotherPerson.fName);
			}
		}
	};
	
}
