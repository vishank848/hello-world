package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTest {
	
	public static void main(String[] args) {
		
		
		
		List<String> listofString = new ArrayList<>();
		
		listofString.add("qwq0");
		listofString.add("qwq1");
		listofString.add("qwq2");
		listofString.add("qwq3");
		listofString.add("qwq4");
		listofString.add("qwq5");
		listofString.add("qwq6");
		listofString.add(null);
		listofString.add("qwq8");
		
		listofString.forEach(System.out::println);
		
		System.out.println("---------------------------------------------------------------");
		
		listofString.removeAll(Collections.singleton("qwq3"));
		listofString.removeAll(Collections.singleton(null));
		
		listofString.forEach(System.out::println);
		
		System.out.println("---------------------------------------------------------------");
		
		long start = System.currentTimeMillis();
		
		Set<Integer> setOfInteger = new TreeSet<>();
		
		setOfInteger.add(12);
		setOfInteger.add(21);
		setOfInteger.add(1);
		setOfInteger.add(2);
		setOfInteger.add(43);
		setOfInteger.add(53);
		setOfInteger.add(41);
		setOfInteger.add(7);
		setOfInteger.add(99);
		setOfInteger.add(11);
		
		setOfInteger.forEach(System.out::println);
		
		System.out.println("time taken : " + (System.currentTimeMillis() - start) + " ms");
	}

}
