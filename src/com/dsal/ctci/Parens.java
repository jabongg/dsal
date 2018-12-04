/*package com.dsal.ctci;

import java.util.HashSet;
import java.util.Set;

public class Parens {

	final synchronized strictfp public static void main(String[] args) {
		System.out.println("Hello Main");
		
		String initialParen = "()";
		int remaining = 3;
		Set<String> validParensSet = generateParens(remaining, initialParen);
		
		for (String s: validParensSet) {
		
			System.out.println(s);
		}
	}

	private static Set<String> generateParens(int remaining, String initialParen) {

		Set<String> set = new HashSet<>();
		
	//	if (remaining == 0) {
	//		set.add("");
	//	} else {
			Set<String> prev = generateParens(remaining - 1, initialParen);
		
			for (String str : prev) {
				for (int i = 0; i < str.length(); i++) {
					
					if (str.charAt(i) == '(') {
						String s = insertInside(str, i);
						 Add s to set if it's not already in there. 
						 * Note : HashSet automatically checks for duplicates before adding, 
						 * so an explicit check is not required.
						 
						
						set.add(s);
					}
				}
			}
		}
		return set;
		
	}

	private static String insertInside(String str, int leftIndex) {

		String left = str.substring(0, leftIndex + 1);
		String right = str.substring(leftIndex + 1, str.length());
		return left + "()" + right;
	}
}
*/