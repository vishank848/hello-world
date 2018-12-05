package sorting.test;

import java.util.Arrays;
import java.util.List;

public class BubbleSorting {
	public static void main(String[] args) {
		List<Integer> arrayList = Arrays.asList(22, 6, 53, 3, 67);
		bubbleSorting(arrayList);
		int arr[] = { 22, 6, 53, 3, 67 };
		bubbleSort(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}

	private static void bubbleSorting(List<Integer> arrayList) {

		int len = arrayList.size();

		for (int j = 0; j < len - 1; j++) {

			for (int i = 0; i < len - j - 1; i++) {
				if (arrayList.get(i) > arrayList.get(i + 1)) {
					int temp = arrayList.get(i + 1);
					arrayList.set(i + 1, arrayList.get(i));
					arrayList.set(i, temp);
				}
			}
		}

		arrayList.forEach(System.out::println);

	}

	// An optimized version of Bubble Sort
	private static void bubbleSort(int arr[], int n) {
		int i, j, temp;
		boolean swapped;
		for (i = 0; i < n - 1; i++) {
			swapped = false;
			for (j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap arr[j] and arr[j+1]
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			// IF no two elements were
			// swapped by inner loop, then break
			if (swapped == false)
				break;
		}
	}

}
