package com.code.codeforces.con392;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuesE {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		Node[] nodes = new Node[n+1];
		List<Edge> edgeList= null;
		for(int i=1;i<=n;i++) {
			nodes[i] = null;
		}
		getInput(inp, n, nodes,edgeList);
		inp.close();
		//traverseAllNodes(nodes);
		getRootNodesTotalWeight(nodes,nodes[1]);
		for(int i=1;i<=n;i++) 
			System.out.println(nodes[i].getSelf() +" "+nodes[i].getParent()+" "+nodes[i].getTotalWeight()+" "+nodes[i].getTotalStrength());
		
		//balanceTree();
		/*for(Edge edge:edgeList) {
			
		}*/
		
	}

	/*private static void balanceEgde(Node[] nodes, List<Edge> edgeList, long exceedWeight, Edge edge) {
		Node node = nodes[edge.getChild()];
		if(!node.getList().isEmpty()) {
			for(EdgeNode edgeNode : node.getList()) {
				balanceEgde(nodes, edgeList, exceedWeight, edgeNode.getNode());
			}
		}
		
	}*/

	private static void getRootNodesTotalWeight(Node[] nodes, Node node) {
		if(!node.getList().isEmpty()) {
			for(EdgeNode edgeNode:node.getList()) {
				getRootNodesTotalWeight(nodes, edgeNode.getNode());
				node.setTotalStrength(node.getTotalStrength()+edgeNode.getStrength()+edgeNode.getNode().getTotalStrength());
				node.setTotalWeight(node.getTotalWeight()+edgeNode.getWeight()+edgeNode.getNode().getTotalWeight());
			}
		}
	}


	public static void getInput(Scanner inp, int n, Node[] nodes, List<Edge> edgeList) {
		edgeList = new ArrayList<Edge>();
		for(int i=1;i<n;i++) {
			int pIdx = inp.nextInt();
			int cIdx = inp.nextInt();
			long weight = inp.nextLong();
			long strength = inp.nextLong();
			Edge edge = new Edge(pIdx,cIdx,weight,strength);
			edgeList.add(edge);
			if(nodes[pIdx]!=null) {
				Node node = nodes[pIdx];
				EdgeNode edgeNode = new EdgeNode();
				edgeNode.setWeight(weight);
				edgeNode.setStrength(strength);
				if(nodes[cIdx] == null) {
					nodes[cIdx]=new Node(pIdx,cIdx);
					node.setTotalStrength(0);
					node.setTotalWeight(0);
					edgeNode.setNode(nodes[cIdx]);
				}
				edgeNode.getNode().setParent(pIdx);
				edgeNode.getNode().setSelf(cIdx);
				node.addIntoList(edgeNode);
				
			} else {
				Node node = new Node(pIdx,pIdx);
				EdgeNode edgeNode = new EdgeNode();
				edgeNode.setWeight(weight);
				edgeNode.setStrength(strength);
				if(nodes[cIdx] == null) {
					nodes[cIdx]=new Node(pIdx,cIdx);
					edgeNode.setNode(nodes[cIdx]);
				}
				edgeNode.getNode().setParent(pIdx);
				edgeNode.getNode().setSelf(cIdx);
				node.addIntoList(edgeNode);
				node.setTotalStrength(0);
				node.setTotalWeight(0);
				nodes[pIdx] = node;
			}
		}
	}

	/*private static void traverseAllNodes(Node[] nodes) {
		for(int i=1;i<nodes.length;i++) {
			if(nodes[i]!=null && !nodes[i].getList().isEmpty()) {
				for(EdgeNode edgeNode:nodes[i].getList()) {
					System.out.println(i+ " "+edgeNode.getNode().getSelf()+" " + edgeNode.getWeight()+" "+edgeNode.getStrength());	
				}
			} else {
				System.out.println(i);
			}
		}
	}*/
}
class Node {
	private int parent;
	private int self;
	private long totalWeight;
	private long totalStrength;
	List<EdgeNode> list;
	
	public long getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(long totalWeight) {
		this.totalWeight = totalWeight;
	}

	public long getTotalStrength() {
		return totalStrength;
	}

	public void setTotalStrength(long totalStrength) {
		this.totalStrength = totalStrength;
	}



	public Node(int parent, int self) {
		this.parent = parent;
		this.self = self;
		this.list = new ArrayList<EdgeNode>();
	}
	
	public void addIntoList(EdgeNode edgeNode) {
		list.add(edgeNode);
	}
	public List<EdgeNode> getList() {
		return this.list;
	}

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public int getSelf() {
		return self;
	}

	public void setSelf(int self) {
		this.self = self;
	}
	
	
}
class EdgeNode {
	
	private Node node;
	private long weight;
	private long strength;

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

	public long getWeight() {
		return weight;
	}

	public void setWeight(long weight) {
		this.weight = weight;
	}

	public long getStrength() {
		return strength;
	}

	public void setStrength(long strength) {
		this.strength = strength;
	}
}
class Edge {
	private int parent;
	private int child;
	private long weight;
	private long strength;

	public Edge(int pIdx, int cIdx, long weight2, long strength2) {
		this.parent = pIdx;
		this.child = cIdx;
		this.weight = weight2;
		this.strength = strength2;
	}
	public int getParent() {
		return parent;
	}
	public void setParent(int parent) {
		this.parent = parent;
	}
	public int getChild() {
		return child;
	}
	public void setChild(int child) {
		this.child = child;
	}
	public long getWeight() {
		return weight;
	}
	public void setWeight(long weight) {
		this.weight = weight;
	}
	public long getStrength() {
		return strength;
	}
	public void setStrength(long strength) {
		this.strength = strength;
	}
	
}
