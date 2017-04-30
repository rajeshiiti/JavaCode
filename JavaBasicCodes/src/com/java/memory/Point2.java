package com.java.memory;

import java.util.HashMap;
import java.util.Map;

public class Point2 {
	
	public static void main(String[] args) {
		Map<String,Integer> map1 = new HashMap<String,Integer>();
		map1.put("rajesh", 23);
		map1.put("meena",20);
		System.out.println("change 1: ");
		// print map1
		System.out.println("map1: ");
		printMap(map1);
		
		// print map2
		Map<String,Integer> map2 = map1;
		System.out.println("map2: ");
		printMap(map2);
		Map<String, Integer> map3 = new HashMap<String, Integer>(map1);
		
		// print map3
		System.out.println("map3: ");
		printMap(map3);
		
		System.out.println("\n change 2: ");
		map3.put("rajesh", 24);
		
		System.out.println("map1: ");
		printMap(map1);
		
		
		System.out.println("map2: ");
		printMap(map2);
		
		System.out.println("map3: ");
		printMap(map3);
		
		
		System.out.println("\nchange 3: ");
		
		map1.put("meena", 19);
		
		System.out.println("map1: ");
		printMap(map1);
		
		
		System.out.println("map2: ");
		printMap(map2);
		
		System.out.println("map3: ");
		printMap(map3);
		
		
		System.out.println("\nchange 4: ");
		
		map2.put("meena1", 21);
		
		System.out.println("map1: ");
		printMap(map1);
		
		
		System.out.println("map2: ");
		printMap(map2);
		
		System.out.println("map3: ");
		printMap(map3);
		
	}

	private static void printMap(Map<String, Integer> map) {
		for(Integer str:map.values()) {
			System.out.println(str);
		}
	}

}
