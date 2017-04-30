package com.java.thread;

import java.util.LinkedList;

public class ProducerConsumerExample {
	public static void main(String[] args) throws InterruptedException {
		final PC pc = new PC();
		
		Thread t1 = new Thread(new Runnable(){
			public void run() {
				try {
					pc.producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable(){
			public void run() {
				try {
					pc.consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
	
	}
	
	
	public static class PC {
		LinkedList<Integer> list = new LinkedList<Integer>();
		int capacity = 10;
		
		public void producer() throws InterruptedException {
			int value = 0;
			while(true) {
				synchronized (this) {
					while(list.size()==capacity) {
						wait();
					}
					
					System.out.println("Producer adding value into list: "+ value);
					list.add(value++);
					
					notify();
					
					Thread.sleep(100);
				}
			}
			
		}
		
		public void consumer() throws InterruptedException {
			while(true) {
				synchronized (this) {
					while(list.size()==0) {
						wait();
					}
					
					int val = list.removeFirst();
					System.out.println("Comsumer consuming value: "+val);
					
					notify();
					
					Thread.sleep(1000);
				}
			}
		}
	}

}
