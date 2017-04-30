package com.code.interview.bit;

import java.util.ArrayList;

public class JumpGamerray {
	public int canJump(ArrayList<Integer> a) {
		if(a==null || a.size() ==0) {
			return 1;
		}
		int miniJump = 0;
		miniJump = Math.max(miniJump, a.get(0));
		for(int i=1;i<a.size();i++) {
			if(miniJump ==0) {
				return 0;
			}
			miniJump--;
			miniJump = Math.max(miniJump, a.get(i));
		}
		
		return 1;
	}

}
