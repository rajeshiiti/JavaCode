package com.code.interview.bit;

import java.util.ArrayList;
import java.util.TreeMap;

public class StandingQueue {
	
	public static void main(String[] args) {
		// Heights: 5 3 2 6 1 4
		// InFronts: 0 1 2 0 3 2
		ArrayList<Integer> heights = new ArrayList<Integer>();
		ArrayList<Integer> infronts = new ArrayList<Integer>();
		
		heights.add(5);
		heights.add(3);
		heights.add(2);
		heights.add(6);
		heights.add(1);
		heights.add(4);
		
		infronts.add(0);
		infronts.add(1);
		infronts.add(2);
		infronts.add(0);
		infronts.add(3);
		infronts.add(2);
		
		ArrayList<Integer> ans = order(heights, infronts);
		for(Integer inte:ans) {
			System.out.println(inte);
		}

	}
	
	public static ArrayList<Integer> order(ArrayList<Integer> heights, ArrayList<Integer> infronts) {
		Integer[] height = new Integer[heights.size()];
		heights.toArray(height);
		
		Integer[] infront = new Integer[infronts.size()];
		infronts.toArray(infront);
		
		return orderStandingQueue(height, infront);
	}
	
	public static  ArrayList<Integer> orderStandingQueue(Integer[] height2, Integer[] infront) {
		 
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
	    for (int i=0; i<height2.length; i++) {
	        map.put(height2[i], infront[i]);
	    }
	 
	    boolean sorted = false;
	    while(sorted == false) {
	        int height = map.lastKey();
	        int taller = map.get(height);
	        map.remove(height);
	 
	 
	        if (result.isEmpty()){
	            result.add(height);
	        } else if (taller == 0) {
	            result.add(0,height);
	        } else {
	            result.add(taller,height);
	        }
	        if (map.isEmpty()) sorted = true;
	    }
	   return result;
	}

}
