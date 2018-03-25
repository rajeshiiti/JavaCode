package com.code.interview.bit;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List<? super B> list1 = new ArrayList();
		List<Object> list2 = new ArrayList();
		List<Employee> list3 = new ArrayList<>();
		
	}

}

class Employee {
	
} 
class B extends Employee{
	
}
