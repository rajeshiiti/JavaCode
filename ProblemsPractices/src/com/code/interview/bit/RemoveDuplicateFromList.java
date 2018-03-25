package com.code.interview.bit;

public class RemoveDuplicateFromList {
	
	public ListNode deleteDuplicates(ListNode a) {
	    ListNode tmp = null;
	    ListNode head = null;
	    while(a!=null) {
	        int cnt = 1;
	        while(a.next != null && a.val == a.next.val) {
	            a = a.next;
	            cnt++;
	        }
	        if(cnt==1) {
	            if(tmp==null) {
	            	head = a;
	                tmp = a;
	            } else {
	                tmp.next = a;
	                tmp = a;
	            }
	        }
	        a = a.next;
	    }
	    return head;
	}

}
