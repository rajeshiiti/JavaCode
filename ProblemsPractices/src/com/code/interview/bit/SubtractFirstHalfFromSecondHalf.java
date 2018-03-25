package com.code.interview.bit;

public class SubtractFirstHalfFromSecondHalf {
	
	
	public ListNode subtract(ListNode a) {
	    ListNode tmp = a;
	    ListNode sH = null;
	    ListNode sT = null;
	    ListNode fH = a;
	    ListNode fT = null;
	    int cnt = 1;
	    while(tmp.next!=null) {
	        tmp = tmp.next;
	        cnt++;
	    }
	    sT = tmp;
	    if(cnt==1) {
	        return a;
	    } else if(cnt==2) {
	        a.val = a.next.val - a.val;
	        return a;
	    }
	    if(cnt%2==1) {
	        int cnt2 = cnt/2 +1;
	        tmp = a;
	        while(cnt2>1) {
	            tmp = tmp.next;
	            cnt2--;
	        }
	        fT = tmp;
	        sH = tmp.next;
	        tmp = sH;
	        reverse(tmp).next = null;
	        tmp = fH;
	        ListNode tmp1 =sT;
	        while(tmp!=null && sT!=null) {
	            tmp.val = sT.val - tmp.val;
	            tmp = tmp.next;
	            sT = sT.next;
	        }
	        tmp = sT;
	        reverse(tmp).next = null;
	        fT.next = sH;
	    } else {
	        int cnt2 = cnt/2;
	        tmp = a;
	        while(cnt2>1) {
	            tmp = tmp.next;
	            cnt2--;
	        }
	        fT = tmp;
	        sH = tmp.next;
	        tmp = sH;
	        reverse(tmp).next = null;
	        tmp = fH;
	        ListNode tmp1 =sT;
	        while(tmp!=null && sT!=null) {
	            tmp.val = sT.val - tmp.val;
	            tmp = tmp.next;
	            sT = sT.next;
	        }
	        tmp = sT;
	        reverse(tmp).next = null;
	        fT.next = sH;
	    }
	    return a;
	}
	public ListNode reverse(ListNode tmp) {
	    if(tmp.next!=null) {
	        ListNode node = reverse(tmp.next);
	        node.next = tmp;
	    }
	    return tmp;
	}

}
