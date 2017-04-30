package com.code.interview.bit;

import java.util.ArrayList;

public class ContainerWithMaxWater {
	public static void main(String[] args) {
		ArrayList<Integer> list1  = new ArrayList<Integer>();
		list1.add(2);
	}
	public static int maxArea(ArrayList<Integer> a) {
		int water = 0;
		int l =0,r = a.size()-1;
		while(l<r) {
			water = Math.max(water, (r-l)*Math.min(a.get(l),a.get(r)));
			if(a.get(l)<a.get(r)) {
				l++;
			} else {
				r--;
			}
		}
		return water;
	}

}
