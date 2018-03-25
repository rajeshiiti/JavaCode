package com.code.interview.bit;

import java.util.HashMap;
import java.util.Map;

public class CopyRandomList {
	class RandomListNode {
		      int label;
		      RandomListNode next, random;
		      RandomListNode(int x) { this.label = x; }
	};
	 public RandomListNode copyRandomList(RandomListNode head) {
			 Map<RandomListNode,RandomListNode> map = new HashMap<RandomListNode,RandomListNode>();
			 RandomListNode node = head;
			 while(node!=null) {
				 map.put(node, new RandomListNode(node.label));
				 node=node.next;
			 }
			 node = head;
			 while(node!=null) {
				 RandomListNode node1 = map.get(node);
				 if(node.next!=null) {
					 node1.next = map.get(node.next);
				 }
				 if(node.random!=null) {
					 node1.random = map.get(node.random);
				 }
				 node = node.next;
			 }
			
			return map.get(head);
	        
	 }

}
