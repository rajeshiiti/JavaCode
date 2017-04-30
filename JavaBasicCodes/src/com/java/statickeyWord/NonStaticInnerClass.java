package com.java.statickeyWord;

public class NonStaticInnerClass {
	static int a;
	int b;
	class NonStaticInner {
		int aa = a;
		int bb = b;
		static final int c =100;
		public int getA() {
			return this.aa;
		}
	}

}
