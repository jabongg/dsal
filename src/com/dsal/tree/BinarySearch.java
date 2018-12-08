package com.dsal.tree;

public class BinarySearch {

	public static void main(String[] args) {
		int[] A = { 1, 2, 8, 15, 89, 90, 100, 128 };

		int locationIndex = binarySearchRecursive(A, 128, 0, A.length - 1);
		
		//int locationIndex = binarySearch(A, 0, A.length - 1, 128);

		System.out.println(locationIndex);
	}

	private static int binarySearchIterative(int[] A, int x) {

		if (A == null) {
			return -1;
		}

		if (A.length == 1) {
			return 0;
		}

		int l = 0;
		int h = A.length - 1;
		while (l <= h) {
			int mid = ((h - l) / 2) + l;
			if (A[mid] == x) {
				return mid;
			}
			if (x > A[mid]) {
				l = mid + 1;
			}
			if (x < A[mid]) {
				h = mid - 1;
			}
		}
		return -1;
	}

	public static int binarySearch(int[] array, int value) {
		int start = 0;
		int end = array.length - 1;

		for (int i = 0; i < array.length; i++) {
			int middle = (end - start) / 2;
			if (array[i] == value) {
				return i;
			} else if (array[middle] > value) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}
		}
		return end;
	}

	private static int binarySearchRecursive(int[] A, int x, int l, int h) {
		if (l <= h) {

			int mid = ((h - l) / 2) + l;
			
			if (A[mid] == x) {
				return mid;
			}
			if (x > A[mid]) {
				binarySearchRecursive(A, x, mid + 1, h);
			}
			if (x < A[mid]) {
				binarySearchRecursive(A, x, l, mid - 1);
			}
		}
		return -1;
	}
	
	
	 // Returns index of x if it is present in arr[l.. 
    // r], else return -1 
    static int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r>=l) 
        { 
            int mid = l + (r - l)/2; 
  
            // If the element is present at the  
            // middle itself 
            if (arr[mid] == x) 
               return mid; 
  
            // If element is smaller than mid, then  
            // it can only be present in left subarray 
            if (arr[mid] > x) 
               return binarySearch(arr, l, mid-1, x); 
  
            // Else the element can only be present 
            // in right subarray 
            return binarySearch(arr, mid+1, r, x); 
        } 
  
        // We reach here when element is not present 
        //  in array 
        return -1; 
    } 

}
