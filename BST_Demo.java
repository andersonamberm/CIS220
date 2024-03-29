//Amber Anderson
//Chpt7 PA

import java.util.Scanner;  //import scanner class


public class BST_Demo {
	
	public static void main(String[] args) {
		int key = 0;			//declare key variable
		int[] numbers = {20, 35, 13, 6, 24, 18, 48, 1, 27 }; 	//declare the numbers to be used
		BinarySearchTree tree = new BinarySearchTree();	//declare trhe binary search tree
		for (int number : numbers) {	//input the numbers in to the tree
			tree.insert(new Node(number));
		}
		
		System.out.println("Initial Binary Search Tree: "); //print the binary search tree
		BSTPrint.print2D(tree.getRoot());
		System.out.println();
		
		key = 18; //remove node 18 and state whether successful
		if (tree.remove(key)) { 			
			System.out.println("Leaf node " + key + " was removed.");
		}
		else {
			System.out.println("Node " + key + " was not removed.");
		}
		
		key = 48;		//remove node 18 and state whether successful
		if (tree.remove(key)) { 			
			System.out.println("Leaf node " + key + " was removed.");
		}
		else {
			System.out.println("Node " + key + " was not removed.");
		}
		
		System.out.println("___________________________________");	//print updated binary search tree
		System.out.println("Binary Search Tree after removing nodes 18 and 48");
		BSTPrint.print2D(tree.getRoot());
		
		key = 16;		//insert 16 into the tree
		tree.insert(new Node(key));
		
		key = 45;	//insert 45 into the tree
		tree.insert(new Node(key));
		
		System.out.println("___________________________________");	//print updated binary search tree
		System.out.println("Binary Search Tree after inserting nodes 16 and 45");
		BSTPrint.print2D(tree.getRoot());
		
		key = 6; //remove node 6 and state whether successful
		if (tree.remove(key)) { 			
			System.out.println("Node " + key + " with only left child was removed.");
		}
		else {
			System.out.println("Node " + key + " was not removed.");
		}
		
		key = 24; //remove node 24 and state whether successful
		if (tree.remove(key)) { 			
			System.out.println("Node " + key + " with only right child was removed.");
		}
		else {
			System.out.println("Node " + key + " was not removed.");
		}
		
		System.out.println("___________________________________");	//print updated binary search tree
		System.out.println("Binary Search Tree after removing nodes 6 and 24");
		BSTPrint.print2D(tree.getRoot());
		
		key = 20; //remove node 20 and state whether successful
		if (tree.remove(key)) { 			
			System.out.println("Node " + key + " with a right and left child was removed.");
		}
		else {
			System.out.println("Node " + key + " was not removed.");
		}
		
		key = 38; //remove node 38 and state whether successful
		if (tree.remove(key)) { 			
			System.out.println("Node " + key + " was removed.");
		}
		else {
			System.out.println("Node " + key + " was not removed.");
		}
		
		System.out.println("___________________________________");	//print updated binary search tree
		System.out.println("Binary Search Tree after removing nodes 20 and 38");
		BSTPrint.print2D(tree.getRoot());
	}
}