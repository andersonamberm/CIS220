//Amber Anderson
//Chpt 5 PA

//A program to perform opperations on a stack using as array of integers

import java.util.Scanner;  //import scanner class

public class StackAsArray {
	//declare global variables for the class
	public static int length = 0;
	public static int allocationSize;
	public static int maxLength;
	public static int[] stack;
	public static int top = 0;

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);    //declare a new scanner  
		int item;						//variable to hold the items to push to the stack
		boolean added = false;	//variable to show if item pushed successfully
		
		//get user input for both the allocationSize and maxLength
		System.out.print("Enter the allocation size of the stack: ");
		allocationSize =  scnr.nextInt();
		System.out.print("Enter the maximum length of the stack: ");
		maxLength = scnr.nextInt();
		
		stack = new int[allocationSize];
	
		//push item 1 to the stack and print whether successful
		item = 1;
		added = push(item);
		if (added) {
			System.out.println("Item " + item + " was pushed successfully");
		}
		else {
			System.out.println("Item " + item + " was pushed successfully");
		}
		
		//push item 2 to the stack and print whether successful
		item = 2;
		added = push(item);
		if (added) {
			System.out.println("Item " + item + " was pushed successfully");
		}
		else {
			System.out.println("Item " + item + " was pushed successfully");
		}
		//peek the top item of the stack and print result
		System.out.println("The top item on the stack is: " + peek());
		
		//push item 3 to the stack and print whether successful
		item = 3;
		added = push(item);
		if (added) {
			System.out.println("Item " + item + " was pushed successfully");
		}
		else {
			System.out.println("Item " + item + " was pushed successfully");
		}
		
		//display the length of the stack
		System.out.println("The length of the stack is: " + length);
		//pop an item from the stack and display its value
		System.out.println("The item popped from the stack was: " + pop());
		//call peek and display the top item's value
		System.out.println("The top item on the stack is: " + peek());
		
		//Push item 4 to stack. Display if push was successful or not 
		item = 4;
		added = push(item);
		if (added) {
			System.out.println("Item " + item + " was pushed successfully");
		}
		else {
			System.out.println("Item " + item + " was pushed successfully");
		}
		//Print the stack
		printStack();
		//Push item 5 to stack. Display if push was successful or not 
		item = 5;
		added = push(item);
		if (added) {
			System.out.println("Item " + item + " was pushed successfully");
		}
		else {
			System.out.println("Item " + item + " was pushed successfully");
		}
		//Pop an item from the stack and display the item’s value
		System.out.println("The item popped from the stack was: " + pop());
		
		//Push item 6 to stack. Display if push was successful or not 
		item = 6;
		added = push(item);
		if (added) {
			System.out.println("Item " + item + " was pushed successfully");
		}
		else {
			System.out.println("Item " + item + " was pushed successfully");
		}
		
		//Print the stack
		printStack();
		//Pop an item from the stack and display the item’s value
		System.out.println("The item popped from the stack was: " + pop());
		//Call isEmpty to display if the stack is empty
		System.out.println("The stack is empty: " + isEmpty());
		
		//Pop an item from the stack and display the item’s value
		System.out.println("The item popped from the stack was: " + pop());
		//Pop an item from the stack and display the item’s value
		System.out.println("The item popped from the stack was: " + pop());
		//Pop an item from the stack and display the item’s value
		System.out.println("The item popped from the stack was: " + pop());
		//Call isEmpty to display if the stack is empty
		System.out.println("The stack is empty: " + isEmpty());
	}
	
	//Doubles the stacks allocation size
	public static void stackResize() {
		int i;
		int itemIndex;
		int newSize = allocationSize * 2;
	 
		// Checking to see if bound stack can be resized
		if (maxLength >= 0 && newSize > maxLength) {
			newSize = maxLength;
		}
	 
		// Creates a new array
		int[] newStack = new int[newSize];
   
		// Moves the values from the old stack to the new stack
		for (i = 0; i < length; i++) {
			itemIndex = (top + i) % allocationSize;
			newStack[i] = stack[itemIndex];
		}
		//copy the new stack to the original stack
		stack = newStack.clone();
		allocationSize = newSize;
	}
	
	public static boolean push(int item) {
		//Pushes item to stack and returns if successful (true} or not (false)
		if (length == maxLength) {
			return false;
		}
		if (length == allocationSize) {
			stackResize();
		}
		stack[length] = item;
		length += 1;
		return true;
	}
	
	//Pops an item from the stack and returns its value
	public static int pop() {
		int popped = stack[length - 1];
		length -= 1;
		return popped;
	}
	public static boolean isEmpty() {
		// Check if stack is empty 
		return length == 0 ? true : false;
	}
	
	public static int peek() {
		//return the top item on the stack
		return stack[0];
	}
	
	public static void printStack() { //prints the stack with a line for each item
		System.out.println("The stack contents are the following: ");
		for(int i = length - 1; i >= 0 ; --i) {
			System.out.println(stack[i]);
		}
	}
}