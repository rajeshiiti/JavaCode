package com.java.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("test");
		list.add("aqtest");
		list.add("qtest");
		System.out.println("Before sort: ");
		for(String str: list) {
			System.out.println(str);
		}
		Collections.sort(list);
		System.out.println("After Sort: ");
		for(String str: list) {
			System.out.println(str);
		}
		
		
	}

}
