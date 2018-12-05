package com.list.test;

//A simple Java program to introduce a linked list 
public class LinkedList {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public void push(int new_data) {

		Node new_node = new Node(new_data);
		new_node.next = head;

		head = new_node;

	}

	public void insertAfter(Node prev_node, int new_data) {

		if (prev_node == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}

		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;

	}

	public void append(int new_data) {
		Node new_node = new Node(new_data);

		if (head == null) {
			head = new_node;
			return;
		}

		// new_node.next = null;

		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = new_node;
		return;
	}

	public void deleteNode(int key) {

		Node temp = head, prev = null;

		if (temp != null && temp.data == key) {
			head = temp.next;
			return;
		}

		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}

		if (temp == null) {
			return;
		}

		prev.next = temp.next;
	}

	public void printList() {

		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		LinkedList llist = new LinkedList();

		llist.head = new Node(1);

		Node second = new Node(2);
		Node third = new Node(4);
		Node fourth = new Node(5);

		llist.head.next = second;
		second.next = third;
		third.next = fourth;

		llist.printList();

		llist.push(0);

		llist.printList();

		llist.insertAfter(second, 3);

		llist.printList();

		llist.append(6);

		llist.printList();

		llist.deleteNode(5);

		llist.printList();
	}

}
