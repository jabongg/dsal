package com.java.exceptions;

public class ExceptionsDemo {

	public static void main(String...strings) {
		
		int a = returnTryCatchFinally();
		System.out.println(a);
		
	}

	private static int returnTryCatchFinally() {
		try {
			return 1;
		} catch(Exception e) {
			return 2;
		} /*finally {
			return 3;
		}*/
	}
}
