package com.code.interview.bit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum2 {
	public static void main(String[] args) {
		List<Integer>  a = new ArrayList<Integer>();
		a.add(2);
		a.add(2);
		a.add(5);
		a.add(-1);
		a.add(2);
		a.add(-2);
		twoSum(a, 1);
	}
	
	public static ArrayList<Integer> twoSum(final List<Integer> a, int b) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<a.size();i++) {
			if(map.containsKey(a.get(i))) {
				map.put(a.get(i), map.get(a.get(i))+1);
			} else {
				map.put(a.get(i), 1);
			}
		}
		int num1 = 0,num2 = 0;
		boolean bl = true;
		for(int i=0;i<a.size() && bl;i++) {
			
			if(map.containsKey(b-a.get(i))) {
				if(b-a.get(i)==a.get(i) && map.get(a.get(i))>1) {
					num1 = a.get(i);
					num2 = num1;
					bl = false;
				} else {
					num1 = a.get(i);
					num2 = b-a.get(i);
					bl = false;
				}
			}
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int start=a.size()+1,end=a.size()+1;
		if(!bl) {
			for(int i=0;i<a.size();i++) {
				int tmp = b-a.get(i);
				if(tmp==a.get(i) && map.get(tmp)>1) {
					
					for(int j=i+1;j<a.size();j++) {
						if(a.get(j)==tmp && j<end) {
								start = i;
								end = j;
								break;
						}
					}
				} else if(map.containsKey(tmp)) {
					for(int j=i+1;j<a.size();j++) {
						if(a.get(j)==tmp && j<end) {
								start = i;
								end = j;
								break;
						}
					}
				}
			}
		}
		if(start<a.size()+1)  {
			ans.add(start+1);
			ans.add(end+1);
		}
		return ans;
	    
	}

}
