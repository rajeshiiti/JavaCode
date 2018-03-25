package com.java.thread;

public class SimpleThreadExample {
	// 1 way to create thread
	class MyThread1 extends Thread {
		public MyThread1(String name) {
		super(name);
		}
		public void run() {
			System.out.println("MyThread1 is running");
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	class MyThread2 implements Runnable {
		public void run(){
			System.out.println("Mythread2 is running....");
			System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
		}
	}
	public static void main(String[] args) {
		// 1 way to create thread
		SimpleThreadExample example = new SimpleThreadExample();
		MyThread1 myThread = example.new MyThread1("Thread-11");
		myThread.start();
		
		// 2nd way to create thread
		Thread thread2 = new Thread(example.new MyThread2());
		thread2.start();
		
		System.out.println(Thread.currentThread().getThreadGroup().activeCount());
		
		Thread thread3 = new Thread() {
			public void run() {
				System.out.println("Running thread using anonymous class");
				Thread.currentThread().setPriority(MIN_PRIORITY);
				System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
			}
		};
		thread3.start();
		
		Thread thread4 = new Thread(new Runnable() {
			
			public void run() {
			System.out.println("Running thread using Runnable interface");
			System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
			}
		});
		thread4.start();
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
		
	}
}
