package geeksforgeek;

//Java program to construct a binary tree from preorder traversal
public class BinaryTree1 {
	Node1 root;
	Index myindex = new Index();

	/*
	 * A recursive function to create a Binary Tree from given pre[] preLN[] arrays.
	 * The function returns root of tree. index_ptr is used to update index values
	 * in recursive calls. index must be initially passed as 0
	 */
	Node1 constructTreeUtil(int pre[], char preLN[], Index index_ptr, int n, Node1 temp) {
		// store the current value of index in pre[]
		int index = index_ptr.index;

		// Base Case: All nodes are constructed
		if (index == n)
			return null;

		// Allocate memory for this node and increment index for
		// subsequent recursive calls
		temp = new Node1(pre[index]);
		(index_ptr.index)++;

		// If this is an internal node, construct left and right subtrees
		// and link the subtrees
		if (preLN[index] == 'N') {
			temp.left = constructTreeUtil(pre, preLN, index_ptr, n, temp.left);
			temp.right = constructTreeUtil(pre, preLN, index_ptr, n, temp.right);
		}

		return temp;
	}

	// A wrapper over constructTreeUtil()
	Node1 constructTree(int pre[], char preLN[], int n, Node1 node) {
		// Initialize index as 0. Value of index is used in recursion to
		// maintain the current index in pre[] and preLN[] arrays.
		int index = 0;

		return constructTreeUtil(pre, preLN, myindex, n, node);
	}

	/* This function is used only for testing */
	void printInorder(Node1 node) {
		if (node == null)
			return;

		/* first recur on left child */
		printInorder(node.left);

		/* then print the data of node */
		System.out.print(node.data + " ");

		/* now recur on right child */
		printInorder(node.right);
	}

	// driver function to test the above functions
	public static void main(String args[]) {
		BinaryTree1 tree = new BinaryTree1();
		int pre[] = new int[] { 10, 30, 20, 5, 15 };
		char preLN[] = new char[] { 'N', 'N', 'L', 'L', 'L' };
		int n = pre.length;

		// construct the above tree
		Node1 mynode = tree.constructTree(pre, preLN, n, tree.root);

		// Test the constructed tree
		System.out.println("Following is Inorder Traversal of the" + "Constructed Binary Tree: ");
		tree.printInorder(mynode);
	}
}

// A Binary Tree node
class Node1 {
	int data;
	Node1 left, right;

	Node1(int item) {
		data = item;
		left = right = null;
	}
}

class Index {
	int index = 0;
}
