package com.java.autoboxing.unboxing;

import java.util.ArrayList;
import java.util.List;

/*
 * Autoboxing is a automatic conversion that the java compiler makes between the primitives 
 * type and their corresponding wrapper classes
 * For example converting int into Integer, double into Double
 * If the conversion goes other ways its called unboxing
 */

public class AutoBoxingAndUnBoxing {
	public static void main(String[] args) {
		List<Integer> list=javaAutoBoxing();
		javaUnBoxing(list);
		
	}
	
	public static List<Integer> javaAutoBoxing() {
		List<Integer> list = new ArrayList<Integer>(); // Here list is and collection of Integer object class
		list.add(1); 
		return list;
		/*
		 * Here we are adding int primitives rather than Integer object
		 * compiler reads it like:
		 * list.add(Integer.valueOf(1));
		 */
	}
	
	public static void javaUnBoxing(List<Integer> list) {
		
	}

}
