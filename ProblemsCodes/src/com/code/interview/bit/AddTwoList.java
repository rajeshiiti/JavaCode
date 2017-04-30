package com.code.interview.bit;

public class AddTwoList {
	public static void main(String[] args) {
		ListNode l11 = new ListNode(0);
		//ListNode l12 = new ListNode(6);
		//ListNode l13 = new ListNode(8);
		//l11.next = l12;
		//l12.next = l13;
		l11.next = null;
		
		
		ListNode l21 = new ListNode(1);
		ListNode l22 = new ListNode(0);
		ListNode l23 = new ListNode(1);
		//ListNode l24 = new ListNode(6);
		//ListNode l25 = new ListNode(3);
		l21.next = l22;
		l22.next = l23;
		//l23.next = l24;
		//l24.next = l25;
		l23.next = null;
		ListNode ans = addTwoNumbers(l11, l21);
		while(ans!=null) {
			System.out.println(ans.val);
			ans = ans.next;
		}
		
	}
	public static ListNode addTwoNumbers(ListNode a, ListNode b) {
	    ListNode af = a;
	    ListNode bf = b;
	    ListNode ans = a;
	    int prev = 0;
	    while(af!=null && bf!=null) {
	        int sum = af.val + bf.val + prev;
	        prev = sum/10;
	        sum = sum % 10;
	        af.val = sum;
	        ans = af;
	        af = af.next;
	        bf = bf.next;
	    }
	    while(af!=null) {
	        int sum = af.val + prev;
	        prev = sum/10;
	        sum = sum % 10;
	        af.val = sum;
	        ans = af;
	        af = af.next;
	    }
	    while(bf!=null) {
	        int sum = bf.val + prev;
	        prev = sum/10;
	        sum = sum % 10;
	        bf.val = sum;
	        ans.next = bf;
	        ans = ans.next;
	        bf = bf.next;
	    }
	    if(prev>0) {
	        ListNode node = new ListNode(prev);
	        ans.next = node;
	        ans = ans.next;
	    }
	    ans.next = null;
	     ListNode ansTail = a;
	     ListNode tmp = a;
	     ListNode prevS = tmp; 
	     while(tmp!=null) {
	         if(tmp.val==0) {
	             while(tmp!=null && tmp.val==0) {
	                 tmp = tmp.next;
	             }
	             if(tmp==null) {
	                 ansTail.next = null;
	                 return a;
	             } else {
	                 ansTail = tmp;
	             }
	         } else {
	             ansTail = tmp;
	            
	         }
	         if( tmp != null && tmp.next == null) {
	             ansTail.next = null;
	             return a;
	         }
	         tmp = tmp.next;
	     }
	     return a;
	    
	}

}
