package com.java.collections;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class HashMapUse {
	/*
	 * The way which we can declare HashMap
	 */
	HashMap<String, String> hashMap = new HashMap<String, String>(); // HashMap Extends to AbstractMap and implements Map  
	AbstractMap<String, String> abstractMap=  new HashMap<String, String>(); // Implements to Map
	Map<String,String> map = new HashMap<String, String>();
	
	/*
	 * Basic Operation on HashMap
	 */
	
	public void testHashMap() {
		hashMap.get("as");
		hashMap.put("as", "as");
		hashMap.containsKey("as");
		hashMap.clear();
		hashMap.entrySet();
		hashMap.containsValue("as");
		hashMap.putAll(map);
		hashMap.isEmpty();
		
	}
	
	
	

}
