package com.code.interview.bit;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RainWaterTraped {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(0);
		list.add(2);
		list.add(1);
		list.add(0);
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(1);
		
		System.out.println(trap(list));
	}
	public static int trap(final List<Integer> a) {
		int water = 0;
		Stack<Integer> stack = new Stack<Integer>();
		int max = 0;
		for(int i=0;i<a.size();i++) {
			if(stack.isEmpty() && a.get(i)==0) {
				continue;
			} else if(stack.isEmpty() && a.get(i)>0) {
				max = i;
				stack.push(i);
			} else {
				if(a.get(max)>a.get(i)) {
					stack.push(i);
				} else {
					int cnt = 0;
					int sum = 0;
					while(!stack.isEmpty() && stack.peek()!=max) {
						sum+=a.get(stack.pop());
						cnt++;
					}
					if(!stack.isEmpty()) {
						sum = cnt*a.get(stack.pop()) - sum;
						water += sum;
					}
					max = i;
					stack.push(i);
				}
			}
			
		}
		while(!stack.isEmpty()) {
			int max1 = stack.pop();
			int cnt = 0;
			int sum = 0;
			while(!stack.isEmpty() && a.get(stack.peek())<a.get(max1)) {
				cnt++;
				sum+=a.get(stack.pop());
			}
			sum = cnt*a.get(max1)-sum;
			water+=sum;
		}
		return water;
	}

}
