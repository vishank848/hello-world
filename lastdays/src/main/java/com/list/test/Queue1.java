package com.list.test;

import java.util.Stack;

public class Queue1 {

	Stack<Integer> stack1;
	Stack<Integer> stack2;

	void push(Stack<Integer> top_ref, int new_data) {
		// Push the data onto the stack
		top_ref.push(new_data);
	}

	/* Function to pop an item from stack */
	int pop(Stack<Integer> top_ref) {
		/* If stack is empty then error */
		if (top_ref.isEmpty()) {
			System.out.println("Stack Underflow");
			System.exit(0);
		}

		// pop the data from the stack
		return top_ref.pop();
	}

	// Function to enqueue an item to the queue
	void enQueue(Queue1 q, int x) {
		push(stack1, x);
	}

	/* Function to deQueue an item from queue */
	int deQueue(Queue1 q) {
		int x;

		/* If both stacks are empty then error */
		if (stack1.isEmpty() && stack2.isEmpty()) {
			System.out.println("Q is empty");
			System.exit(0);
		}

		/*
		 * Move elements from stack1 to stack 2 only if stack2 is empty
		 */
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				x = pop(stack1);
				push(stack2, x);
			}
		}
		x = pop(stack2);
		return x;
	}

	/* Driver function to test above functions */
	public static void main(String args[]) {
		/* Create a queue with items 1 2 3 */
		Queue1 q = new Queue1();
		q.stack1 = new Stack<>();
		q.stack2 = new Stack<>();
		q.enQueue(q, 1);
		q.enQueue(q, 2);
		q.enQueue(q, 3);

		/* Dequeue items */
		System.out.print(q.deQueue(q) + " ");
		System.out.print(q.deQueue(q) + " ");
		System.out.println(q.deQueue(q) + " ");
	}

}
