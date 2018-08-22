package com.datastructures.dp.java;

public class LongestIncreasingSubsequence {
	
	public static void main(String[] args) {
		int[] A = {10, 16, 2, 34, 11, 50};
		int[] lis = new int[A.length];
		
		// since each element itself is an increasing subsequence
		// we will initialize all elements of lis by 1;
		
		for (int i = 0; i < lis.length; i++) {
			lis[i] = 1;
		}
		
		int[] returnedArray = lis(A, lis);
		System.out.println(findMaxElement(returnedArray));
		
	}
	/**
	 * this method calculates the longest increasing subsequence
	 * time complexity : O(n2)
	 * @param A
	 * @param lis
	 * @return
	 */
	public static int[] lis(int[] A, int[] lis) {
		
		// iterate over the array A
		for (int i = 1; i < A.length; i++) {
			for (int j = 0; j < i; j++) {
				
				// check conditions if A[i] > A[j]
				if (A[i] > A[j]) {
					
					// check condition if lis[i] is already greater than lis[j]
					// then do not update the value of lis[i]
					if (lis[i] < lis[j] + 1) {
						lis[i] = lis[j] + 1;
					}
				}
			}
		}
		
		return lis;
	}
	
	/**
	 * this method calculates the maximum element from any given array
	 * @param A
	 * @return
	 */
	public static int findMaxElement(int[] A) {
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] > max) {
				max = A[i];
			}
		}
		
		return max;
	}

}
