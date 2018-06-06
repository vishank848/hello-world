package com.test;

public class Question {

	static String f() {
		String a = "hello";
		String b = "bye"; // line 0
		String c = b + "!"; // line 1
		String d = b; // line 2
		b = a; // line 3
		d = a; // line 4
		return c; // line 5
	}

	public static void main(String args[]) {

		long start = System.currentTimeMillis();
		for (int i = 0; i < 999999999; i++) {
			String s = "qwer" + i;
			System.out.println(s);
		}

		System.out.println("Total time : " + (System.currentTimeMillis() - start) + " ms");

		String msg = f();
		System.out.println(msg); // line 6
	}
}
