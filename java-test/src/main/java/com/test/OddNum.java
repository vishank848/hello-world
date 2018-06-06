package com.test;

import java.util.Arrays;

public class OddNum {

	public static void main(String[] args) {
		int left = 1;

		int right = 12;

		int intArr[] = null;

		if (left > right) {
			System.out.println("error in numbers! left number must be smaller then right number");
			System.exit(0);
		}

		if (right % 2 == 0 && left % 2 == 0) {
			intArr = new int[(right - left) / 2];
		} else {
			intArr = new int[((right - left) / 2) + 1];
		}

		int j = 0;

		for (int i = left; i <= right; i++) {
			if (i % 2 != 0) {
				intArr[j] = i;
				j++;
			}
		}

		System.out.println(Arrays.toString(intArr));

	}
}
