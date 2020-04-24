package com.picnic.shambhukumarpashupati;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		
		List<Integer> list=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of value want to add : ");
		int num = sc.nextInt();
		System.out.println("Enter the value to add in the list : ");
		for (int i = 0; i < num; i++) {
			int val = sc.nextInt();
			list.add(val);
		}
		System.out.println("Fist In First Out : "+list.get(0));
		
		System.out.println("Last In Last Out : "+list.get(list.size()-1));
		
	}
}

/*Output : 
	Enter the number of value want to add : 
		5
		Enter the value to add in the list : 
		10
		20
		30
		40
		50
		Fist In First Out : 10
		Last In Last Out : 50
*/