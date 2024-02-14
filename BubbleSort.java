//Amber Anderson
//Chpt2 PA

//A program to sort a given array using buble sort. 

import java.io.*;  

public class BubbleSort {
	
	static void printArray(int array[], int n) { //function to print the array
		int i;
		for (i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int array[] = {93, 52, 72, 42, 3, 63, 100, 19, 61, 44, 21, 98, 6, 41, 78, 5, 51, 60, 67, 11}; //preset array to test the program
		int n = array.length;					//variable to hold the length of the array
		int temp;									//variable to hold the temporary value while switching places in the array

		for (int i = 0; i < (n - 1); i++)  { //sort array using bubble sort
			for (int j = 0; j < (n -  i - 1); j++) {
				if (array[j ] > array[j+1]) {
					temp = array[j ] ;
					array[j ]  = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		System.out.print("The sorted array is: ");
		printArray(array, n); //call funtion to print the array

	}
}