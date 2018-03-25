package com.code.interview.bit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubString {
	public ArrayList<Integer> findSubstring(String s, final List<String> b) {
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
	    if (s == null || b == null || b.size() == 0) 
	    	return ans;
	    int len = b.get(0).length();
	    
	    Map<String, Integer> map = new HashMap<String, Integer>(); 
	    for (String w : b) {
	    	map.put(w, map.containsKey(w) ? map.get(w)+1:1);
	    }
	    
	    for(int i=0;i<=s.length()-len*b.size();i++) {
	    	Map<String,Integer> copy = new HashMap<String,Integer>(map);
	    	for(int j=0;j<b.size();j++) {
	    		String str = s.substring(i+j*len, i+j*len+len);
	    		if(copy.containsKey(str)) {
	    			if(copy.get(str)==1) {
	    				copy.remove(str);
	    			} else {
	    				copy.put(str, copy.get(str)-1);
	    			}
	    			if(copy.isEmpty()) {
	    				ans.add(i);
	    				break;
	    			}
	    		} else {
	    			break;
	    		}
	    	}
	    	
	    }
	    return ans;
	}

	
}
