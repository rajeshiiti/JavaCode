package com.java.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCompareFunction {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(10);
		list.add(11);
		list.add(23);
		list.add(32);
		list.add(121);
		sortList(list);
	}
	public static void sortList(List<Integer> list) {
		Collections.sort(list);
	}
	
	

}
