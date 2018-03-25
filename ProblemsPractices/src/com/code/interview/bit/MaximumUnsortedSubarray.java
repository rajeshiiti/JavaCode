package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaximumUnsortedSubarray {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			array.add(inp.nextInt());
		}
		ArrayList<Integer> list = subUnsort(array);
		for(Integer inte:list) {
			System.out.print(inte+" ");
		}
		inp.close();
	}
	
	public static ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
		ArrayList<Integer> list = (ArrayList<Integer>) A.clone();
		Collections.sort(list);
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int l = 0;
		int r =A.size()-1;
		while(l<A.size() && list.get(l)==A.get(l)) {
			l++;
		}
		while(r>=0 && list.get(r)==A.get(r)) {
			r--;
		}
		if(l==A.size() || r==-1) {
			ans.add(-1);
		} else {
			ans.add(l);
			ans.add(r);
		}
		return ans;
    }

}
