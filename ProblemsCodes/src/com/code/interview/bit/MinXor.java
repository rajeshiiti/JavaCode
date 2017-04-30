package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Collections;

public class MinXor {
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(12);
		A.add(32);
		A.add(21);
		System.out.println(findMinXor(A));
		
	}
	public static int findMinXor(ArrayList<Integer> A) {
		Collections.sort(A);
		int smallXOR = A.get(0) ^ A.get(1);
		for(int i=1;i<A.size();i++) {
			smallXOR = Math.min(smallXOR, A.get(i) ^ A.get(i-1));
		}
		return smallXOR;
    }

}
