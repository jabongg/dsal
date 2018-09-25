package com.geeksforgeeks.java;

public class TwoIntegersEqualOrNot {


	public static void main (String[] args) throws java.lang.Exception
	{

		int result = printIfTwoNumbersAreEqualWithoutUsingEqualsOperator(45, 45);
		String temp = (result == 0) ? "Same" : "Not Same" ;
		System.out.println(temp);
	
	}
	
	public static int printIfTwoNumbersAreEqualWithoutUsingEqualsOperator(int a, int b) {
	    int result = (a ^ b) == 0 ? 0 : 1;
	    return result;
	}
}
