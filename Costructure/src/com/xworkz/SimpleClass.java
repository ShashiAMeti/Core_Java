package com.xworkz;

import java.util.Scanner;

public class SimpleClass {
public static void main(String[] args) {
		
		System.out.println("Type the Name");
		SimpleClass obj=new SimpleClass();
		//obj.gender(male1, Female1);
		Scanner scan=new Scanner(System.in) ;
		System.out.println("******");
		String male1 = scan.nextLine();
		System.out.println("enter female name");
		String Female1 = scan.nextLine();
	}
	public void gender(String male1, String Female1) 
	{
		//System.out.println("");
	//String male1;dhfhgfh
	if(male1.equals("java")) {
		   System.out.println("java is good boy");
	   }
       else {
	     System.out.println("This boy is not good");
       }

	   //String Female1; 
	   if(Female1.equals("Sangeetha")) {
		   System.out.println("Shashi is good girl");
	       }
       else{
	       System.out.println("She is not bad");
       }
	   
	   //a.gendre("java", "Shashi");
//	    String mail="java";
//	    String Femail="Shashi";
	}   	 
	}
