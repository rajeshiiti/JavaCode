package com.data.structure.disjointset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TeacherDilemma {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] e = new int[n+1];
        for(int i=1;i<=n;i++)
        	e[i] = inp.nextInt();
        int m = inp.nextInt();
        Nodes[] nodes = new Nodes[n+1];
        for( int i=1;i<=n;i++) {
            nodes[i] = new Nodes(i,0);
        }
        
        for(int i=1;i<=m;i++) {
            int a=inp.nextInt();
            int b=inp.nextInt();
            mergeSet(a,b,nodes);
        }
        long mod = 1000000007L;
        long ans=1;
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=1;i<=n;i++) {
        	int p = findSet(i, nodes);
        	if(map.containsKey(p)) {
        		List<Integer> list = map.get(p);
        		list.add(i);
        		map.put(p, list);
        	} else {
        		List<Integer> list = new ArrayList<Integer>();
        		list.add(i);
        		map.put(p, list);
        	}
        }
        for(List<Integer> list:map.values()) {
        	int min =10001;
        	for(Integer inte:list) {
        		min = Math.min(min, e[inte]);
        	}
        	long cnt =0L;
        	for(Integer inte:list) {
        		if(e[inte]==min) {
        			cnt++;
        		}
        	}
        	ans = ans*cnt;
        	ans = ans%mod;
        }
        
        System.out.println(ans);
        inp.close();
    }
    public static void mergeSet(int a,int b,Nodes[] nodes) {
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
    public static int findSet(int a,Nodes[] nodes) {
        if(a!=nodes[a].getParent()) {
            nodes[a].setParent(findSet(nodes[a].getParent(),nodes));
        } 
        return nodes[a].getParent();
    }
    
}
class Nodes {
    private int parent;
    private long rank;
    public Nodes(int parent,long rank) {
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