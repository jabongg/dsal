package com.java.executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);

		// lets create some Runnable tasks

		Runnable task1 = () -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println("executing task1");

		};

		Runnable task2 = () -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println("executing task2");

		};

		Runnable task3 = () -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println("executing task3");
		};

		// submitting the tasks
		executorService.submit(task1);
		executorService.submit(task2);
		executorService.submit(task3);
		
		executorService.schedule(task1, 4, TimeUnit.SECONDS);
		
		// for periodic execution.... we have remove the shutdown() method
		executorService.scheduleAtFixedRate(task2, 0, 3, TimeUnit.SECONDS);
		//executorService.shutdown();

	}

}
