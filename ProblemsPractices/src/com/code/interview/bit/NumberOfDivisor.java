package com.code.interview.bit;

public class NumberOfDivisor {
	public static void main(String[] args) {
		System.out.println(getNumberOfDivisor(4));
	}

	private static int getNumberOfDivisor(int n) {
			if(n==1) {
				return 1;
			}
		    int sqrt = (int) Math.sqrt(n);
		    int[] primeMap = new int[sqrt+1];
		    int[] array = new int[sqrt+1];
		    for(int i=1;i<=sqrt;i++) {
		    	primeMap[i] = 0;
		    	array[i] = 1;
		    }
		    for(int i=2;i<=sqrt;i++) {
		         if(array[i] == 1 && n%i==0) {
		             while(n%i==0) {
		                 n/=i;
		                 primeMap[i]+=1;
		             }
		             for(int j=i;j<=sqrt;j+=i) {
		                     array[i] = 0; //
		              }
		         }
		    }
		    int ans = 1;
		    if(n>1) {
		        ans = 2;
		    }
		    
		    for(int i=2;i<=sqrt;i++) {
		        ans *= (primeMap[i]+1);
		    }
		    return ans;

		}

}
