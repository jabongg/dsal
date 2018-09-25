package com.java.reflection;

public class ReflectionDemo {

	public static void main(String[] args) {
		try {
			
			
		    Class<?> account = Class.forName("com.java.reflection.Account");
		    
		    
		    System.out.println(account.getConstructors());
		    System.out.println(account.getCanonicalName());
		    System.out.println(account.getMethods());
		    System.out.println(account.getDeclaredFields());
		    System.out.println(account.getFields());
		    
		    
		    
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
