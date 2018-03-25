package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PhoneLetter {
	public static void main(String[] args) {
		String a = "245123";
		ArrayList<String> al = letterCombinations(a);
		for(String str:al) {
			System.out.println(str);
		}
		
	}
	
	public static ArrayList<String> letterCombinations(String a) {
		//Start 
		if(a!=null && a.isEmpty()) {
			return new ArrayList<String>();
		}
		Map<Integer,String> map  = getMap();
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<a.length();i++) {
			int key = (int)a.charAt(i)-48;
			list.add(map.get(key));
		}
		ArrayList<String> ans = new ArrayList<String>();
		for(int i=0;i<list.size();i++) {
			ArrayList<String> tmp = new ArrayList<String>();
			for(int j=0;j<list.get(i).length();j++) {
				if(ans.size()==0) {
					StringBuilder sb = new StringBuilder(list.get(i).substring(j, j+1));
					tmp.add(sb.toString());
				} else {
					for(int k=0;k<ans.size();k++){
						StringBuilder sb = new StringBuilder(ans.get(k));
						sb.append(list.get(i).substring(j, j+1));
						tmp.add(sb.toString());
					}
				}
			}
			ans = new ArrayList<String>(tmp);
		}
		Collections.sort(ans);
		return ans;
	}

	private static Map<Integer,String> getMap() {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(0, "0");
		map.put(1, "1");
		map.put(2, "abc");
		map.put(3, "def");
		map.put(4, "ghi");
		map.put(5, "jkl");
		map.put(6, "mno");
		map.put(7, "pqrs");
		map.put(8, "tuv");
		map.put(9, "wxyz");
		return map;
	}

}
