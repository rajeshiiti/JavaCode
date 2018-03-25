package com.code.codechef.practice;

import java.util.Scanner;

public class IsSnake {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int t = inp.nextInt();
		
		while(t>0) {
			inp.nextInt();
			inp.nextLine();
			String str1 = inp.nextLine();
			String str2 = inp.nextLine();
			if(isSnake(str1,str2)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}			
			t--;
		}
		inp.close();
	}

	private static boolean isSnake(String str1, String str2) {
		int cnt=0;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)=='#') {
				cnt++;
			}
			if(str2.charAt(i)=='#') {
				cnt++;
			}
		}
		int len = str1.length()-1;
		int fIndex = len;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)=='#' || str2.charAt(i)=='#') {
				fIndex = i;
				break;
			}
		}
		int tmp1 = 0;
		int row;
		if(str1.charAt(fIndex)=='#') {
			tmp1 =0;
			row =1;
			for(int i=fIndex;i<=len;i++) {
				if(row==1 && str1.charAt(i)=='#') {
					tmp1++;
						if(str2.charAt(i)=='#') {
							row =2;
							tmp1++;
						}
				} else if(row==2 && str2.charAt(i)=='#') {
					tmp1++;
					if(str1.charAt(i)=='#') {
						row =1;
						tmp1++;
					}
					
				} else {
					break;
				}
			}
			if(tmp1==cnt) {
				return true;
			} 
		} 
		if(str1.charAt(fIndex)=='#'){
			row = 2;
			tmp1 =0;
			for(int i=fIndex;i<=len;i++) {
				if(row==1 && str1.charAt(i)=='#') {
					tmp1++;
						if(str2.charAt(i)=='#') {
							row =2;
							tmp1++;
						}
				} else if(row==2 && str2.charAt(i)=='#') {
					tmp1++;
					if(str1.charAt(i)=='#') {
						row =1;
						tmp1++;
					}
					
				} else {
					break;
				}
			}
			if(tmp1==cnt) {
				return true;
			} 
		}
	
		
		int lIndex = 0;
		for(int i=len;i>=0;i--) {
			if(str1.charAt(i)=='#' || str2.charAt(i)=='#') {
				lIndex = i;
				break;
			}
		}
		tmp1 = 0;
		if(str1.charAt(lIndex)=='#') {
			tmp1 =0;
			row = 1;
			for(int i=lIndex;i>=0;i--) {
				if(row==1 && str1.charAt(i)=='#') {
					tmp1++;
						if(str2.charAt(i)=='#') {
							row =2;
							tmp1++;
						}
				} else if(row==2 && str2.charAt(i)=='#') {
					tmp1++;
					if(str1.charAt(i)=='#') {
						row =1;
						tmp1++;
					}
					
				} else {
					break;
				}
			}
			if(tmp1==cnt) {
				return true;
			} 
		} 
		if(str2.charAt(lIndex)=='#'){
			tmp1 =0;
			row = 2;
			for(int i=lIndex;i>=0;i--) {
				if(row==1 && str1.charAt(i)=='#') {
					tmp1++;
						if(str2.charAt(i)=='#') {
							row =2;
							tmp1++;
						}
				} else if(row==2 && str2.charAt(i)=='#') {
					tmp1++;
					if(str1.charAt(i)=='#') {
						row =1;
						tmp1++;
					}
					
				} else {
					break;
				}
			}
			if(tmp1==cnt) {
				return true;
			} 
		}
		return false;
		
	}

}
//####.#####
//######...#