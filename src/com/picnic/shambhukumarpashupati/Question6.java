package com.picnic.shambhukumarpashupati;

import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to check palindrome or not : ");
		String str = sc.nextLine();
		String res = "";
		for (int k = str.length() - 1; k >= 0; k--) {
			char c = str.charAt(k);
			res = res + c;

		}
		if (str.equals(res)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome Number");
		}

	}

}

/*Output : 
	Enter a String to check palindrome or not : 
		aba
		Palindrome
*/