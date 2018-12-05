package com.stream.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples {

	private static long counter;

	private static void wasCalled() {
		System.out.println("called .... " + counter);
		counter++;
	}

	public static void main(String[] args) {
		// fun();
		// fun2();
		// fun3();
		// fun4();
		// fun5();
		// fun6();
		// fun7();
		fun8();
	}

	private static void fun8() {
		List<Product> productList = Arrays.asList(new Product(23, "potatoes"), new Product(14, "orange"),
				new Product(13, "lemon"), new Product(23, "bread"), new Product(13, "sugar"));

		List<String> collectorCollection = productList.stream().map(Product::getName).collect(Collectors.toList());

		collectorCollection.forEach(System.out::println);

		String listToString = productList.stream().map(Product::getName).collect(Collectors.joining(", ", "[", "]"));
		System.out.println("listToString : " + listToString);

		double averagePrice = productList.stream().collect(Collectors.averagingInt(Product::getPrice));
		System.out.println("averagePrice : " + averagePrice);

		int summingPrice = productList.stream().collect(Collectors.summingInt(Product::getPrice));
		System.out.println("summingPrice : " + summingPrice);
	}

	private static void fun7() {
		int reducedParallel = Arrays.asList(1, 2, 3).parallelStream().reduce(10, (a, b) -> a + b, (a, b) -> {
			System.out.println("combiner was called");
			return a + b;
		});
		System.out.println(reducedParallel);
	}

	private static void fun6() {
		int reducedParams = Stream.of(1, 2, 3).reduce(10, (a, b) -> a + b, (a, b) -> {
			System.out.println("combiner was called");
			return a + b;
		});
		System.out.println(reducedParams);
	}

	private static void fun5() {
		int reducedTwoParams = IntStream.range(1, 4).reduce(10, (a, b) -> a + b);
		System.out.println(reducedTwoParams);
	}

	private static void fun4() {
		// OptionalInt reduced =
		IntStream range = IntStream.range(1, 4);// .reduce((a, b) -> a + b);
		// System.out.println(reduced.getAsInt());
		System.out.println(range.findFirst());
	}

	private static void fun3() {
		List<String> list = Arrays.asList("abc1", "abc2", "abc3");
		long size = list.stream().map(element -> {
			wasCalled();
			return element.substring(0, 3);
		}).skip(2).count();
	}

	private static void fun2() {
		List<String> list = Arrays.asList("abc1", "abc2", "abc3");
		counter = 0;
		Stream<String> stream = list.stream().filter(element -> {
			wasCalled();
			return element.contains("2");
		});
		stream.forEach(System.out::println);
	}

	public Stream<String> streamOf(List<String> list) {
		return list == null || list.isEmpty() ? Stream.empty() : list.stream();
	}

	private static void fun() {
		List<String> list = Arrays.asList("abc1", "abc2", "abc3");
		Optional<String> stream = list.stream().filter(element -> {
			System.out.println("filter() was called");
			return element.contains("2");
		}).map(element -> {
			System.out.println("map() was called");
			return element.toUpperCase();
		}).findFirst();
	}
}
