package com.java.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		// creating two runnable tasks
		Runnable task1 = new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("executing task1");
			}
		};
		
		// using lambda expression, since Runnable is a functional interface.
		
		Runnable task2 = () -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println("executing task2");
		};
		
		// creating MyTask task3
		MyTask task3 = new MyTask();
		
		executorService.submit(task1);
		executorService.submit(task2);
		executorService.submit(task3);
		
		executorService.shutdown();
	}
}
