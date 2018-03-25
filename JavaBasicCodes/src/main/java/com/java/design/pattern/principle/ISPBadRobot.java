package com.java.design.pattern.principle;

/*
 * ISP stands here for Interface Segregation Principle
 */
public class ISPBadRobot implements ISPBadIWorker{

	@Override
	public void work() {
		System.out.println("Robot is woking....");
		
	}

	@Override
	public void eat() {
		System.out.println("Robot doesn't eat, So not need to implement this method.");
	}

}
