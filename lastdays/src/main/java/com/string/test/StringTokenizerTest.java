package com.string.test;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	
	public static final String EXAMPLE_TEST = "This is my small example "
	            + "string which I'm going to " + "use for pattern matching.";

	public static void main(String args[]) {
		
		System.out.println(EXAMPLE_TEST.matches("\\w.*"));
        String[] splitString = (EXAMPLE_TEST.split("\\s+"));
        System.out.println(splitString.length);// should be 14
        for (String string : splitString) {
            System.out.println(string);
        }
        // replace all whitespace with tabs
        System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));
		
		String[] result = "this is a test".split("\\s+");
	     for (int x=0; x<result.length; x++)
	         System.out.println(result[x]);
		
		
		StringTokenizer st = new StringTokenizer("Hello Geeks How are you");
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken(" "));
		}

		System.out.println("Using Constructor 1 - ");
		StringTokenizer st1 = new StringTokenizer("Hello Geeks How are you", " ");
		while (st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}

		System.out.println("Using Constructor 2 - ");
		StringTokenizer st2 = new StringTokenizer("JAVA : Code : String", " :");
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}

		System.out.println("Using Constructor 3 - ");
		StringTokenizer st3 = new StringTokenizer("JAVA : Code : String", " :", true);
		while (st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
	}

}
