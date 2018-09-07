package com.dsal.arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequencyArrayElements {

	public static void main(String[] args) {
		int[] A = {1, 2, 3, 4, 1, 3, 2, 4, 8, 5, 6, 7, 4, 3, 3, 9};
		findCount(A);
	}

	private static void findCount(int[] A) {
		Map<Integer, Integer> hm = new HashMap<>();
		for (Integer i : A) {
			Integer frequency = hm.get(i);
			hm.put(i, (frequency == null) ? 1 : frequency + 1);
		}
		
		System.out.println(hm);
	}
}