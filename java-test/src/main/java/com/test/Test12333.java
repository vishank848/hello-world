package com.test;

public class Test12333 {

	public static void main(String[] args) {
		String s = "abc";
		String s1 = "abc";
		System.out.println("12" + s == s1);

		// the line below this gives an output
		// \u000d System.out.println("comment executed");

		loop1: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 3)
					break loop1;
				System.out.println("i = " + i + " j = " + j);
			}
		}
		
		long longWithL = 1000*60*60*24*365L;
		long longWithoutL = 1000*60*60*24*365;
		System.out.println(longWithL);
		System.out.println(longWithoutL);
	}

}
