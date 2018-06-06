package com.test;

public class StaticTest extends ClassA {

	public void fun1() {
		System.out.println("child");
	}

}

class ClassA {

	public void fun1() {
		System.out.println("parent");
	}

}
