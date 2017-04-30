package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Collections;

public class ThreeSum {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(1);
		a.add(-9);
		a.add(-7);
		a.add(-8);
		a.add(2);
		a.add(-8);
		a.add(2);
		a.add(3);
		a.add(-8);
		
		int b = -1;
		System.out.println(threeSumClosest(a, b));
	}
	public static int threeSumClosest(ArrayList<Integer> a, int b) {
	    int sum = 1000000;
	    Collections.sort(a);
	    for(int i=0;i<a.size()-2;) {
	    	int j = i+1,k = a.size()-1;
	    	while(j<k) {
	    		int tmp = a.get(i)+a.get(j)+a.get(k);
	    		if( b== tmp) {
	    			return b;
	    		}
	    		if(tmp<b) {
	    			j++;
	    		} else {
	    			k--;
	    		}
	    		if( Math.abs(b-tmp)<Math.abs(b-sum)) {
	    			sum = tmp;
	    		}
	    	}
	    	i++;
	    	/*while(i<a.size()-2 && a.get(i)==a.get(i-1)) {
	    		i++;
	    	}*/
	    }
	    
		return sum;
	    
	}
}
