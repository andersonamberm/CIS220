//Amber Anderson
//Chpt2 PA

import java.util.Scanner;  //import scanner class

public class RecursivePower {
	
	public static void main(String[] args) {
		int base;		//variable to hold the base number
		int exponent; //variable to hold the exponent number
		int answer;	//variable to hold the answer
		//get base variable from input
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter base: ");
		base = scnr.nextInt();
		
		//get exponent variable from input
		System.out.print("Enter exponent: ");
		exponent = scnr.nextInt();
		
		answer = power(base, exponent); //call recursive method to calculate answer
		
		System.out.println("Value is: " + answer);  //output result
	}
	
	static int power(int base1, int exponent1) { //recursive method to find the result
		if (exponent1 != 0)  {
			return (base1 * power(base1, exponent1 - 1));
		}
		else {
			return 1;
		}
	}
}