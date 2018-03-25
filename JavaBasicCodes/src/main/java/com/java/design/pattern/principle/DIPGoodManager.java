package com.java.design.pattern.principle;

public class DIPGoodManager {
	IWorker worker;
	
	public void setIWorker(IWorker worker) {
		this.worker = worker;
	}
	
	public void manage() {
		worker.word();
	}

}
 