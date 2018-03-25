package com.effective.java.item.one;

public class InstaceControlled {
	static InstaceControlled instaceControlled = new InstaceControlled();
	
	public InstaceControlled() {
	}
	public static InstaceControlled getInstance() {
		return instaceControlled;
	}

}
