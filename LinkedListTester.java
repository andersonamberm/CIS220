//Amber Anderson
//Chpt4 PA

import java.util.Scanner;  //import scanner class


public class LinkedListTester {
	
	public static void main(String[] args) {
		LinkedList myList = new LinkedList(); //create a new empty linked list
		Node node1 = new Node(1);	//create the node 1 and assign it with value 1
		//add node to list, then create and add node 2 to list
		myList.listAppend(node1);
		Node node2 = new Node(2);
		myList.listAppend(node2);
		
		Node node3 = new Node(3);	//create node3 and add to end of list
		myList.listPrepend(node3);
		
		Node node4= new Node(4);	//create node4 and add after head of list
		myList.listInsertAfter(myList.getHead(), node4);
		
		Node node5 = new Node(5);	//create node5 and add after tailof list
		myList.listInsertAfter(myList.getTail(), node5);
		
		Node node6 = new Node(6);	//create node6 and add after node4
		myList.listInsertAfter(node4, node6);
		
		Node node7 = new Node(7);	//create node7 and after node2
		myList.listInsertAfter(node2, node7);
		
		myList.listTraverse();  //print the current linked list
		
		myList.listRemoveNodeAfter(null); 	//remove head node
		myList.listRemoveNodeAfter(node7); 	//remove node after node7
		myList.listTraverse();  //print the current linked list
		
		printSearch(myList, 5);	//Search for node 5 and display if it was found or not
		
		printSearch(myList, 2);	//Search for node 2 and display if it was found or not
		//get and print the sum of the list
		System.out.print("The sum of the Linked List data values is ");
		System.out.println(myList.sumDataValues(myList.getHead()));
	}
	//method to find and print whether a number is found
	static void printSearch(LinkedList myList, int searchKey) {
		Node result;	//variable to hold the result
		result = myList.listSearch(searchKey);
		
		if (result == null)  {
			System.out.println("Node with data " + searchKey + " was not found.");
		}
		else {
			System.out.println("Node with data " + searchKey + " was found.");
		}
		return;
	}

}