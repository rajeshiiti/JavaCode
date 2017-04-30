package com.code.interview.bit;

public class ListLoop {
	public static void main(String[] args) {
		ListNode l21 = new ListNode(1);
		ListNode l22 = new ListNode(0);
		ListNode l23 = new ListNode(1);
		ListNode l24 = new ListNode(6);
		ListNode l25 = new ListNode(3);
		l21.next = l22;
		l22.next = l23;
		l23.next = l24;
		l24.next = l25;
		l25.next = l23;
		detectCycle(l21);
	}
	public static ListNode detectCycle(ListNode a) {
	    ListNode slowP = a;
	    ListNode fastP = a;
	    boolean mm = true;
	    while(slowP!=null && fastP!=null) {
	    	if(slowP==fastP && mm) {
	    		mm =false;
	    	} else if(slowP==fastP){
	    		break;
	    	}
	    	slowP = slowP.next;
	    	fastP = fastP.next;
	    	if(fastP!=null) {
	    		fastP=fastP.next;
	    	}
	    }
	    if(fastP==null) {
	    	return null;
	    }
	    slowP = a;
	    while(slowP!=fastP) {
	    	slowP = slowP.next;
	    	fastP = fastP.next;
	    }
		return fastP;
	}

}
