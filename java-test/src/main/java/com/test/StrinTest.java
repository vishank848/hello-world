package com.test;

public class StrinTest {

	public static void main(String[] args) {

		/*// Creating string objects using literals

		String s1 = "abc";

		String s2 = "abc";

		System.out.println(s1 == s2); // Output : true

		// Creating string objects using new operator

		String s3 = new String("abc");

		String s4 = new String("abc");

		System.out.println(s3 == s4); // Output : false */
		
		String s1 = "Test";
		String s2 = "Test";
		String s3 = new String("Test");
		final String s4 = s3.intern();
		System.out.println("1: " + (s1 == s2));
		System.out.println("2: " + (s2 == s3));
		System.out.println("3: " + (s3 == s4));
		System.out.println("4: " + (s1 == s3));
		System.out.println("5: " + (s1 == s4));
		System.out.println("6: " + (s1.equals(s2)));
		System.out.println("7: " + (s2.equals(s3)));
		System.out.println("8: " + (s3.equals(s4)));
		System.out.println("9: " + (s1.equals(s4)));
		System.out.println("10: " + (s1.equals(s3)));
		
		
		String s11=new String("hello");  
		String s12="hello";  
		String s13=s11.intern();//returns string from pool, now it will be same as s2  
		System.out.println(s11==s12);//false because reference is different  
		System.out.println(s12==s13);//true because reference is same
	}

}
