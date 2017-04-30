package com.code.interview.bit;

import java.util.ArrayList;

public class SubsetSumProblem {
	  
    
    public static ArrayList<Integer> solve(int A, ArrayList<Integer> B) {
    	int[] dp = new int[A + 1];
    	dp[0] = 1;
    	int currentSum = 0;
    	ArrayList<Integer> ans = new ArrayList<Integer>();
    	for(int i=0;i<B.size();i++) {
    		currentSum += B.get(i);
    		for(int j= Math.min(A, currentSum); j>=B.get(i);j--){
    			dp[j] +=dp[j-B.get(i)];
    		}
    		if(dp[A]==1) {
    			int tmp = B.get(i);
    			int target = A;
    			while(target!=0) {
    				ans.add(tmp);
    				tmp = A-tmp;
    				
    			}
    		}
    	}
    	for(int i=0;i<=A;i++) {
    		System.out.println(dp[i]);
    	}
		return B;
    }
    public static void main(String args[])
    {
    //int[] numbers={1,2,3,4,2,2,2,2,5,2};
    //int numbers[]={1,2,3,6};
    int number=10;
    int numbers[]={3,2,1,3,1,5};

    int sum=0,j=0;
    
    while(j<numbers.length) {
	    sum=0;
	    String strnum="";
	    for(int i=j;i<numbers.length;i++) {
		    sum=sum+numbers[i];
		    if(sum<=number) {
			    strnum+= " "+Integer.toString(numbers[i]);
			    if(sum==number) {
				    System.out.println(strnum);
				    break;
			    }
		    }
		    if(sum>number) {
		    sum=sum-numbers[i];
		    }
	    }
	    j++;
    }
   } 


}
