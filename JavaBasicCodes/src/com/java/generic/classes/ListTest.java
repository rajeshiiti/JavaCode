package com.java.generic.classes;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Integer(12));
		list.add("ras");
		System.out.println((Integer)list.get(0));
		System.out.println(list.get(1));
	}

}
