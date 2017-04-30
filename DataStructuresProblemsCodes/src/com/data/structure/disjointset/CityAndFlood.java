package com.data.structure.disjointset;

import java.util.Scanner;

public class CityAndFlood {
	 public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int m = inp.nextInt();
        Nod[] nodes = new Nod[n+1];
        for( int i=1;i<=n;i++) {
            nodes[i] = new Nod(i,0);
        }
        
        for(int i=1;i<=m;i++) {
            int a=inp.nextInt();
            int b=inp.nextInt();
            mergeSet(a,b,nodes);
        }
        long ans=0;
        for(int i=1;i<=n;i++) {
            if(nodes[i].getParent() ==i ) {
                ans = ans +1;
            }
        }
        System.out.println(ans);
        inp.close();
    }
    public static void mergeSet(int a,int b,Nod[] nodes) {
        int pa = findSet(a,nodes);
        int pb = findSet(b,nodes);
        if(pa!=pb) {
            if(nodes[pa].getRank()>nodes[pb].getRank() ) {
                nodes[pb].setParent(pa);
                nodes[pa].setRank(nodes[pa].getRank()+nodes[pb].getRank()+1);
                nodes[a].setParent(pa);
                nodes[b].setParent(pa);
                
            }  else {
                
                nodes[pa].setParent(pb);
                nodes[pb].setRank(nodes[pa].getRank()+nodes[pb].getRank()+1);
                nodes[a].setParent(pb);
                nodes[b].setParent(pb);
            }
        }
        
    }
    public static int findSet(int a,Nod[] nodes) {
        if(a!=nodes[a].getParent()) {
            nodes[a].setParent(findSet(nodes[a].getParent(),nodes));
        } 
        return nodes[a].getParent();
    }
    
}
class Nod {
	    private int parent;
	    private long rank;
	    public Nod(int parent,long rank) {
	        this.parent=parent;
	        this.rank = rank;
	    }
	    public int getParent() {
	        return this.parent;
	    }
	    public long getRank() {
	        return this.rank;
	    }
	    public void setParent(int parent) {
	        this.parent = parent;
	    }
	    public void setRank(long rank) {
	        this.rank = rank;
	    }
	    
	}