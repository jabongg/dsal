package com.dsal.sorting;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] bubbleArray = { 1, 2, 3, 4, 32, 43, 79, 89, 97 };
		bubbleSort(bubbleArray);
	}

	/**
	 * The algorithm works by comparing each item in the list with the item next to
	 * it, and swapping them if required. In other words, the largest element has
	 * bubbled to the top of the array. The algorithm repeats this process until it
	 * makes a pass all the way through the list without swapping any items.
	 * 
	 * @param bubbleArray
	 */
	static void bubbleSort(int[] bubbleArray) {
		int count = 0;
		boolean flag = false;
		for (int i = 0; i < bubbleArray.length - 1; i++) {
			for (int j = i + 1; j < bubbleArray.length; j++) {
				count++;
				if (bubbleArray[i] > bubbleArray[j]) {
					flag = true;
					int temp = bubbleArray[j];
					bubbleArray[j] = bubbleArray[i];
					bubbleArray[i] = temp;
				}
			}
			
			if (flag == false) {
				break;
			}
		}

		System.out.println(count);
		for (int i = 0; i < bubbleArray.length; i++) {
			System.out.print(bubbleArray[i] + " ");
		}
	}
}
