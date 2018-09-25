package com.java.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {

	public static void main(String[] args) {
		// using multiple thread pools and multiple tasks.
		// The beauty and power of executor framework can be seen in this example.
		// threads reused from pool
		
		ExecutorService executorService1 = Executors.newFixedThreadPool(2);
		ExecutorService executorService2 = Executors.newFixedThreadPool(2);

		// lets create some Runnable tasks
		
		Runnable task1 = () -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println("executing task1");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("task1 executed");

		};

		
		
		Runnable task2 = () -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println("executing task2");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("task2 executed");

		};

		
		
		Runnable task3 = () -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println("executing task3");
			
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("task3 executed");
		};
		
		// submitting the tasks
		executorService1.submit(task1);
		executorService1.submit(task2);
		executorService1.submit(task3);
		
		executorService2.submit(task1);
		executorService2.submit(task2);
		executorService2.submit(task3);
		
		// shutdown the executor service.
		executorService1.shutdown();
		executorService2.shutdown();


	}

}
