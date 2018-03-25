package com.code.interview.bit;

public class ReOrderLinkedList {
	public static void main(String[] args) {
		ReOrderLinkedList list2 = new ReOrderLinkedList();
		ListNode head = new ListNode(2);
		ListNode node1 = new ListNode(12);
	    head.next = node1;
		ListNode node2 = new ListNode(3);
		node1.next = node2;
		ListNode node3 = new ListNode(13);
		node2.next = node3;
		node3.next = null;
		ListNode tmp = list2.reorderList(head); //(head, 1, 4);
		while(tmp!=null) {
			System.out.println(tmp.val);
			tmp = tmp.next;
		}
	}
	
	public ListNode reorderList(ListNode a) {
	    int cnt = 1;
	    ListNode tmp = a;
	    while(tmp.next!=null) {
	        tmp = tmp.next;
	        cnt++;
	    }
	    if(cnt<=2) {
	        return a;
	    }
	    int cnt2 = cnt/2 + cnt%2;
	    tmp = a;
	    while(cnt2>1) {
	        tmp = tmp.next;
	        cnt2--;
	    }
	    ListNode headS = tmp.next;
	    tmp.next = null;
	    
	    ListNode prev = null;
	    ListNode head = headS;
	    tmp = headS;
	    while(head!=null) {
	        tmp = head.next;
	        head.next = prev;
	        prev = head;
	        head = tmp;
	    }
	    head = a;
	    headS = prev;
	    ListNode headF = a.next;
	    boolean bl = false;
	    while(headS!=null && headF !=null) {
	        if(bl) {
	            head.next = headF;
	            head = head.next;
	            headF = headF.next;
	            bl = false;
	        } else {
	            head.next = headS;
	            head = head.next;
	            headS = headS.next;
	            bl = true;
	        }
	    }
	    if(headS!=null) {
	        head.next =headS;
	        head = head.next;
	    }
	    if(headF!=null) {
	        head.next =headF;
	        head = head.next;
	    }
	    head.next = null;
	    return a;
	    
	}

}
