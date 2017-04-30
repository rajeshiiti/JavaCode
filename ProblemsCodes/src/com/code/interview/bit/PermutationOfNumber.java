package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class PermutationOfNumber {
	
	public static void main(String[] args) {
		
		
	}
	
	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
		ArrayList<Boolean> b = new ArrayList<Boolean>();
		for(int i=a.size()-1;i>=0;i--) {
			b.add(true);
		}
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		Stack<Integer> stack = new Stack<Integer>();
		permutationOfNumber(b,a,ans,0,stack);
		return ans;
	}

	private void permutationOfNumber(ArrayList<Boolean> b,ArrayList<Integer> a,
			ArrayList<ArrayList<Integer>> ans,int cnt, Stack<Integer> stack ) {
		if(cnt==a.size()) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			Iterator<Integer>  inte = stack.iterator();
			while(inte.hasNext()) {
				list.add(inte.next());
			}
			ans.add(list);
		} else {
			for(int i=0;i<b.size();i++) {
				if(b.get(i)) {
					b.set(i, false);
					stack.push(a.get(i));
					permutationOfNumber(b, a, ans, cnt+1, stack);
					b.set(i, true);
					stack.pop();
				}
			}
		}
		
	}

}
