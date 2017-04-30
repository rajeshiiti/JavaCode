package com.code.interview.bit;

public class SwapAdjacent {
	public static void main(String[] args) {
		ListNode l21 = new ListNode(1);
		ListNode l22 = new ListNode(0);
		l21.next = l22;
		l22.next = null;
		swapPairs(l21);
	}
	
	public static  ListNode swapPairs(ListNode a) {
	    ListNode prev = null;
	    ListNode head = a;
	    if(a!=null && a.next!=null) {
	        prev = a.next;
	        a.next = prev.next;
	        prev.next = a;
	        head = prev;
	        prev = prev.next;
	    } else {
	        return a;
	    }
	    ListNode node1 = prev.next;
	     ListNode node2 = null;
	    if(node1!=null && node1.next!=null) {
	        node2 = node1.next;
	        while(node1!=null && node2!=null) {
	            prev.next = node2;
	            node1.next = node2.next;
	            node2.next  = node1;
	            prev = node1;
	            if(node1.next != null) {
	                node1 = node1.next;
	                node2 = node1.next;
	            } else {
	               return head;
	            }
	        }
	        
	    } else {
	        return head;
	    }
	    return head;
	}

}
