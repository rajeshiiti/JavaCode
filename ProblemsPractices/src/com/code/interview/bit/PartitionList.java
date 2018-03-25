package com.code.interview.bit;

public class PartitionList {
	public static void main(String[] args) {
		
	}
	public static ListNode partition(ListNode a, int b) {
		  ListNode ans = null;
		    ListNode mm = null;
			ListNode tmp = a;
			while(tmp!=null) {
				if(tmp.val<b) {
					ListNode node = new ListNode(tmp.val);
					if(ans==null) {
					    mm = node;
						ans = node;
					} else {
						ans.next = node;
						ans = ans.next;
					}
				}
				tmp = tmp.next;
			}
			tmp = a;
			while(tmp!=null) {
				if(tmp.val>=b) {
					ListNode node = new ListNode(tmp.val);
					if(ans==null) {
						ans = node;
						mm = node;
					} else {
						ans.next = node;
						ans = ans.next;
					}
				}
				tmp = tmp.next;
			}
			
			return mm;
		}

}
