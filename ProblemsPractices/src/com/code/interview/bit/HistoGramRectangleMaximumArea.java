package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Stack;

public class HistoGramRectangleMaximumArea {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		//[ 6, 2, 5, 4, 5, 1, 6 ]
		list.add(6);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(5);
		list.add(1);
		list.add(6);
		System.out.println(largestRectangleArea(list));
		
		
	}
	public static int largestRectangleArea(ArrayList<Integer> a) {
		   Stack<Integer> stack = new Stack<>();
			stack.push(0);
			int area = -1;
			for(int i=1;i<a.size();i++) {
				if(a.get(i)>=a.get(i-1)) {
					stack.push(i);
				} else {
				while(!stack.isEmpty() && a.get(stack.peek())> a.get(i)) {
						int stkTop = stack.pop();
						if(stack.isEmpty()) {
							area = Math.max(area,a.get(stkTop)*i);
						} else {
							area = Math.max(area,a.get(stkTop)*(i-(stack.peek()+1)));
						}
						
					}
					stack.push(i);
				}
			}
			int i = a.size();
			while(!stack.isEmpty()) {
				int stkTop = stack.pop();
				if(stack.isEmpty()) {
					area = Math.max(area,a.get(stkTop)*i);
				} else {
					area = Math.max(area, a.get(stkTop)*(i-(stack.peek()+1)));
				}
			}
			
			return area;
	}

}
