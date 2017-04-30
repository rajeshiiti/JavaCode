package com.code.interview.bit;

import java.util.ArrayList;

public class TextJustiFicationUsingGreedy {
	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList<String>();
		 list.add("what");
		 list.add("must");
		 list.add("be");
		 list.add("shall");
		 list.add("be.");
		 ArrayList<String> ans = fullJustify(list, 12);
		 for(String str:ans) {
			 System.out.println(str);
		 }
	}
	public static ArrayList<String> fullJustify(ArrayList<String> a, int b) {
		  ArrayList<String> list = new ArrayList<String>();
			int tmp = a.size();
			int i =0;
			while(i<tmp) {
				int len = 0;
				int word = 0;
				int j = i;
				while(j<tmp) {
					if(len+a.get(j).length()>b) {
						len--;
						break;
					} else {
						len+=a.get(j).length();
						len+=1;
						word+=1;
					}
					j++;
				}
				int space = b-(len-word+1);
				int perWord =1;
				int rem = 0;
				if(j==tmp) {
					perWord = 1;
				}else {
					if(word>1) {
						perWord= space/(word-1);
						rem = space%(word-1);
						if(word==2) {
							rem = 0;
						}
					} else {
						perWord =space;
					}
				}
				
				StringBuilder sb = new StringBuilder();
				for(int k=i;k<j;k++) {
					sb.append(a.get(k));
					int tmp1=perWord;
					while(tmp1>0) {
						sb.append(" ");
						tmp1--;
					}
					if(rem>0) {
						sb.append(" ");
						rem--;
					}
				}
				while(sb.length()>b) {
					sb.deleteCharAt(sb.length()-1);
				}
				while(sb.length()<b) {
					sb.append(" ");
				}
				list.add(sb.toString());
				i=j;
			}
			return list;
	    
	}

}
