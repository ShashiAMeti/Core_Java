package com.xworkz;

public class MarksValidation {
   
	public static void main(String[] args) {
	   int marks=5;
	   if(marks<=100 && marks>=85)
	   {
		   System.out.println(" Distinction");
	   }
	   else if (marks<=85 && marks>=65)
	   {
		   System.out.println("Pass");
	   }
	   else if (marks<=65 && marks>=35)
	   {
		   System.out.println("2nd Class");
	   }
	   else if (marks<=35 && marks>= 10)
	   {
		   System.out.println("Fail");
	   }
	   else
	   {
		   System.out.println("Need to put more hard work you failed with below 10 marks :(");
	   }
	}
	
}
