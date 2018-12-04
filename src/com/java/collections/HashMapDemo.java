package com.java.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Employee, String> hm = new HashMap<>();
		Employee e1 = new Employee(1, "Jang");
		Employee e2 = new Employee(2, "Ajay");
		
		hm.put(e1, "Ericsson");
		hm.put(e2, "TCS");
		
		//System.out.println(hm);
		System.out.println(hm.get(e1));
		System.out.println(hm.get(e2));
		

	}
	
}
