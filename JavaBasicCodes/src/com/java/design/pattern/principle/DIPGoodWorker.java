package com.java.design.pattern.principle;

public class DIPGoodWorker implements IWorker{

	@Override
	public void word() {
		System.out.println("Worker is doing work...");
	}

}
