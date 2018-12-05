package com.string.test;

public class StringReverse {

	public static void main(String[] args) {

		String str = "vishank";

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			rev += str.charAt(i);

		}

		System.out.println(rev);
		
		
		String input = "GeeksforGeeks"; 
		  
        // getBytes() method to convert string  
        // into bytes[]. 
        byte [] strAsByteArray = input.getBytes(); 
  
        byte [] result =  
                   new byte [strAsByteArray.length]; 
  
        // Store result in reverse order into the 
        // result byte[] 
        for (int i = 0; i<strAsByteArray.length; i++) 
            result[i] =  
             strAsByteArray[strAsByteArray.length-i-1]; 
  
        System.out.println(new String(result));

	}

}
