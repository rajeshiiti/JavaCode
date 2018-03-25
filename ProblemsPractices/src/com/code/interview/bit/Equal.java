package com.code.interview.bit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Equal {
	public static void main(String[] args) {
		// [3, 4, 7, 1, 2, 9, 8]
		//A : [ 9, 5, 4, 9, 3, 6, 8, 7, 1, 2, 8, 7, 2, 9, 7, 1, 3, 9, 7, 8, 1, 0, 5, 5 ]
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(3);
		a.add(4);
		a.add(7);
		a.add(1);
		a.add(2);
		a.add(9);
		a.add(8);
		ArrayList<Integer> ans = equal(a);
		for(Integer inte:ans) {
			System.out.println(inte);
		}
		
	}
	
	 public static ArrayList<Integer> equal(ArrayList<Integer> a) {
		Map<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
		for(int i=0;i<a.size()-1;i++) {
			for(int j=i+1;j<a.size();j++) {
				int tmp = a.get(i)+a.get(j);
				if(map.containsKey(tmp)) {
					if(map.get(tmp).size()==2) {
						if(map.get(tmp).get(0)==i || map.get(tmp).get(0)==j ||
								map.get(tmp).get(1)==i || map.get(tmp).get(1)==j) {
							continue;
						} else {
							map.get(tmp).add(i);
							map.get(tmp).add(j);
						}
					}
					
				} else {
					ArrayList<Integer> list = new ArrayList<Integer>();
					list.add(i);
					list.add(j);
					map.put(tmp, list);
				}
			}
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ans.add(a.size());
		ans.add(a.size());
		ans.add(a.size());
		ans.add(a.size());
		
		for(Entry<Integer, ArrayList<Integer>> entry:map.entrySet()) {
			if(entry.getValue().size()==4 && ( (ans.get(0)>entry.getValue().get(0)) ||
					(ans.get(0)==entry.getValue().get(0) && ans.get(1)>entry.getValue().get(1)) || 
					(ans.get(0)==entry.getValue().get(0) && ans.get(1)==entry.getValue().get(1) && ans.get(2)>entry.getValue().get(2)) || 
					(ans.get(0)==entry.getValue().get(0) && ans.get(1)==entry.getValue().get(1) && ans.get(2)==entry.getValue().get(2) && ans.get(3)>entry.getValue().get(3))) ) {
					ans.set(0, entry.getValue().get(0));
					ans.set(1, entry.getValue().get(1));
					ans.set(2, entry.getValue().get(2));
					ans.set(3, entry.getValue().get(3));
				}
		}
		return ans;
	 }
}
