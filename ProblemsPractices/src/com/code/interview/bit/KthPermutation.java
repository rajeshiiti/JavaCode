package com.code.interview.bit;

import java.util.ArrayList;

public class KthPermutation {
	public static void main(String[] args) {
		System.out.println(getPermutation(4, 1));
	}
	
	public static String getPermutation(int n, int k) {
		long number = 1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<=n;i++) {
			list.add(i);
			number *= i;
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		if(k==number) {
			StringBuilder sb = new StringBuilder();
			for(int i = n;i>=1;i--) {
				sb.append(i);
			}
			return sb.toString();
		}
		number /=n;
		n-=1;
		boolean bl = true;
		while(k>0 && bl) {
			long tmp =  number;
			int index = 0;
			long deductValue = tmp;
			for(int i=0;i<list.size();i++) {
				if(k<=tmp) {
					ans.add(list.get(i));
					index = i;
					list.remove(index);
					deductValue = number*(i);
					if(k==tmp) 
						bl = false;
					break;
				}
				tmp +=number;
			}
			k -= deductValue;
			number /= n;
			n-=1;
		}
		if(!bl) {
			for(int i=list.size()-1;i>=0;i--) {
				ans.add(list.get(i));
				list.remove(i);
			}
		}
		if(list.size()>0) {
			ans.addAll(list);
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<ans.size();i++) {
			sb.append(ans.get(i).toString());
		}
		return sb.toString();
	}

}
