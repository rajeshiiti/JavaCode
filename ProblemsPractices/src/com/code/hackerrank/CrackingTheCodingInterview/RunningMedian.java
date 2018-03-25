package com.code.hackerrank.CrackingTheCodingInterview;

import java.util.Scanner;

public class RunningMedian {
	static int[] lowerQueue = new int[100001];
	static int[] upperQueue = new int[100001];
	static int uniCount = 0;
	static int uniLowerCount = 0;
	static int uniUpperCount = 0;


	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		while(n>0)
		{
			int num = inp.nextInt();
			if(uniLowerCount == 0) {
				lowerQueue[1]  =  num;
				uniLowerCount++;
			} else if(num <= lowerQueue[1]) {
				if(uniLowerCount>uniUpperCount) {
					uniUpperCount++;
					upperQueue[uniUpperCount] = lowerQueue[1];
					lowerQueue[1] = num;
					rootTravelLowerQueue();
					bottomTravelUpperQueue();
				} else {
					uniLowerCount++;
					lowerQueue[uniLowerCount] = num;
					bottomTravelLowerQueue();
				}
			} else if (uniUpperCount>0 && num<=upperQueue[1]) {
				if(uniLowerCount<uniUpperCount) {
					uniLowerCount++;
					lowerQueue[uniLowerCount] = num;
					bottomTravelLowerQueue();
				} else {
					uniUpperCount++;
					upperQueue[uniUpperCount] = num;
					bottomTravelUpperQueue();
				}
			}else {
				if(uniLowerCount<uniUpperCount) {
					uniLowerCount++;
					lowerQueue[uniLowerCount] = upperQueue[1];
					upperQueue[1] = num;
					rootTravelUpperQueue();
					bottomTravelLowerQueue();
				} else {
					uniUpperCount++;
					upperQueue[uniUpperCount] = num;
					bottomTravelUpperQueue();
				}
				
			}
			if(uniLowerCount>uniUpperCount) {
				System.out.println( (double)lowerQueue[1]);
			} else if(uniUpperCount>uniLowerCount) {
				System.out.println( (double)upperQueue[1]);
			} else {
				System.out.println( (double)(upperQueue[1]+lowerQueue[1])/2 );
			}
			n--;
		}
		inp.close();
	}

	private static void rootTravelUpperQueue() {
		int tmp = 1;
		while(tmp<=uniUpperCount) {
			int value = upperQueue[tmp];
			int l = tmp;
			if(2*tmp<=uniUpperCount && upperQueue[tmp]>upperQueue[2*tmp]) {
				l = 2* tmp;
			}
			if(2*tmp+1<=uniUpperCount && upperQueue[l]>upperQueue[2*tmp+1]) {
				l = 2*tmp+1;
			}
			if(l!=tmp) {
				upperQueue[tmp] = upperQueue[l];
				upperQueue[l] = value;
				tmp = l;
			} else {
				return;
			}
			
		}
		
	}

	private static void bottomTravelLowerQueue() {
		int tmp = uniLowerCount;
		while(tmp>=1) {
			int value = lowerQueue[tmp];
			if(tmp/2>=1 && lowerQueue[tmp]>lowerQueue[tmp/2]) {
				lowerQueue[tmp] = lowerQueue[tmp/2];
				lowerQueue[tmp/2] = value;
				tmp = tmp/2;
			} else {
				return;
			}
			
		}
		
	}

	private static void bottomTravelUpperQueue() {
		int tmp = uniUpperCount;
		while(tmp>=1) {
			int value = upperQueue[tmp];
			if(tmp/2>=1 && upperQueue[tmp]<upperQueue[tmp/2]) {
				upperQueue[tmp] = upperQueue[tmp/2];
				upperQueue[tmp/2] = value;
				tmp = tmp /2 ;
			} else {
				return;
			}
			
		}
		
	}

	private static void rootTravelLowerQueue() {
		int tmp = 1;
		while(tmp<=uniLowerCount) {
			int value = lowerQueue[tmp];
			int l = tmp;
			if(2*tmp<=uniLowerCount && lowerQueue[tmp]<lowerQueue[2*tmp]) {
				l = 2* tmp;
			}
			if(2*tmp+1<=uniLowerCount && lowerQueue[l]<lowerQueue[2*tmp+1]) {
				l = 2*tmp+1;
			}
			if(l!=tmp) {
				lowerQueue[tmp] = lowerQueue[l];
				lowerQueue[l] = value;
				tmp = l;
			} else {
				return;
			}
			
		}
		
	}

}
