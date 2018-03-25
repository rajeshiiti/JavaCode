package com.java.generic.classes;

public class GenericMethodMain {
	
	public static void main(String[] args) {
		PairForGenericMethod<String, Integer> pair = 
				new PairForGenericMethod<String, Integer>();
		pair.setKey("str");
		pair.setValue(12);
		
		PairForGenericMethod<String, Integer> pair1 = 
				new PairForGenericMethod<String, Integer>();
		pair1.setKey("str");
		pair1.setValue(1);
		
		System.out.println(getBigValue(pair, pair1));
		
		
	}

	public static <K,V>boolean getBigValue(PairForGenericMethod<K, V> pair, PairForGenericMethod<K, V> pair2) {
		return pair.getKey().equals(pair.getKey()) && pair2.getValue().equals(pair2.getValue());
	}

}
