package com.java.deprecated;

public class DeprecatedAPI {
	
	/**
	 * @deprecated Please use {@link #getData()}
	 */
	@Deprecated
	public void data() {
		System.out.println("I am deprecated...");
	}
	
	public void getData() {
		System.out.println("I am new Api,  please use me...");
	}

}
