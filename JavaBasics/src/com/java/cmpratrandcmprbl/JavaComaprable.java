package com.java.cmpratrandcmprbl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaComaprable {
	
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		Person person1 = new Person("ram", 22);
		Person person2 = new Person("ramesh", 20);
		Person person3 = new Person("ramu", 23);
		Person person4 = new Person("kam", 12);
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
		
		for(Person person:personList) {
			System.out.println(person.getName()+" "+ person.getAge());
		}
		Collections.sort(personList);
		
		for(Person person:personList) {
			System.out.println(person.getName()+" "+ person.getAge());
		}
		
		
		
	}

}

class Person implements Comparable<Person> {
	private String name;
	private int age;
	public Person(String name, int age) {
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

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		if(this.age>o.age) {
			return 1;
		} else if(this.age==o.age) {
			return 0;
		}
		return -1;
	}
	
}
