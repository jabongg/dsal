package com.dsal.sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int[] insertionArray = { 12, 1, 343, 123, 88, 74, 64, 98, 1, 343 };
		/**
		         * To sort unordered list of elements,
		         * we remove its entries one at a time and then insert each of them into a sorted part (initially empty):
		         */
		/*
		            Here is the algorithm from Cormen book
		            INSERTION-SORT(A)
		            1 for j ← 2 to length[A]
		            2 do key ← A[ j ]
		            3 ✄ Insert A[ j ] into the sorted sequence A[1 . . j − 1].
		            4 i ← j − 1
		            5 while i > 0 and A[i ] > key
		            6 do A[i + 1] ← A[i ]
		            7 i ←i − 1
		            8 A[i + 1] ← key
		         */
		//implementation
		int[] sortedArray = insertionSort(insertionArray);
		printArray(sortedArray);
	}

	/**
	 * implementing insertion sort. I sorts the array.
	 * 
	 * @param insertionArray
	 * @return
	 */
	static int[] insertionSort(int[] insertionArray) {
		for (int j = 1; j < insertionArray.length; j++) {
			int key = insertionArray[j];
			int i = j - 1;
			while (i > (-1) && insertionArray[i] > key) {
				insertionArray[i + 1] = insertionArray[i];
				i--;
			}
			insertionArray[i + 1] = key;
		}
		return insertionArray;
	}

	/**
	 * print array elements
	 * 
	 * @param bubbleArray
	 */
	static void printArray(int[] bubbleArray) {
		for (int i = 0; i < bubbleArray.length; i++) {
			System.out.println(bubbleArray[i]);
		}
	}
}