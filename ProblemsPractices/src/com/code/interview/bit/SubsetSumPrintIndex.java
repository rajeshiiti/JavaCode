package com.code.interview.bit;

import java.util.ArrayList;

public class SubsetSumPrintIndex {
	
	 public static void main(String args[])
	    {
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 list.add(8);
		 list.add(8);
		 list.add(6);
		 list.add(5); 
		 list.add(4);
		 // A : 10
		 // B : [ 8, 8, 6, 5, 4 ]
	    int number=12;
	    ArrayList<Integer> ans = solve(number,list);
	    for(int i=0;i<ans.size();i++) {
	    	System.out.println(ans.get(i));
	    }

	    
	   }
	  public static ArrayList<Integer> solve(int A, ArrayList<Integer> B) {
			 int sum=0,j=0;
			    while(j<B.size()) {
				    sum=0;
				    ArrayList<Integer> ans = new ArrayList<Integer>();
				    String strnum="";
				    for(int i=j;i<B.size();i++) {
					    sum=sum+B.get(i);
					    if(sum<=A) {
					    	ans.add(i);
						    strnum+= " "+Integer.toString(B.get(i));
						    if(sum==A) {
							    System.out.println(strnum);
							    return ans;
						    }
					    }
					    if(sum>A) {
					    sum=sum-B.get(i);
					    }
				    }
				    j++;
			    }
			    return null;
		 }

}
