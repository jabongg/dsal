package com.datastructures.matrix.java;
/**
 * print matrix diagonally
 * @author jang
 *
 */
public class MatrixDiagonalPrint {

	public static void main(String[] args) {
		int m = 4;
		int n = 4;
		int[][] A = new int[m][n];
		
		int counter = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				A[i][j] = ++counter;
			}
		}
		
		printArray(A, m, n);
		printArrayDiagonally(A, m, n);
	}
	
	public static void printArray(int[][] A, int m, int n) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(A[i][j] + " ");
			}
		}
		
		System.out.println(A.length);
	}
	
	/**
	 * this method prints array diagonally
	 * @param A
	 */
	public static void printArrayDiagonally(int[][] A, int m, int n) {
		
		// to print upper half diagonal matrix
		int previousI = 0; // for the value of i which will vibrate up and down the matrix
		for (int i = 0; i < m; i++) {
			previousI = i;
			for (int j = 0; j < n && previousI >= 0; j++) {
				System.out.print(A[previousI][j] + " ");
				previousI--;
			}
		}
		
		// to print lower half diagonal matrix
		int i = 0; 
		int j = 0;
		int k = 1;
		for ( i = m - 1; i >= 0 && j < n; i--) {
			previousI = i;
			for ( j = k; j < n && previousI >= 0; j++) {
				System.out.print(A[previousI][j] + " ");
				previousI--;
			}
			i = m;  // bring i to last row always
			j = k++; // assign j to next column    
		}
		
	}
}
