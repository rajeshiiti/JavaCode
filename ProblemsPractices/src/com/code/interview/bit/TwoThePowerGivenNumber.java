package com.code.interview.bit;

public class TwoThePowerGivenNumber {
	public static void main(String[] args) {
		System.out.println(power("2"));
	}
	public static int power(String a) {
		if( a.equals("0") ) {
			return 0;
		} else if(a.equals("1")) {
			return 1;
		}
		int i =0;
		int len = a.length();
		while(i<len && ((int)a.charAt(i)-48)==0) {
			i++;
		}
		if(i==a.length()) {
			return 0;
		}
		len = len -i;
		int[] array = new int[len+1];
		for(int j=i;j<len;j++) {
			array[j] = ((int)a.charAt(j)-48);
		}
		int k =0;
		
		while(k<len) {
			if(array[len-1]==1 || array[len-1]==3 || array[len-1]==5 || array[len-1]==7 || array[len-1]==9 || array[len-1]==0) {
				return 0;
			} 
			if(k==len-1) {
				if(array[k]==2 || array[k]==4 || array[k]==6 ||array[k]==8) {
					return 1;
				} else {
					return 0;
				}
			}
			int rem = 0;
			int j = 0;
			while(j<len) {
				int tmp = (array[j] + rem*10)/2;
				rem = (array[j] + rem*10)%2;
				array[j] = tmp;
				j++;
			}
			if(array[k]==0) {
				k++;
			}
			j=k;
		}
		return 0;
	}

}
