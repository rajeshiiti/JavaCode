package com.code.interview.bit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Anagrams {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("cat");
		list.add("dog");
		list.add("god");
		list.add("tac");
		ArrayList<ArrayList<Integer>> ans = anagrams(list);
		
	}
	
	
	public static ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {
		getMap();
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		Map<String,ArrayList<Integer>> map = new HashMap<String,ArrayList<Integer>>();
		for(int i=0;i<a.size();i++) {
			String tmp = getReverse(a.get(i));
			if(map.containsKey(tmp)) {
				map.get(tmp).add(i+1);
			} else {
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(i+1);
				map.put(tmp, list);
			}
		}
		for(Entry<String, ArrayList<Integer>> entry: map.entrySet()) {
			ans.add(entry.getValue());
		}
		return ans;
	}
	private static void getMap() {
		map.put(0, 'a');
		map.put(1, 'b');
		map.put(2, 'c');
		map.put(3, 'd');
		map.put(4, 'e');
		map.put(5, 'f');
		map.put(6, 'g');
		map.put(7, 'h');
		map.put(8, 'i');
		map.put(9, 'j');
		map.put(10, 'k');
		map.put(11, 'l');
		map.put(12, 'm');
		map.put(13, 'n');
		map.put(14, 'o');
		map.put(15, 'p');
		map.put(16, 'q');
		map.put(17, 'r');
		map.put(18, 's');
		map.put(19, 't');
		map.put(20, 'u');
		map.put(21, 'v');
		map.put(22, 'w');
		map.put(23, 'x');
		map.put(24, 'y');
		map.put(25, 'z');
	}
	public static Map<Integer,Character> map = new HashMap<Integer,Character>();
	private static String getReverse(String string) {
		int[] chars = new int[26];
		for(int i=0;i<26;i++) {
			chars[i] = 0;
		}
		for(int i=0;i<string.length();i++) {
			chars[(int)string.charAt(i)-97]+=1;
		}
		char[] charss = string.toCharArray();
		int j = 0;
		for(int i=0;i<26;i++) {
			while(chars[i]>0) {
				charss[j++] = map.get(i);
				chars[i]--;
			}
		}
		
		return new String(charss);
	}

}
