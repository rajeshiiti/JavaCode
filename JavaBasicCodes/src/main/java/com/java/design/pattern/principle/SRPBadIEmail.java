package com.java.design.pattern.principle;

/*
 * SRP tends here for Single Responsibility Principle
 */
public interface SRPBadIEmail {
	public void setSender(String sender);
	public void setReceiver(String receiver);
	public void setContent(String content);
}
