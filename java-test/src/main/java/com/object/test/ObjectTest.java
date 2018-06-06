package com.object.test;

public class ObjectTest {

	public static void main(String[] args) {

		String s1 = "abcxyz";
		String s2 = "abc";
		String s3 = "xyz";
		String s4 = s2 + s3;
		System.out.println(s4);
		System.out.println(s4==s1);
		System.out.println(s4.equals(s1));
		
		String s5 = "1" + "e" + "a" + "d" + "t";
		String s6 = "1eadt";
		
		System.out.println(s5);
		System.out.println(s5==s6);

	}

}
