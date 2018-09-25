package com.java.executors;

public class MyTask extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.print("executing task3");
	}
}
