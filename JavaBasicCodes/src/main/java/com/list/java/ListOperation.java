package com.list.java;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class ListOperation {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("test");
		list.add("test1");
		list.add("test");
		list.add("test1");
		list.add("test");
		list.add("test1");
		list.add("test");
		list.add("test1");
		for(String str:list) {
			System.out.println(str);
		}
		System.out.println("test11111111111\n\n");
		list = new ArrayList<String>(new LinkedHashSet<String>(list));
		for(String str:list) {
			System.out.println(str);
		}
	}

}
