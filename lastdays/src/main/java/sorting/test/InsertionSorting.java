package sorting.test;

import java.util.Arrays;
import java.util.List;

public class InsertionSorting {

	public static void main(String[] args) {
		List<Integer> arrayList = Arrays.asList(22, 6, 53, 3, 67, 32, 62, 90, 1, 56, 23, 61);
		insertionSorting(arrayList);
		int arr[] = { 22, 6, 53, 3, 67, 32, 62, 90, 1, 56, 23, 61 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void insertionSorting(List<Integer> arrayList) {

		int len = arrayList.size();

		for (int i = 1; i < len; i++) {
			int key = arrayList.get(i);
			int j = i - 1;

			while (j >= 0 && arrayList.get(j) > key) {
				arrayList.set(j + 1, arrayList.get(j));
				j--;
			}
			arrayList.set(j + 1, key);
		}

		arrayList.forEach(System.out::println);
		
	}

	private static void sort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

}
