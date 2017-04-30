package com.code.interview.bit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DistinictNumberInWindow {
	public static void main(String[] args) {
		
	}
	public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		if(B>A.size()) {
			return ans;
		}
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<B;i++) {
			if(map.containsKey(A.get(i))) {
				map.put(A.get(i), map.get(A.get(i))+1);
			} else {
				map.put(A.get(i), 1);
			}
		}
		ans.add(map.size());
		int index = B;
		for(int i=1;i<A.size() && index<A.size();i++,index++) {
			if(map.get(A.get(i-1))>1) {
				map.put(A.get(i-1), map.get(A.get(i-1))-1);
			} else {
				map.remove(A.get(i-1));
			}
			if(map.containsKey(A.get(index))) {
				map.put(A.get(index), map.get(A.get(index))+1);
			} else {
				map.put(A.get(index), 1);
			}
			ans.add(map.size());
		}
		return ans;
    }

}
