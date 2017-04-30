package com.data.structure.disjointset;

import java.util.Scanner;

public class CountFriends {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int m = inp.nextInt();
		Node[] nodes = new Node[n+1];
		for(int i=1;i<=n;i++) {
			Node node = new Node();
			node.setParent(i);
			node.setRank(0);
			nodes[i] = node;
		}
		for(int i=1;i<=m;i++) {
			int a = inp.nextInt();
			int b = inp.nextInt();
			mergeSets(a,b,nodes);
		}
		for(int i=1;i<=n;i++) {
			int rank = nodes[findSets(i, nodes)].getRank();
			System.out.print(rank+" ");
		}
		
		inp.close();
	}

	private static void mergeSets(int a, int b, Node[] nodes) {
		int pa = findSets(a,nodes);
		int pb = findSets(b,nodes);
		if(pa!=pb) {
			if(nodes[pa].getRank()>nodes[pb].getRank()) {
				nodes[pb].setParent(pa);
				nodes[pa].setRank(nodes[pa].getRank()+nodes[pb].getRank()+1);
				nodes[pb].setRank(nodes[pa].getRank());
				nodes[a].setParent(pa);
				nodes[b].setParent(pa);
				nodes[a].setRank(nodes[pa].getRank());
				nodes[b].setRank(nodes[pa].getRank());
				
			} else {
				nodes[pa].setParent(pb);
				nodes[pb].setRank(nodes[pa].getRank()+nodes[pb].getRank()+1);
				nodes[pa].setRank(nodes[pb].getRank());
				nodes[a].setParent(pb);
				nodes[b].setParent(pb);
				nodes[a].setRank(nodes[pb].getRank());
				nodes[b].setRank(nodes[pb].getRank());
			}
		}
		
	}

	private static int findSets(int a, Node[] nodes) {
		if(a!=nodes[a].getParent()) {
			int p = findSets(nodes[a].getParent(), nodes);
			int r = nodes[p].getRank();
			nodes[a].setRank(r);
			nodes[a].setParent(p);
		}
		return nodes[a].getParent();
	}
	

}
class Node {
	private int rank;
	private int parent;
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getParent() {
		return parent;
	}
	public void setParent(int parent) {
		this.parent = parent;
	}
	
	
}
