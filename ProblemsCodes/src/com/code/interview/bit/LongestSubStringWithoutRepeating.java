package com.code.interview.bit;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeating {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("aaaaA123bBaaaa"));
	}
	
	public static int lengthOfLongestSubstring(String a) {
	    Map<Character,Integer> map = new HashMap<Character, Integer>();
		int maxSize = 0;
		int cnt = 0;
		int prevIndex = 0;
		for(int i=0;i<a.length();i++) {
			if(map.containsKey(a.charAt(i)) && map.get(a.charAt(i))>=prevIndex) {
				maxSize = Math.max(maxSize, cnt);
				prevIndex = map.get(a.charAt(i))+1;
				cnt = i-map.get(a.charAt(i))-1;
				map.put(a.charAt(i), i);
			}
			map.put(a.charAt(i), i);
			cnt++;
		}
		maxSize = Math.max(cnt, maxSize);
		return maxSize;
	}

}
