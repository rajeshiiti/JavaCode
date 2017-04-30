package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestSumContiguosSubArray {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String str = inp.nextLine();
		ArrayList<Integer> list = flip(str);
		if(list.size()>0){
			System.out.println(list.get(0)+" "+list.get(1));
		}
		inp.close();
	}
	
	 static public ArrayList<Integer> flip(String A) {
		 int n = A.length();
		 int[] array = new int[n];
		 for(int i=0;i<n;i++) {
			 if( ((int)A.charAt(i))-48 == 0 ) {
				 array[i] = 1;
			 } else {
				 array[i] = -1;
			 }
		 }
		 int count1 = Integer.MIN_VALUE;
		 int count2 = 0;
		 int s=0,l=-1,r =-1;
		 for(int i=0;i<n;i++) {
			 count2+=array[i];
			 if(count1<count2 && count2>0) {
				 count1 = count2;
				 if(count1 == count2) {
					 l = s;
					 r = i; 
				 } else {
					 
				 }
				 
			 }
			 if(count2<0) {
				 count2 = 0;
				 s = i+1;
			 }
		 }
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 if(l>=0 || r>=0) {
			 list.add(l+1);
			 list.add(r+1);
		 }
		 
		return list;
		 
	 }

}
