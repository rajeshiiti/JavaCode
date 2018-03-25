package com.code.interview.bit;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoArrays {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(-4);
		list.add(3);
		ArrayList<Integer> lis2 = new ArrayList<Integer>();
		lis2.add(-2);
		lis2.add(-2);
		merge(list, lis2);
	}
	public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
		  List<Integer> aa = (List<Integer>) a.clone();
		  ArrayList<Integer> test = (ArrayList<Integer>) a.subList(0, 2);
		  a.removeAll(a);
		    int i=0,j=0;
		    while(i<aa.size() && j<b.size()) {
		    	if(aa.get(i)<b.get(j)) {
		    		a.add(aa.get(i));
		    		i++;
		    	} else {
		    		a.add(b.get(j));
		    		j++;
		    	}
		    }
		    while(i<aa.size()) {
		    	a.add(aa.get(i));
	    		i++;
		    }
		    while(j<b.size()) {
		    	a.add(b.get(j));
		    	j++;
		    }
	    
	}

}
