package com.java.design.pattern.principle;

public class DIPGoodSuperWorker implements IWorker{
	@Override
	public void word() {
		System.out.println("SuperWorker is doing super work...");
	}

}
