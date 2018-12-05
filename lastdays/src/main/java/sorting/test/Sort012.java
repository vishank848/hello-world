package sorting.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort012 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(12, 3, 0, 1, 5, 2, 7, 0, 1, 0, 0, 2);

		list.sort(new IntCom());

		list.forEach(System.out::println);
		
	}

	private static class IntCom implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			if (o1 > o2) {
				return 1;
			} else if (o1 < o2) {
				return -1;
			}
			return 0;
		}

	}

}
