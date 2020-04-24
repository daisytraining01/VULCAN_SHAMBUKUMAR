package com.picnic.shambhukumarpashupati;

public class Question2 {
	public static void main(String[] args) {
		// Here i have declared and initialized two variable
		int a = 0;
		int b = 1;
		// Print these two variables
		System.out.println("Fabonacci series number are : ");
		System.out.println(a);
		System.out.println(b);
		// Used for loop to iterate how many fibonacci series number as want
		for (int i = 2; i < 10; i++) {
			//Declare third variable to add last two value to evaluate next value
			int sum = a + b;
			System.out.println(sum);
			a = b; // Swapping a value from a to b
			b = sum; // Swapping a value from sum to b
		}

	}

}


/*Output :
	Fabonacci series number are : 
		0
		1
		1
		2
		3
		5
		8
		13
		21
		34*/