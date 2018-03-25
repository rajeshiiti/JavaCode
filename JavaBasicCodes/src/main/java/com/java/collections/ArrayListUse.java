package com.java.collections;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
/*
 * ArrayList extends to AbstractList  and
 * implements to List
 * 
 * AbstractList extends to AbstractCollection an
 */
import java.util.List;

public class ArrayListUse {
	/*
	 * The way we can define ArrayList using parent class.
	 */
	
	ArrayList<String> arrayList = new ArrayList<String>(); // ArrayList extends to AbstractList and implements to List
	List<String> list = new ArrayList<String>(); // List extends to collection
	AbstractList<String> abstractList = new ArrayList<String>(); //AbstractList extends to AbstractCollection
	AbstractCollection<String> abstractCollection = new ArrayList<String>(); //AbstractCollection extends to Collection
	Collection<String> collection = new ArrayList<String>();
	
	public void testArrayList() {
		arrayList.add("as");
		arrayList.size();
		arrayList.get(0);
		arrayList.contains("as");
		arrayList.isEmpty();
		arrayList.addAll(list);
		arrayList.iterator();
	}
	
	
	
	
	

}
