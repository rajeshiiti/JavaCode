package com.java.collections;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapUse {
	/*
	 * The way in which we can define LinkedHashList
	 */
	LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<String,String>(); // LinkedHashMap Extends to HashMap and Map
	HashMap<String, String> hashMap = new LinkedHashMap<String, String>(); // HashMap Extends to AbstractMap and implements Map  
	AbstractMap<String, String> abstractMap=  new LinkedHashMap<String, String>(); // Implements to Map
	Map<String,String> map = new LinkedHashMap<String, String>();
	
	/*
	 * Basic LinkedHashMap Operation
	 */
	public void testLinkedHashMap() {
		linkedHashMap.get("as");
		linkedHashMap.put("as", "as");
		linkedHashMap.containsKey("as");
		linkedHashMap.size();
		linkedHashMap.isEmpty();
	}

	
	
}
