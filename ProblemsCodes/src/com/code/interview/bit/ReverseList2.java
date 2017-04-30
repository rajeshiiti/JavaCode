package com.code.interview.bit;

public class ReverseList2 {
	public static void main(String[] args) {
		ReverseList2 list2 = new ReverseList2();
		ListNode head = new ListNode(2);
		ListNode node1 = new ListNode(12);
	    head.next = node1;
		ListNode node2 = new ListNode(3);
		node1.next = node2;
		ListNode node3 = new ListNode(13);
		node2.next = node3;
		node3.next = null;
		ListNode tmp = list2.reverseBetween(head, 1, 4);
		while(tmp!=null) {
			System.out.println(tmp.val);
			tmp = tmp.next;
		}
	}
	
    ListNode headM = null;
 	ListNode tailM = null;
    ListNode headP = null;
    ListNode tailP = null;
    ListNode headA = null;
    ListNode tailA = null;
public ListNode reverseBetween(ListNode a, int m, int n) {
    int cnt = n-m+1;
    if(cnt==1) {
        return a;
    }
    ListNode tmp = a;
    int cnt3 = 1;
    while(tmp.next!=null) {
    	cnt3++;
    	tmp = tmp.next;
    }
    tailA = tmp;
    if(cnt3 == cnt) {
    	reverseList(a, 1, cnt3).next=null;
    	return tailA;
    } else if(m==1) {
    	reverseList(a, 1, cnt).next = headA;
    	return tailM;
    } else if(n==cnt3) {
    	tmp = a;
    	int ff = 2;
    	while(ff<m) {
    		tmp = tmp.next;
    		ff++;
    	}
    	tailP = tmp;
    	headM = tmp.next;
    	reverseList(tmp.next, 1, cnt);
    	tailP.next = tailM;
    	headM.next = null;
    	return a;
    } else {
    int cnt1 = 2;
    tmp =a;
    while(cnt1<m) {
        tmp = tmp.next;
        cnt1++;
    }
    
    	tailP = tmp;
        headM = tmp.next;
    tmp = headM;
    reverseList(tmp,1,cnt);
    headM.next = headA;
    tailP.next = tailM;
    return a;
    }
}
private ListNode reverseList(ListNode hea,int tmp ,int total) {
    if(tmp<total) {
        ListNode node = reverseList(hea.next,tmp+1,total);
        node.next = hea;
    } else {
        headA = hea.next;
        tailM = hea;
    }
    return hea;
}

}
