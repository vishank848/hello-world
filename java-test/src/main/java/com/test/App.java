package com.test;

public class App {

	public static void main(String[] args) {

		try {
			// Throw an object of user defined exception
			throw new MyException("GeeksGeeks");
		} catch (MyException ex) {
			System.out.println("Caught");

			// Print the message from MyException object
			System.out.println(ex.getMessage());
		}

	}

}
