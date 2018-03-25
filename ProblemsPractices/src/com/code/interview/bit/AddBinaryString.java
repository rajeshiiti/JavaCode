package com.code.interview.bit;

public class AddBinaryString {
	public static void main(String[] args) {
		System.out.println(addBinary("1010110111001101101000", "1000011011000000111100110"));
		//A : "0001010110111001101101000"
		//B : "1000011011000000111100110"
		//C    1001110001111010101001110
	}
	public static String addBinary(String a, String b) {
		int len1=0;
		int len2=0;
		int i = 0;
		while(i<a.length() && a.charAt(i)=='0') {
			i++;
		}
		len1 = a.length()-i;
		if(len1==0) {
			len1=1;
			a="0";
		}
		i=0;
		while(i<b.length() && b.charAt(i)=='0') {
			i++;
		}
		len2 = b.length()-i;
		if(len2==0) {
			len2=1;
			b="0";
		}
		int len = Math.max(len1, len2);
		char[] charA = new char[len];
		char[] charB = new char[len];
		char[] charAns = new char[len+1];
		i=a.length()-1;
		int j = len-1;
		while(i>=a.length()-len1) {
			charA[j] = a.charAt(i);
			j--;
			i--;
		}
		while(j>=0) {
			charA[j--] = '0';
		}
		i=b.length()-1;
		j = len-1;
		while(i>=b.length()-len2) {
			charB[j] = b.charAt(i);
			j--;
			i--;
		}
		while(j>=0) {
			charB[j--] = '0';
		}
		charAns[0] = '0';
		j = len-1;
		char rem = '0';
		while(j>=0) {
			if(rem=='0') {
				if(charA[j]=='1' && charB[j]=='1') {
					charAns[j+1]='0';
					rem = '1';
				} else if(charA[j]=='1' && charB[j]=='0') {
					charAns[j+1]='1';
				} else if(charA[j]=='0' && charB[j]=='1') {
					charAns[j+1]='1';
				}  else {
					charAns[j+1]='0';
				}
			} else {
				if(charA[j]=='1' && charB[j]=='1') {
					charAns[j+1]='1';
					rem = '1';
				} else if(charA[j]=='1' && charB[j]=='0') {
					charAns[j+1]='0';
					rem = '1';
				} else if(charA[j]=='0' && charB[j]=='1') {
					charAns[j+1]='0';
					rem = '1';
				}  else {
					charAns[j+1]='1';
					rem = '0';
				}
				
			}
			j--;
		}
		if(rem=='1') {
			charAns[0] = '1';
			return String.valueOf(charAns, 0, len+1);
		} else {
			return String.valueOf(charAns, 1, len);
		}
		
	}

}
