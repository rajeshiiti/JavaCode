package com.java.design.pattern.principle;

/*
 * ISP stands here for Interface Segregation Principle
 */
public class ISPBadManager {
	ISPBadIWorker worker;
	
	public void setWorker(ISPBadIWorker worker) {
		this.worker = worker;
	}
	
	public void manage() {
		worker.work();
	}

}
