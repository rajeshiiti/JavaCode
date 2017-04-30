package com.code.interview.bit;

import java.util.ArrayList;
public class MergeKLists {
	 
	 public static void main(String[] args) {
		 MergeKLists mm = new MergeKLists();
		ListNode l11 = mm.new ListNode(3);
		ListNode l12 = mm.new ListNode(13);
		ListNode l13 = mm.new ListNode(23);
		ListNode l14 = mm.new ListNode(24);
		l11.next = l12;
		l12.next = l13;
		l13.next = l14;
		l14.next = null;
		
		ListNode l21 = mm.new ListNode(6);
		ListNode l22 = mm.new ListNode(14);
		ListNode l23 = mm.new ListNode(17);
		ListNode l24 = mm.new ListNode(25);
		ListNode l25 = mm.new ListNode(33);
		ListNode l26 = mm.new ListNode(34);
		l21.next = l22;
		l22.next = l23;
		l23.next = l24;
		l24.next = l25;
		l25.next = l26;
		l26.next = null;
		
		
		ListNode l31 = mm.new ListNode(1);
		ListNode l32 = mm.new ListNode(4);
		ListNode l33 = mm.new ListNode(5);
		ListNode l34 = mm.new ListNode(33);
		ListNode l35 = mm.new ListNode(53);
		ListNode l36 = mm.new ListNode(63);
		l31.next = l32;
		l32.next = l33;
		l33.next = l34;
		l34.next = l35;
		l35.next = l36;
		l36.next = null;
		
		ArrayList<MergeKLists.ListNode> a = new ArrayList<MergeKLists.ListNode>();
		a.add(l11);
		a.add(l21);
		a.add(l31);
		ListNode head = mm.mergeKLists(a);
		
		while(head!=null) {
			System.out.println(head.val);
			head = head.next;
		}
		
		
		
		
	}
	public ListNode mergeKLists(ArrayList<ListNode> a) {
		if(a.size()==1) {
			return a.get(0);
		}
		int size = a.size();
		ListNode[] heap = new ListNode[size+1];
		buildHeap(heap,a);
		ListNode head = null;
		ListNode current = null;
		while(heap[1]!=null) {
			if(head==null) {
				head = heap[1];
				current = head;
				if(null !=heap[1].next) {
					heap[1] = heap[1].next;
					minHeapify(1,heap,size);
				} else {
					heap[1] = heap[size];
					size -=1;
					minHeapify(1, heap, size);
				}
			} else {
				current.next = heap[1];
				if(null !=heap[1].next) {
					heap[1] = heap[1].next;
					minHeapify(1,heap,size);
				} else {
					heap[1] = heap[size];
					size -=1;
					minHeapify(1, heap, size);
				}
				current = current.next;
			}
			if(size==1) {
				current.next = heap[1];
				return head;
			}
			
		}
	    return head;
	}
	private void minHeapify(int idx, ListNode[] heap, int size) {
		int l = idx*2;
		int r = idx*2+1;
		int index = idx;
		if(l<=size && heap[l].val<heap[index].val) {
			index = l;
		}
		if(r<=size && heap[r].val<heap[index].val) {
			index = r;
		}
		if(index!=idx) {
			ListNode node = heap[idx];
			heap[idx] = heap[index];
			heap[index] = node;
			minHeapify(index, heap, size);
		}
	}
	private void buildHeap(ListNode[] heap, ArrayList<ListNode> a) {
		for(int i=0;i<a.size();i++) {
			if(null == a.get(i)) {
				continue;
			}
			heap[i+1] = a.get(i);
			heapify(i+1,heap);
		}
		
	}
	private void heapify(int i, ListNode[] heap) {
		int tmp = i / 2 ;
		if(tmp>=1 && heap[tmp].val>heap[i].val) {
			ListNode node1 = heap[tmp];
			heap[tmp] = heap[i];
			heap[i] = node1;
			heapify(tmp, heap);
		}
		
	}
	class ListNode {
	    public int val;
	    public ListNode next;
	    ListNode(int x) { val = x; next = null; }
	}

}
