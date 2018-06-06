package com.test;

public class StringTest1 {

	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = "ab";
		s2 = s2 + "c";
		if (s1 == s2)
		     System.out.println("String s1 == s2");
	}
}
