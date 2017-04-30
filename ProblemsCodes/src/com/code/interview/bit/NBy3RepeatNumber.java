package com.code.interview.bit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NBy3RepeatNumber {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		List<Integer> array = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			array.add(inp.nextInt());
		}
		System.out.println(repeatedNumber(array));
		inp.close();
	}
	
	// DO NOT MODIFY THE LIST
	public static int repeatedNumber(final List<Integer> a) {
		int n = a.size();
		if(n<=2)
			return a.get(0);
		int slot1 = -1 ,slot2= -1;
		int cnt1=0,cnt2=0;
		for(int i = 0;i<n;i++) {
			if(a.get(i)!=slot2 && (cnt1==0 || a.get(i) == slot1) ) {
				slot1 = a.get(i);
				cnt1++;
			} else if(cnt2==0 || a.get(i)==slot2) {
				slot2 = a.get(i);
				cnt2++;
			} else {
				cnt1--;
				cnt2--;
			}
		}
		
		cnt1=0;
		cnt2=0;
		for(int i=0;i<n;i++) {
			if(a.get(i) == slot1)
				cnt1++;
			else if(a.get(i) == slot2)
				cnt2++;
		}
		if(cnt1>n/3)
			return slot1;
		if(cnt2>n/3)
			return slot2;
		return -1;
	}

}
