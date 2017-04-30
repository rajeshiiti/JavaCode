package com.code.interview.bit;

import java.util.ArrayList;
import java.util.List;

public class ReverseInteger {
	public static void main(String[] args) {
		System.out.println(reverse(-1146467285));
	}
	
	public static int reverse(int a) {
		if(a<0) {
			a = -a;
			int tmp = getNumber(a);
			int getAgain = getNumber(tmp);
			if(getAgain != a)
				return 0;
			return -tmp;
		} else {
			int tmp = getNumber(a);
			int getAgain = getNumber(tmp);
			if(getAgain != a)
				return 0;
			return tmp;
			
		}
	}

	public static int getNumber(int a) {
		List<Integer> list = new ArrayList<Integer>();
		while(a>0) {
			int rem = a%10;
			a = a / 10;
			list.add(rem);
		}
		int tmp = 0 ;
		int i = 0;
		while(i<list.size()) {
			tmp  = tmp*10 + list.get(i);
			i++;
		}
		return tmp;
	}

}
