package com.java.thread;

public class WorkThread implements Runnable{
	
	private String command;
	public WorkThread(String command) {
		this.command = command;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName()+" Start. Command = "+command);
        processCommand();
        System.out.println(Thread.currentThread().getName()+" End.");
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	
	public String toString() {
		return this.command;
	}

}
