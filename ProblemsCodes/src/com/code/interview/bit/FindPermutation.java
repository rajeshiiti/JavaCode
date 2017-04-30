package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Scanner;

public class FindPermutation {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		inp.nextLine();
		String str = inp.nextLine();
		ArrayList<Integer> list = findPerm(str, n);
		for(Integer inte:list) {
			System.out.println(inte);
		}
	}
	public static ArrayList<Integer> findPerm(final String A, int B) {
		ArrayList<Integer> list  = new ArrayList<Integer>();
		int start = 1, end = B;
		int n = A.length()-1;
		while(n>=0) {
			if(A.charAt(n)=='D') {
				list.add(start);
				start++;
			} else {
				list.add(end);
				end--;
			}
			n--;
		}
		if(start>0) {
			list.add(start);
		} else if(end>0) {
			list.add(end);
		}
		int i=0,j=n;
		while(i<j) {
			int tmp = list.get(j);
			list.set(i, list.get(j));
			list.set(j, tmp);
			i++;
			j--;
		}
		return list;
    }

}
