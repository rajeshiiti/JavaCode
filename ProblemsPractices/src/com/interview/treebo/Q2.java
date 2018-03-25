package com.interview.treebo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * try to applying disjoint problems
 * @author rajesh.verma
 *
 */
public class Q2 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		Node[] array = new Node[n+1];
		boolean visit[] = new boolean[n+1];
		for(int i=1;i<=n;i++) {
			visit[i] = false;
			int tmp = inp.nextInt();
			Node node = array[i];
			if(node!=null) {
			getInputList(array, tmp, node);
			
			
			} else {
				node = new Node(i);
				
				getInputList(array, tmp, node);
			}
		}
		traverseList(array,visit,1);
		int k = inp.nextInt();
		while(k>0) {
			int decide = inp.nextInt();
			int ind = inp.nextInt();
			if(decide==1) {
				Node node = array[ind];
				if(node.isLoop()) {
					System.out.println("LOOP");
				} else {
					System.out.println(node.getFinalChild());
				}
			} else {
				if(array[ind].getFinalChild()!=ind) {
					updateNodeRemove(array,ind);
				}
			}
			k--;
		}
		inp.close();
		
	}

	private static void traverseList(Node[] array, boolean[] visit, int idx) {
		if(visit[idx]) {
			array[idx].setLoop(true);
			return ;
		}
		if(array[idx].getFinalChild()!=idx && !visit[idx]) {
			traverseList(array, visit, idx);
			array[idx].setLoop(array[idx].getChild().isLoop());
			array[idx].setFinalChild(array[idx].getChild().getFinalChild());
			array[idx].setPpCount(array[idx].getChild().getPpCount()+1);
		} else {
			array[idx].setPpCount(0);
		}
		visit[idx] = true;
	}


	private static void updateNodeRemove(Node[] array, int ind) {
		if(array[ind].getFinalChild()!=ind) {
			array[ind].setFinalChild(ind);
		}
		
	}

	public static void getInputList(Node[] array, int tmp, Node node) {
		Node cNode;
		if(array[tmp]!=null) {
			cNode = array[tmp];
		} else {
			cNode = new Node(tmp);
		}
		node.setChild(cNode);
		node.setFinalChild(tmp);
		cNode.getpList().add(node);
	}

}
class Node {
	private int index;
	private Node child;
	private List<Node> pList;
	private boolean loop;
	private int finalChild;
	private int ppCount;
	public Node(int index) {
		this.index = index;
		this.pList = new ArrayList<Node>();
		this.loop =false;
		this.ppCount = 0;
		this.finalChild = index;
	}
	


	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public Node getChild() {
		return child;
	}
	public void setChild(Node child) {
		this.child = child;
	}
	public List<Node> getpList() {
		return pList;
	}
	public void setpList(List<Node> pList) {
		this.pList = pList;
	}
	public boolean isLoop() {
		return loop;
	}
	public void setLoop(boolean loop) {
		this.loop = loop;
	}
	public int getFinalChild() {
		return finalChild;
	}
	public void setFinalChild(int finalChild) {
		this.finalChild = finalChild;
	}
	public int getPpCount() {
		return ppCount;
	}
	public void setPpCount(int ppCount) {
		this.ppCount = ppCount;
	}
	
	
	
}
