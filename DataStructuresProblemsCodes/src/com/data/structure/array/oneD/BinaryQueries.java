package com.data.structure.array.oneD;

import java.util.Scanner;

public class BinaryQueries {
	
	 public static void main(String args[] ) throws Exception {
	        Scanner inp = new Scanner(System.in);
	        int n = inp.nextInt();
	        int q = inp.nextInt();
	        int[] array = new int[n+1];
	        for(int i=1;i<=n;i++) {
	            array[i] = inp.nextInt();
	        }
	        String str ="";
	        while(q>0) {
	            int tmp = inp.nextInt();
	            if(tmp==1) {
	                int swapIdx = inp.nextInt();
	                if(array[swapIdx]==1) {
	                    array[swapIdx]=0;
	                } else {
	                    array[swapIdx]=1;
	                }
	            } else {
	                int l = inp.nextInt();
	                int r = inp.nextInt();
	                if(array[r]==1) {
	                    str =str+"ODD\n";
	                } else {
	                	str =str+"EVEN\n";
	                }
	                
	            }
	            q--;
	        }
	        System.out.println(str);
	        inp.close();
	       
	    }
	}