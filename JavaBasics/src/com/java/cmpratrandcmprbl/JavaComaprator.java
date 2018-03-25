package com.java.cmpratrandcmprbl;

import java.util.Comparator;

public class JavaComaprator {
	public static void main(String[] args) {
		
	}

}

class Person1 {
	private String name;
	private int age;
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class NameComparator implements Comparator<Person1> {

	@Override
	public int compare(Person1 o1, Person1 o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}