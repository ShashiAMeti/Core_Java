package com.xworkz;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		EvenNumber obj=new EvenNumber();
		Scanner scan = new Scanner(System.in);
		System.out.println("Type Number here");
		int number= scan.nextInt();
		if(number>0) {
			System.out.println(number+ " = number is positive number");
		}
		else {
			System.out.println(number+" = number is negetive ");
		}
		System.out.println("**********************");
		
		int num= scan.nextInt();
		if(num%2==0) 
		{
			System.out.println(num+ " = number is positive number");
		}
		else {
			System.out.println(num+" = number is negetive ");
		}
		System.out.println("**********************");
	}

	
}
