package com.effective.java.item.one;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//MainClass.nonImmutableClass();
		//sMainClass.instanceControlled();
		//MainClass.nonInstantiableClass();
		

	}
	public static void nonInstantiableClass() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Constructor<NonInstantiableClass> con =  NonInstantiableClass.class.getDeclaredConstructor();
		NonInstantiableClass object = con.newInstance();
		object.setTemp(5);
		System.out.println(object.getTemp());
				
		//NonInstantiableClass nonInstantiableClass = new NonInstantiableClass();
	}
	public static void nonImmutableClass() {
		NotImmutableClass<String> noImmutable =   new NotImmutableClass<String>(Arrays.asList("a","b","c"));
		System.out.println(noImmutable.getList().toString());
		noImmutable.getList().add("d");
		System.out.println(noImmutable.getList().toString());
	}
	public static void instanceControlled(){
		InstaceControlled instaceControlled1 = InstaceControlled.getInstance();
		InstaceControlled instaceControlled2 = InstaceControlled.getInstance();
		
		InstaceControlled instaceControlled3 = new InstaceControlled();
		InstaceControlled instaceControlled4 = new InstaceControlled();
		
		if(instaceControlled3.equals(instaceControlled4)) {
			if( instaceControlled1== instaceControlled2) {
				System.out.println("Yes Both Are equals using Constructor");
			} else {
				System.out.println("Nope from constructor ");
			}
		}else {
			System.out.println("Test not successfull from constructor");
		}
		
		if(instaceControlled1.equals(instaceControlled2)) {
			if( instaceControlled1== instaceControlled2) {
				System.out.println("Yes Both Are equals ");
			} else {
				System.out.println("Nope ");
			}
		} else {
			System.out.println("Test not successfull");
		}
		
	}

}
