package com.java.readJava.file;

import java.util.List;

public class RuleObject {


	private String actualName;
	private List<String> mainRule;
	private List<String> crossRule;
	private long count;

	public String getActualName() {
		return actualName;
	}
	public void setActualName(String actualName) {
		this.actualName = actualName;
	}

	public List<String> getMainRule() {
		return mainRule;
	}
	public void setMainRule(List<String> mainRule) {
		this.mainRule = mainRule;
	}
	public List<String> getCrossRule() {
		return crossRule;
	}
	public void setCrossRule(List<String> crossRule) {
		this.crossRule = crossRule;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	

}
