package com.javas.valueby;

public class MainClass {

	public static void main(String[] args) {
		NameOfVehical nameOfVehical = new NameOfVehical("rajesh");
		nameOfVehical.setAge(123);
		testMethod(nameOfVehical);
		System.out.println(nameOfVehical.getName().equals("rajesh"));
		System.out.println(nameOfVehical.getName().equals("dixant"));
		changeValue(nameOfVehical);
		System.out.println(nameOfVehical.getName().equals("rajesh"));
		System.out.println(nameOfVehical.getName().equals("dixant"));
		
		
	}
	
	public static void testMethod(NameOfVehical nameOfVehical) {
		System.out.println(nameOfVehical.getName().equals("rajesh"));
		//nameOfVehical.setName("dixant");
		System.out.println(nameOfVehical.getAge());
		nameOfVehical = new NameOfVehical("dixant");
		System.out.println(nameOfVehical.getAge());
		System.out.println(nameOfVehical.getName().equals("dixant"));
		
	}
	
	public static void changeValue(NameOfVehical vehical) {
		vehical.setName("dixant");
	}
}
 