package com.java.readJava.file;

import java.util.Set;

public class ClientObject {

	private String clientId;

	private Set<RuleObject> apiSets;
	
	private long totalCount;

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public Set<RuleObject> getApiSets() {
		return apiSets;
	}

	public void setApiSets(Set<RuleObject> apiSets) {
		this.apiSets = apiSets;
	}

}
