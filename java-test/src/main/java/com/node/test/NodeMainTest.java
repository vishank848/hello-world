package com.node.test;

public class NodeMainTest {

	public static void main(String[] args) {

		Node root = new Node();
		int index = 1;
		int position = 5;
		Node temp = new Node();

		for (int i = index; i <= 10; i++) {
			Node node = new Node(i);
			temp = node;
			root = temp;
		}

	}

}
