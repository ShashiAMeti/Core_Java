package com.xworkz;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner number=new Scanner(System.in);
		System.out.println("Type Number HERE");
	  	 int a=number.nextInt();
	  	  if(a<=10) {
	  		  System.out.println("Number is Less then 10");
	  		  if(a==5) {
	  			  System.out.println("Number is equal to 5");
	  		  }
	  		  if (a!=5) {
	  			  System.out.println("Number is not equal to 5");
	  		  }
	  	  }
	  	  else {
	  		  System.out.println("Number more then 10");
	  	  }
	}

}
