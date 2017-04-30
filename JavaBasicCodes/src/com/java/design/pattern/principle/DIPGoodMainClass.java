package com.java.design.pattern.principle;

public class DIPGoodMainClass {

	public static void main(String[] args) {
		IWorker worker = new DIPGoodWorker();
		DIPGoodManager manager = new DIPGoodManager();
		manager.setIWorker(worker);
		manager.manage();
		
		worker = new DIPGoodSuperWorker();
		manager.setIWorker(worker);
		manager.manage();
		
	}

}
