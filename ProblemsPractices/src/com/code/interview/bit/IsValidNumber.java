package com.code.interview.bit;

public class IsValidNumber {
	public static void main(String[] args) {
		System.out.println(isNumber("3."));
	}
	public static int isNumber(final String a) {
		int ii = 0;
		while(ii<a.length() && a.charAt(ii)==' ') {
			ii++;
		}
		if(ii==a.length()){
			return 0;
		}
		if(a==null || a.isEmpty())
			return 0;
		if(a.charAt(a.length()-1)=='.') {
				return 0;
		}
			int eIndex = isEExist(a);
			if(eIndex>=0) {
				if(eIndex>0 && a.charAt(eIndex-1)=='.') {
					return 0;
				}
				boolean bl = checkDotAfterE(eIndex,a);
				if(!bl) {
					return 0;
				}
				for(int i=0;i<a.length();i++) {
					if( (a.charAt(i) =='-' || a.charAt(i) ==' ' || i==eIndex || (int)a.charAt(i)>=48 && (int)a.charAt(i)<=57)|| a.charAt(i)=='.') {
						continue;
					} else 
						return 0;
				}
				return 1;
			} else {
				for(int i=0;i<a.length();i++) {
					if(a.charAt(i) =='-' || a.charAt(i) ==' ' || a.charAt(i)=='.'||  ((int)a.charAt(i)>=48 && (int)a.charAt(i)<=57)) {
						continue;
					} else 
						return 0;
				}
				return 1;
			}	
			
	}
	private static boolean checkDotAfterE(int eIndex, String a) {
		for(int i=eIndex+1;i<a.length();i++) {
			if(a.charAt(i)=='.') {
				return false;
			}
		}
		// TODO Auto-generated method stub
		return true;
	}
	private static int isEExist(String a) {
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='e') {
				return i;
			}
		}
		// TODO Auto-generated method stub
		return -1;
	}

}
