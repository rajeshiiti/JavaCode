package com.java.reflection;

import java.lang.reflect.Method;

public class TestMain {
	public static void main(String[] args) {
		Method methods[] = MyObject.class.getMethods();
		for(Method method: methods) {
			System.out.println(method.getName());
		}
	}

}
