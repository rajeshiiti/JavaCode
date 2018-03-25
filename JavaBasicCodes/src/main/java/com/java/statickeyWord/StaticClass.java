package com.java.statickeyWord;

public class StaticClass {
	static int tmp;
	int tmp2;
	static class StaticInnerClass {
		StaticClass staticClass = new StaticClass();
		
		int a = staticClass.tmp2;
		static int c = tmp;
		public int getA() {
			return this.a;
		}
	}

}
