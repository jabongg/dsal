package com.jdk8.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsDemo {

	 // integer stream
	public static void main(String[] args) {
		IntStream 
		.range(0, 10)
		.forEach(p -> System.out.print(p + " "));
		
		
		List<String> al = new ArrayList<>();
		al.add("jb");
		al.add("ajay");
		al.add("anil");
		al.add("kankan");
		al.add("jatin");
		
		al.stream().forEach(p -> System.out.println(p));
		
		//al.stream().forEach(System.out :: print);
		
		long l = al.stream().count();
		System.out.println(l);
		
		//al.stream().filter((p -> p.startsWith("j"))).forEach(p -> System.out.println(p));
		//al.stream().collect();
		
		al.stream().filter(predicate -> predicate.endsWith("n")).forEach(predicate -> System.out.println(predicate));
		
		
		List<Integer> li = new ArrayList<>();
		li.add(13);
		li.add(3);
		li.add(4);
		li.add(12);
		li.add(7);
		li.add(8);
		
		List<Integer> l2 = li.stream().filter(i -> (i % 2 == 0)).collect(Collectors.toList());
		l2.stream().forEach(System.out :: print);
		
		List<Integer> l3 = li.stream().map(i -> i * 2).collect(Collectors.toList());
		l3.stream().forEach(System.out :: println);
		
		l3 = l3.stream().sorted().collect(Collectors.toList());
		l3.stream().forEach(System.out::print);

	}
}
