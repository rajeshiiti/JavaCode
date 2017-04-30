package com.code.algo.sort.comparable.comparator;

public class PersonComparable implements Comparable<PersonComparable>{

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

	@Override
	public int compareTo(PersonComparable anotherPerson) {
		return this.age - anotherPerson.age;
	}
	
	

}
