package com.picnic.shambhukumarpashupati;

public class Question5 {
	/* 1.Write a program that will remove a given characters from the string 
	(String = “REST ASSURED” , remove characters “ST”  )
*/
	public static void main(String[] args) {
		String str = "REST ASSURED";
		
		String replace = str.replaceAll("ST", "");
		
		System.out.println(replace);
		
		//Write a program to compare two strings using JAVA Program 
		String s1="Hello Java";
		String s2="Hello Java";
		String s3="Hello World";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		
	}
	

}

/*1.
 * Oputput: 
 * RE ASSURED
 * 
 * 0
 *-13
 */
