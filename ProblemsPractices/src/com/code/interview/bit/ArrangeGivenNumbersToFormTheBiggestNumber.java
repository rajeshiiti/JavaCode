package com.code.interview.bit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
public class ArrangeGivenNumbersToFormTheBiggestNumber {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		final List<Integer> list = new ArrayList<Integer>();
		int n = inp.nextInt();
		for(int i=0;i<n;i++) {
			list.add(inp.nextInt());
		}
		System.out.println(largestNumber(list));
		inp.close();
	}
	
	public static String largestNumber(final List<Integer> list) {
		 List<String> list1 = new ArrayList<String>();
		for(Integer inte:list) {
			list1.add(inte.toString());
		}
		Collections.sort(list1, LargestComparator);
		StringBuilder sb = new StringBuilder();
		for(String inte:list1) {
			sb.append(inte);
			//System.out.println(inte);
		}
		String str = sb.toString();
		int i=0;
		while(i<str.length() && Integer.parseInt(str.substring(i,i+1))==0 ) {
			i++;
		}
		if(i==str.length()) {
			return "0";
		} else {
			return str.substring(i, str.length());
		}
	    
	}
	public static Comparator<String> LargestComparator = new Comparator<String>() {
		
		@Override
		public int compare(String o1,String o2) {
			String tmp1 = o1.toString().concat(o2.toString());
			String tmp2 = o2.toString().concat(o1.toString());
			if(tmp1.compareTo(tmp2)>=0)
				return -1;
			return 1;
			
		}
		
	};
	

}
