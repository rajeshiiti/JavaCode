package com.java.memory;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UnmodiafiableMethods {

	public static void main(String[] args) {

		Map<String,String> map1 = new HashMap<String,String>();
		map1.put("rajesh", "verma");
		map1.put("rajesh1", "verma1");
		map1.put("rajesh2", "verma2");
		for(String str:map1.values()) {
			System.out.println(str);
		}
		Map<String,String> map2 = Collections.unmodifiableMap(map1);
		map2.clear();
		for(String str:map2.values()) {
			System.out.println(str);
		}
		
		for(String str:map1.values()) {
			System.out.println(str);
		}
	}

}
