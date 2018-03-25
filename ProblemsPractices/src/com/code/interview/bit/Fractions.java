package com.code.interview.bit;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Fractions {
	public static void main(String[] args) {
		//A : -1
		//B : -2147483648
		System.out.println(fractionToDecimal(-1, -2147483648));
	}
	
	public static String fractionToDecimal(int nume, int deno) {
		StringBuilder ans = new StringBuilder();
		long numerator = nume;
		long denomitor = deno;
		if(numerator==0 || numerator==-0) {
			return "0";
		}
		int sign = 1 ;
		if(nume<0) {
			sign *=(-1);
			numerator *=-1;
		}
		if(deno<0) {
			sign*=(-1);
			denomitor *=-1;
		}
		if(sign==-1) {
			ans.append("-");
		}
		ans.append(Long.toString(numerator/denomitor));
		if(numerator%denomitor==0) {
			return ans.toString();
		}
		
		long remainder = numerator % denomitor;
		Map<Long,Integer> map = new  HashMap<Long, Integer>();
		ans.append(".");
		StringBuilder sb = new StringBuilder();
		while(remainder!=0) {
			remainder *= 10;
			long tmp = remainder/denomitor;
			if(tmp>0 && map.containsKey(tmp)) {
				sb = new StringBuilder();
				sb.append(')');
				for(Entry<Long, Integer> entry:map.entrySet()) {
					sb.append(entry.getKey());
					if(entry.getKey()==tmp) {
						sb.append('(');
					}
					
				}
				sb.reverse();
				return ans.append(sb.toString()).toString();
			}
			sb.append(Long.toString(remainder/denomitor));
			map.put(remainder/denomitor, 1);
			remainder = remainder%denomitor;
			if(remainder==0 || sb.length()==32) {
				ans.append(sb.toString());
				return ans.toString();
			}
		}
		return ans.toString();
		
	}

	

}
