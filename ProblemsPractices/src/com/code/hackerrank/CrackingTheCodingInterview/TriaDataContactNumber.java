package com.code.hackerrank.CrackingTheCodingInterview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TriaDataContactNumber {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		inp.nextLine();
		while(n>0) {
			list.add(inp.nextLine());
			n--;
		}
		CharNode rootNode = new CharNode();
		for(String str:list) {
			String[] stAr = str.split(" ");
			if(stAr[0].equals("add")) {
				addNewWord(stAr[1], rootNode);
			} else if(stAr[0].equals("find")) {
				System.out.println(findTotalOccurence(stAr[1],rootNode));
			}
		}
		
		inp.close();
	}

	private static int findTotalOccurence(String str, CharNode rootNode) {
		CharNode node = rootNode;
		for(int i=0;i<str.length();i++) {
			int idx = (int)str.charAt(i);
			idx = idx - 97;
			if(node.charArray[idx] == null) {
				return 0;
			}
			node =node.charArray[idx];
			
			if(i==str.length()-1) {
				return node.cnt;
			}
		}
		return 0;
	}

	private static void addNewWord(String str, CharNode rootNode) {
		CharNode node = rootNode;
		for(int i=0;i<str.length();i++) {
			int idx = (int)str.charAt(i);
			idx = idx - 97;
			if(node.charArray[idx] == null) {
				CharNode charNode = new CharNode();
				node.charArray[idx] = charNode;
				charNode.cnt++;
			} else {
				node.charArray[idx].cnt++;
			}
			node =node.charArray[idx];
		}
		
	}

}
class CharNode {
	CharNode[] charArray = new CharNode[26];
	int cnt;
	public CharNode() {
		for(int i=0;i<26;i++) {
			charArray[i] = null;
		}
		cnt = 0;
	}
	
	
}

