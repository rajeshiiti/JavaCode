package com.code.interview.bit;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindow {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(5);
		ArrayList<Integer> ans = slidingMaximum(list, 3);
		for(Integer inte:ans) {
			System.out.println(inte);
		}
	}
	public static ArrayList<Integer> slidingMaximum(final List<Integer> a, int b) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int max = Integer.MIN_VALUE;
	    if(b>a.size()) {
	    	for(int i=0;i<a.size();i++) {
	    		max = Math.max(max, a.get(i));
	    	}
	    	list.add(max);
	    	return list;
	    }
	    if(b==1) {
	    	for(int i=0;i<a.size();i++) {
	    		list.add(a.get(i));
	    	}
	    	return list;
	    } else if(b==2) {
	    	for(int i=1;i<a.size();i++) {
	    		list.add(Math.max(a.get(i),a.get(i-1)));
	    	}
	    	return list;
	    }
	   int[] array = new int[a.size()+1];
	   int front = 1;
	   int end = 0;
	   for(int i=0;i<b;i++) {
		   while(end>=front && a.get(i)>=a.get(array[end])) {
			   end--;
		   }
		   end++;
		   array[end] = i;
	   }
	   
	   for(int i = b;i<a.size();i++) {
		   list.add(a.get(array[front]));
		   while(end>=front && a.get(i)>=a.get(array[end])) {
			   end--;
		   }
		   end++;
		   array[end] = i;
		   while(array[front]<=i-b) {
			   front++;
		   }
	   }
	   list.add(a.get(array[front]));
	    
	    return list;
	}

}
