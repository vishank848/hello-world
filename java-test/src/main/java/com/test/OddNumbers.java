package com.test;

import java.util.Arrays;

public class OddNumbers {

	public static void main(String[] args) {

		int left = 1;

		int right = 10;

		int arr[] = new int[1];

		int j = 0;

		for (int i = left; i <= right; i++) {
			if (i % 2 != 0) {
				arr[j] = i;
				j++;
				arr = OddNumbers.growSize(arr);
			}
		}

		System.out.println(Arrays.toString(arr));

	}

	public static int[] growSize(int oldItems[]) {
		int newItems[] = new int[oldItems.length + 1];
		System.arraycopy(oldItems, 0, newItems, 0, oldItems.length);
		return newItems;
	}

}
