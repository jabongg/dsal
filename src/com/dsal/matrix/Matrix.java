package com.dsal.matrix;

public class Matrix {

	public static void main(String[] args) {
		int[][] A = { 
						{ 10, 20, 30, 40 }, 
						{ 15, 25, 35, 45 }, 
						{ 27, 29, 37, 48 }, 
						{ 32, 33, 39, 50 } 
					};
		
		findElementInSortedMatrixBottomLeft(A, 45);
		findElementInSortedMatrixTopRight(A, 45);
	}

	private static void findElementInSortedMatrixTopRight(int[][] A, int elementToBeSearched) {
		
		int n = A.length;
		int i = 0;
		int j = n - 1;
		// we are going to start from right top corner
		
		while(i < n && j >=  0) {
			if (A[i][j] == elementToBeSearched) {
				System.out.println("A[" + i + "," + j + "]");
				return;
			} 
			
			if (elementToBeSearched > A[i][j]) {
				i++;
			} else {
				j--;
			}

		}
		
		System.out.println("Element not present in the Matrix");
		
	}
	/**
	 * finding an element from a sorted matrix
	 * @param A
	 * @param elementToBeSearched
	 */
	private static void findElementInSortedMatrixBottomLeft(int[][] A, int elementToBeSearched) {
			
			int n = A.length;
			int i = n - 1;
			int j = 0;
			// we are going to start from right top corner
			
			while(i >= 0 && j < n) {
				if (A[i][j] == elementToBeSearched) {
					System.out.println("A[" + i + "," + j + "]");
					return;
				} 
				
				if (elementToBeSearched > A[i][j]) {
					j++;
				} else {
					i--;
				}
	
			}
			
			System.out.println("Element not present in the Matrix");
			
		}
}
