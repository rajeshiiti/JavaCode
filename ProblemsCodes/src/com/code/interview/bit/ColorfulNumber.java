package com.code.interview.bit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ColorfulNumber {
	public static void main(String[] args) {
		System.out.println(colorful(23));
	}
	
	public  static int colorful(int a) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		String b = Integer.toString(a);
		for(int i=0;i<b.length();i++) {
			nums.add((int)(b.charAt(i))-48);
		}
		int size = nums.size();
		int diff = 1;
		Map<Integer,Integer> map = new HashMap<Integer,Integer> ();
		while(diff<=size) {
			for(int i=0;i<=nums.size()-diff;i++) {
				int tmp = 1;
				for(int j=i;j<i+diff;j++) {
					tmp = tmp * nums.get(j);
				}
				if(map.get(tmp)!=null) {
					return 0;
				} else {
					map.put(tmp, 1);
				}
			}
			diff++;
		}
		
		return 1;
		
	}

}
