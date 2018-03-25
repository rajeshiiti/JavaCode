package com.code.interview.bit;

import java.util.ArrayList;

public class RemoveDuplicate {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		removeDuplicates(list);
		for(Integer inte:list) {
			System.out.print(inte+" ");
		}
		
	}
	
	
	public static int removeDuplicates(ArrayList<Integer> a) {
	    int n = a.size();
	    if(n<=1) {
	        return n; 
	    }
	    int i = 1;
	    int j = 1;
	    while(i<n) {
	        if(a.get(i).intValue() != a.get(i-1).intValue()) {
	          a.set(j,a.get(i));
	          j++;
	        }
	        i++;
	    }
	    int tmp = n-j;
	    while(tmp>0) {
	        a.remove(j);
	        tmp--;
	    }
	    return a.size();
	}

}
