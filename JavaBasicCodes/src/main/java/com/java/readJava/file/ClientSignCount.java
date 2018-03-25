package com.java.readJava.file;

public class ClientSignCount {

	private String clientId;
	private long total ;
	private long success ;
	private long failure ;


	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public long getSuccess() {
		return success;
	}
	public void setSuccess(long success) {
		this.success = success;
	}
	public long getFailure() {
		return failure;
	}
	public void setFailure(long failure) {
		this.failure = failure;
	}
	
	
}
