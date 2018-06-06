package com.sum;

import java.util.ArrayList;
import java.util.List;

public class NumberSum {

	public static void main(String[] args) {

		//0, 1, 153, 370, 371, 407

		int num = 370;

		List<Integer> intList = new ArrayList<>();
		
		for (int i = num; i > 0;) {
			int n = i / 10;
			int s = i % 10;

			int cube = s * s * s;

			intList.add(cube);

			i = n;
		}

		int sum = 0;

		for (Integer intl : intList) {
			sum += intl;
		}

		if (sum == num) {
			System.out.println("equals");
		} else {
			System.out.println("not-equals");
		}

	}

}
