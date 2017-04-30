package com.code.interview.bit;

import java.util.ArrayList;
import java.util.List;

public class LessSmallestNumber {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(12);
		list.add(11);
		list.add(10);
		list.add(15);
		list.add(6);
		prevSmaller(list);
	}
	public static ArrayList<Integer> prevSmaller(ArrayList<Integer> arr) {
		Node[] list = new Node[arr.size()+1];
		for(int i=0;i<arr.size();i++) {
			Node node = new Node(-1,arr.get(i),-1);
			list[i+1] = node;
		}
		for(int i=2;i<=arr.size();i++) {
			Node node = list[i-1];
			if(node.value<list[i].value) {
				list[i].index = i-1;
				list[i].lessValue = node.value;
			} else {
				while(node.index!=-1 && node.lessValue>list[i].value) {
					node = list[node.index];
				}
				list[i].index = node.index;
				list[i].lessValue = node.lessValue;
			}
		}
		ArrayList<Integer> list1 = new ArrayList<>();
		for(int i=1;i<=arr.size();i++) {
			list1.add(list[i].lessValue);
		}
		return list1;
		
    }
	

}
class Node {
	public Node(int index, int value, int lessValue) {
		this.index = index;
		this.value = value;
		this.lessValue = lessValue;
		
	}
	int index;
	int value;
	int lessValue;
}
