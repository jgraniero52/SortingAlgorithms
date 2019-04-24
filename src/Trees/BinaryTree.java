package Trees;

import java.util.Arrays;

public class BinaryTree {
	Node root;
	public BinaryTree () {
		root = null;
	}
	
	public Node insertLevelOrder(int[] array, Node node, int i) {
		if(i < array.length) {
			if(node == null) {
				int rootValue = 0;
				if(array.length % 2 == 0) {
					rootValue = array[array.length/2];
				}
				else {
					rootValue = array[(array.length+1)/2];
				}
				node = new Node(rootValue);
			}
			int firstValue = 0;
			if(i+1 < array.length) {
				firstValue = array[i+1];
			}
			else {
				firstValue = array[i];
			}
			
			node = checkNode(node, firstValue);
			
			insertLevelOrder(array, node, i+1);
		}
		return node;
	}

	public Node checkNode(Node node, int value1) {
		if(value1 < node.key) {
			if(node.left == null) {
				node.left = new Node(value1);
			}
			else {
				checkNode(node.left, value1);
			}
		}
		else {
			if(node.right == null) {
				node.left = new Node(value1);
			}
			else {
				checkNode(node.right, value1);
			}
		}
		return node;
	}
	
	// Function to print tree nodes in InOrder fashion 
    public void printTree(Node root) 
    { 
        if (root != null) { 
        	printTree(root.left); 
            System.out.print(root.key + " "); 
            printTree(root.right); 
        } 
    } 
	
	public Node getRoot() {
		return root;
	}
	
	public void setRoot(Node node) {
		root = node;
	}
}
