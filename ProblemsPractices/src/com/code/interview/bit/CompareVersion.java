package com.code.interview.bit;

public class CompareVersion {
	public static void main(String[] args) {
		System.out.println(compareVersion("01", "1"));
	}
	
	public static int compareVersion(String a, String b) {
		a = getfinalString(a);
		b = getfinalString(b);
		int l1 = a.length();
		int l2 = b.length();
		int l = l2;
		if(l2>l1) {
			l = l1;
		}
		for(int i=0;i<l;i++) {
			if(a.charAt(i)=='.' && b.charAt(i)=='.') {
				continue;
			} else if(a.charAt(i)=='.' && b.charAt(i)!='.') {
				return -1;
			} else if(a.charAt(i)!='.' && b.charAt(i)=='.') {
				return 1;
			} else if(a.charAt(i)>b.charAt(i)) {
				return 1;
			} else if(a.charAt(i)<b.charAt(i)) {
				return -1;
			}
		}
		if(l1>l2) 
			return 1;
		if(l2>l1) 
			return -1;
		return 0;
		
	}
	public static String getfinalString(String a) {
	    String tmp = "";
	    int i =0;
	    while(i<a.length() && a.charAt(i)=='0' && i+1<a.length() && a.charAt(i+1)!='.') {
	        i++;
	    }
	    if(i<a.length()) {
		    tmp = a.substring(i,a.length());
		    int j = tmp.length()-1;
		    while(j>=0 && tmp.charAt(j)=='0') {
		    	j--;
		    }
		    if(j>0 && tmp.charAt(j)=='.') {
		    	j--;
		    }
		    
	    } else {
	    	tmp = "0";
	    }
	    return tmp;
	}

}
