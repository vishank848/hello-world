package sorting.test;

import java.util.Arrays;
import java.util.List;

public class SelectionSorting {
	public static void main(String[] args) {
		List<Integer> arrayList = Arrays.asList(22, 6, 53, 3, 67);
		selectionSorting(arrayList);
	}

	private static void selectionSorting(List<Integer> arrayList) {

		int len = arrayList.size();

		for (int i = 0; i < len - 1; i++) {

			int min = i;

			for (int j = i + 1; j < len; j++) {
				if (arrayList.get(j) < arrayList.get(min)) {
					min = j;
				}
			}

			int temp = arrayList.get(min);
			arrayList.set(min, arrayList.get(i));
			arrayList.set(i, temp);
		}
		
		arrayList.forEach(System.out::println);

	}
}
