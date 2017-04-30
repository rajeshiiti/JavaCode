package com.code.algo.sort.comparable.comparator;

import java.util.Comparator;

public class PersonComparatorInComparable {
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
	
	public static Comparator<PersonComparatorInComparable> FirstNameComparatorInComparable = new Comparator<PersonComparatorInComparable>() {

		@Override
		public int compare(PersonComparatorInComparable person,
				PersonComparatorInComparable anotherPerson) {
			if(!(person.getfName().equals(anotherPerson.getfName()))) {
				return person.getfName().compareTo(anotherPerson.getfName());
			} else {
				return person.getlName().compareTo(anotherPerson.getlName());
			}
		}
	};
	
	public static Comparator<PersonComparatorInComparable> LastNameComaparatorInComparable = new Comparator<PersonComparatorInComparable>() {

		@Override
		public int compare(PersonComparatorInComparable person,
				PersonComparatorInComparable anotherPerson) {
			if(!(person.getlName().equals(anotherPerson.getlName()))) {
				return person.getlName().compareTo(anotherPerson.getlName());
			} else {
				return person.getfName().compareTo(anotherPerson.getfName());
			}
		}
	};
	
	public static Comparator<PersonComparatorInComparable> AgeComaparatorInComparable = new Comparator<PersonComparatorInComparable>() {

		@Override
		public int compare(PersonComparatorInComparable person,
				PersonComparatorInComparable anotherPerson) {
			return person.age-anotherPerson.age;
		}
	};

}
