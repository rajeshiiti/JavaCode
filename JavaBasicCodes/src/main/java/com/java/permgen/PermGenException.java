package com.java.permgen;

public class PermGenException {
	public static void main(String[] args) {
		for(int i=1;i<=1000000;i++) {
			generateClass("com.java.permgen"+i);
		}
	}
	
	public static Class generateClass(String name) {
		return null;
		/*ClassPool pool = ClassPool.getDefault();*/
	    /*return pool.makeClass(name).toClass();*/
		
	}

}
