package com.java.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeSetDemo {

	public static void main(String[] args) {

		Map<String, String> ts = new TreeMap<>();
		//ts.put("jang", "jb");
		ts.put(null, "ab");
		ts.put("abay", "ab");
		ts.put(null, "kn");

		//ts.add(null);
		
		System.out.println(ts);
	}

}
