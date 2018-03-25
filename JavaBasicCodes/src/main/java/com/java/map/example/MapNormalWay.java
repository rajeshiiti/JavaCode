package com.java.map.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapNormalWay {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("test1", "test11");
		map.put("test2", "test22");
		map.put("test3", "test33");
		map.put("test4", "test44");
		for(Entry<String,String> entry: map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
