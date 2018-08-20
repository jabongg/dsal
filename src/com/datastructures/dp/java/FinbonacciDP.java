package com.datastructures.dp.java;

public class FinbonacciDP {

	public static void main(String[] args) {
		
		int[] lookup = new int[100];

		// initialize the array with -1 (or better any number that can 
		// never appear into series.
		for (int i = 0; i < 100; i++) {
			lookup[i] = -1;
		}
		
		for (int i = 0; i < 40; i++) {
			//System.out.println(i + " = " + fibonacciMemoization(i, lookup));
			System.out.println(i + " = " + fibonacciTabulation(i, lookup));

		}
	}


	/**
	 * this method calculates fibonacci numbers 
	 * using memoization technique of dynamic programming
	 * @param n
	 * @param lookup
	 * @return
	 */
	private static int fibonacciMemoization(int n, int[] lookup) {

		if (lookup[n] == -1) {
			
			/*
			 *  then two conditions arise
			 *  1. if n satisfies base condition
			 *  2. if n is any no other then base condition numbers
			 */
			if (n <= 1) {
				return n;
			} else {
				return fibonacciMemoization(n - 1, lookup) + fibonacciMemoization(n - 2, lookup);
			}
		
		}
		return -1;
	}
	
	/**
	 * this method calculates the fibonacci numbers
	 * using tabulation technique of dynamic programming
	 * @param n
	 * @param lookupfibonacciMemoization
	 * @returnfibonacciMemoization
	 */
	private static int fibonacciTabulation(int n, int[] lookup) {
		// filling the entries for base conditions
		lookup[0] = 0;
		lookup[1] = 1;
		
		for (int i = 2; i < lookup.length; i++) {
			lookup[i] = lookup[i - 1] + lookup[i - 2];
		}
			
		return lookup[n];
	}
}
