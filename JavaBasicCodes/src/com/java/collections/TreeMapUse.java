package com.java.collections;

import java.util.AbstractMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapUse {
	
	TreeMap<String, String> treeMap = new TreeMap<String, String>(); // TreeMap extends to AbstractMap and implements to Navigable Map
	AbstractMap<String, String> abstractMap = new TreeMap<String,String>(); // Abstract Map implements to Map
	NavigableMap<String, String> navigableMap = new TreeMap<String,String>(); // Navigable map extends to Sorted Map
	SortedMap<String,String> sortedMap = new TreeMap<String,String>(); // Sorted Map extends to Map
	Map<String,String> map = new TreeMap<String,String>();
	
	/*
	 * Basic operation of tree map
	 */
	public void useOfTreeMap() {
		treeMap.put("as", "as");
		treeMap.get("as");
		treeMap.containsKey("as");
		treeMap.isEmpty();
		treeMap.keySet();
		treeMap.size();
		treeMap.containsKey("as");
		treeMap.remove("as");
	}
}
