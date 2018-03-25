package com.code.interview.bit;

import java.util.Stack;

public class StackOperation {
	public static void main(String[] args) {
		
	}
	 Stack<Integer> elements = new Stack<Integer>();
	 Stack<Integer> minStack = new Stack<Integer>();
	    public void push(int x) {
	        elements.push(x);
	        if(elements.size()==1 	|| x<=minStack.peek()) {
	        	minStack.push(x);
	        }
	    }

	    public void pop() {
	        if(!elements.isEmpty()) {
	        	if(!minStack.isEmpty() && 
	        			minStack.peek()==elements.peek()) {
		        	minStack.pop();
		        }
		        elements.pop();
	        }
	    }

	    public int top() {
	    	if(elements.isEmpty()) return -1;
	        return elements.peek();
	    }

	    public int getMin() {
	        if(minStack.isEmpty()) return -1;
	        return minStack.peek();
	    }

}
