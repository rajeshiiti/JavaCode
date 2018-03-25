package com.code.interview.bit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Diffk2 {
	public static void main(String[] args) {
		
	}
	public int diffPossible(final List<Integer> a, int b) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<a.size();i++) {
			if(map.containsKey(a.get(i))) {
				map.put(a.get(i), map.get(a.get(i))+1);
			} else {
				map.put(a.get(i), 1);
			}
		}
		for(int i=0;i<a.size();i++) {
			int tmp = b+a.get(i);
			if(map.containsKey(tmp)) {
				if(tmp==a.get(i) && map.get(tmp)>1) {
					return 1;
				} else if(tmp!=a.get(i)){
					return 1;
				}
			}
		}
		
		return 0;
	}

}
