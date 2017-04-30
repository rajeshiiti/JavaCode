package com.code.interview.bit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LargestContinuousSequenceZeroSum {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(0);
		a.add(-2);
		a.add(2);
		a.add(4);
		a.add(-4);
		ArrayList<Integer> ans = lszero(a);
		for(int i=0;i<ans.size();i++) {
			System.out.println(ans.get(i));
		}
	}
	public static ArrayList<Integer> lszero(ArrayList<Integer> a) {
		
		int start = -1;
		int end = -1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<a.size();i++) {
			list.add(a.get(i));
		}
		for(int i=1;i<a.size();i++) {
			list.set(i, list.get(i)+list.get(i-1));
		}
		int max=0;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==0) {
				start = 0;
				end = i;
				max = i+1;
			} else if(map.containsKey(list.get(i))) {
				if(max<i-map.get(list.get(i))) {
					start = map.get(list.get(i))+1;
					end = i;
					max = i-map.get(list.get(i));
				}
			} else {
				map.put(list.get(i), i);
			}
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for(int i=start;i<=end;i++) {
			ans.add(a.get(i));
		}
		
		return ans;
    }

}
