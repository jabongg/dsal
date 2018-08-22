package com.datastructures.dp.java;

import java.util.Scanner;

public class LongestCommonSubSequence {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String P = scan.next(); // AGGTAB
		String Q = scan.next(); // GXTXAYB
		
		int n = P.length();
		int m = Q.length();
		
		

		char[] p = P.toCharArray();
		char[] q = Q.toCharArray();
		
		int result = 0;
		// for recursive solution
		// int length = findLongestCommonSubSequenceLength(p, q, n, m, result);
		

		// for tabulation method of dynamic programming
		int length = findLongestCommonSubSequenceLengthTabulation(p, q, n, m, result);

		System.out.println(length);
	}

	/**
	 * recursive solution
	 * @param p initial string converted to char array
	 * @param q second string converted to char array
	 * @param n length of the first array
	 * @param m length of the second array
	 * @return the length of the maximum  common subsequence from  array 
	 */
	private static int findLongestCommonSubSequenceLength(char[] p, char[] q, int n, int m, int result) {

		if ((n == 0) || (m == 0)) {
			result = 0; // base condition to stop recursion
		} else if (p[n - 1] == q[m - 1]) {
			result = 1 + findLongestCommonSubSequenceLength(p, q, n - 1, m - 1, result);
		} else if (p[n - 1] != q[m - 1]) {
			int temp1 = findLongestCommonSubSequenceLength(p, q, n - 1, m, result);
			int temp2 = findLongestCommonSubSequenceLength(p, q, n, m - 1, result);
			result = findMaxValue(temp1, temp2);
			
		}
		return result;
	}
	
	
	/**
	 * this method calculates the maximum element from any given array
	 * @param A
	 * @return
	 */
	public static int findMaxValue(int a, int b) {
		return (a > b) ? a : b;
	}
	
	/**
	 * 
	 * tabulation technique of dynamic programming solution
	 * @param p initial string converted to char array
	 * @param q second string converted to char array
	 * @param n length of the first array
	 * @param m length of the second array
	 * @return the length of the maximum  common subsequence from  array 
	 */
	private static int findLongestCommonSubSequenceLengthTabulation(char[] p, char[] q, int m, int n, int result) {
		// let's take a table to store the immediate results with size 1 greater than the given strings lengths
		int[][] L = new int[m + 1][n + 1];
		
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
			
				// for initial condition
				if (i == 0 || j == 0) {
					L[i][j] = 0;
				}
				
				// if end characters match 
				else if (p[i - 1] == q[j - 1]) {
					L[i][j] = L[i - 1][j - 1] + 1;
				}
				
				else {
					// if not, then find the maximum value of up and left side
					L[i][j] = findMaxValue(L[i - 1][j], L[i][j - 1]);
				}
			}
			
		}
		
		return L[m][n]; // return the last entry as solution
	}

	
}
