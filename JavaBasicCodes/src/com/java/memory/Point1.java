package com.java.memory;

import java.util.HashMap;
import java.util.Map;

public class Point1 {
	public static void main(String[] args) {
		Map<String,String> map1 = new HashMap<String,String>();
		map1.put("rajesh", "verma");
		map1.put("meena","shikharwal");
		System.out.println("change 1: ");
		// print map1
		System.out.println("map1: ");
		printMap(map1);
		
		// print map2
		Map<String,String> map2 = map1;
		System.out.println("map2: ");
		printMap(map2);
		Map<String, String> map3 = new HashMap<String, String>(map1);
		
		// print map3
		System.out.println("map3: ");
		printMap(map3);
		
		System.out.println("\n change 2: ");
		map3.put("rajesh", "chohan");
		
		System.out.println("map1: ");
		printMap(map1);
		
		
		System.out.println("map2: ");
		printMap(map2);
		
		System.out.println("map3: ");
		printMap(map3);
		
		
		System.out.println("\nchange 3: ");
		
		map1.put("meena", "chohan");
		
		System.out.println("map1: ");
		printMap(map1);
		
		
		System.out.println("map2: ");
		printMap(map2);
		
		System.out.println("map3: ");
		printMap(map3);
		
		
		System.out.println("\nchange 4: ");
		
		map2.put("meena1", "chohan");
		
		System.out.println("map1: ");
		printMap(map1);
		
		
		System.out.println("map2: ");
		printMap(map2);
		
		System.out.println("map3: ");
		printMap(map3);
		
	}

	private static void printMap(Map<String, String> map) {
		for(String str:map.values()) {
			System.out.println(str);
		}
	}

}
