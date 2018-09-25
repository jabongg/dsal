package com.dsal.sorting;

public class MergeSort {

	public static void main (String[] args) {
		int[] A = {12, 34, 64, 53, 10, 5, 50, 94, 32};
		print(A);
		System.out.println();;
		mergeSort(A);
		print(A);
		
	}
	
	/**
	 *  merge sort logic
	 * @param A
	 */
	public static void mergeSort(int[] A) {
		
		int n = A.length;
		int mid = n / 2;
		
		int nL = mid;
		int nR = n - mid;
		
		int[] L = new int[nL];
		int[] R = new int[nR];
		
		for (int i = 0; i < nL; i++) {
			L[i] = A[i];
		}
		
		for (int i = mid; i < n; i++) {
			R[i - mid] = A[i];
		}

		// very important to declare the base condition... avoids infinite loop
		if (A.length < 2) {
			return;
		}
		
		mergeSort(L);
		mergeSort(R);
		merge(A, L, R);
		
	}
	
	/**
	 *  merge logic for merging two arrays
	 * @param A
	 * @param L
	 * @param R
	 */
	public static void merge(int[] A, int[] L, int[] R) {
		int nL = L.length;
		int nR = R.length;
		int i = 0;
		int j = 0;
		int k = 0;
		
		while (i < nL && j < nR) {
			if (L[i] < R[j]) {
				A[k] = L[i];
				i++;
				k++;
			} else {
				A[k] = R[j];
				j++;
				k++;
			}
		}
		
		// if any of the two arrays exhausts, then simply copy the array elements
		while (j < nR) {
			A[k] = R[j];
			k++;
			j++;
		}
		
		while (i < nL) {
			A[k] = L[i];
			k++;
			i++;
		}

	}
	
	
	/**
	 * print array elements
	 * @param A
	 */
	public static void print(int[] A) {
		for (int i = 0; i < A.length;i++) {
			System.out.print(A[i] + " ");
		}
	}
}
