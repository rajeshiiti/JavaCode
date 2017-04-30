package com.code.interview.bit;

public class LinkedListIntersection {
	ListNode rHeadA = null;
	ListNode rHeadB = null;
	public ListNode getIntersectionNode(ListNode a, ListNode b) {
		if(a==null || b==null) 
			return null;
	   reverseLinkedListA(a).next=null;
	   reverseLinkedListB(b).next=null;
	   while(rHeadA.val==rHeadB.val) {
		   if(rHeadA.next == null || rHeadB.next == null) {
			   return null;
		   } else {
			   rHeadA = rHeadA.next;
			   rHeadB = rHeadB.next;
		   }
	   }
	   return rHeadA;
	    
	}
	private ListNode reverseLinkedListA(ListNode a) {
		if(a.next!=null) {
			ListNode node = reverseLinkedListA(a.next);
			node.next = a;
		} else {
			rHeadA = a;
		}
		return a;
	}
	private ListNode reverseLinkedListB(ListNode a) {
		if(a.next!=null) {
			ListNode node = reverseLinkedListB(a.next);
			node.next = a;
		} else {
			rHeadB = a;
		}
		return a;
	}
	

}
class ListNode {
     public int val;
     public ListNode next;
     ListNode(int x) { val = x; next = null; }
}
