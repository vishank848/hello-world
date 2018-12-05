package com.string.test;

public class Permutation {

	public static void main(String[] args) {
		String str = "ABC";
		int len = str.length();
		permute(str, 0, len - 1);

	}

	private static void permute(String str, int start, int end) {

		if (start == end) {
			System.out.println(str);
		} else {
			for (int i = start; i <= end; i++) {
				str = swap(str, start, i);
				permute(str, start + 1, end);
				str = swap(str, start, i);
			}
		}

	}

	private static String swap(String a, int i, int j) {

		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}
