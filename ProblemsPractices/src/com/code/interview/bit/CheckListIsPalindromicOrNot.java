package com.code.interview.bit;

public class CheckListIsPalindromicOrNot {
	
	public static void main(String[] args) {
		// ListNode head = new ListNode(2);
		// ListNode node1 = new ListNode(2);
		// head.next = node1;
		ListNode node2 = new ListNode(2);
		// node1.next = node2;
		ListNode node3 = new ListNode(2);
		node2.next = node3;
		node3.next = null;
		System.out.println(lPalin(node2));
	}
	
	public static int lPalin(ListNode A) {
		ListNode tmp = A;
		if(A==null) {
			return 0;
		} else if(A.next==null) {
			return 1;
		}
		int cnt = 1;
		while(tmp.next!=null) {
			tmp = tmp.next;
			cnt++;
		}
		if(cnt%2==0) {
			ListNode fHead = A;
			ListNode fTail = A;
			ListNode sHead = tmp;
			int cnt1 = cnt/2;
			tmp = A;
			while(cnt1>0) {
				if(cnt1==1) {
					fTail = tmp;
				}
				tmp = tmp.next;
				cnt1--;
			}
			reverseList(tmp).next = null;
			tmp = fHead;
			ListNode tmp2 = sHead;
			fTail.next = null;
			while(tmp!=null && tmp2!=null && tmp.val == tmp2.val) {
				tmp = tmp.next;
				tmp2 = tmp2.next;
			}
			if(tmp==null) 
				return 1;
			
		} else {
			ListNode fHead = A;
			ListNode fTail = A;
			ListNode sHead = tmp;
			ListNode sTail = null;
			ListNode midNode = null;
			int cnt1 = cnt/2;
			tmp = A;
			while(cnt1>0) {
				if(cnt1==1) {
					fTail = tmp;
				}
				tmp = tmp.next;
				cnt1--;
			}
			midNode = tmp;
			if(midNode.next!=null) {
				sTail = midNode.next;
			}
			tmp = sTail;
			midNode.next = null;
			reverseList(tmp).next = null;
			tmp = fHead;
			ListNode tmp2 = sHead;
			fTail.next = null;
			while(tmp!=null && tmp2!=null && tmp.val == tmp2.val) {
				tmp = tmp.next;
				tmp2 = tmp2.next;
			}
			if(tmp==null) 
				return 1;
		}
		return 0;
    }

	private static ListNode reverseList(ListNode tmp) {
		if(tmp.next != null) {
			ListNode node = reverseList(tmp.next);
			node.next = tmp;
		}
		return tmp;
	}

}
