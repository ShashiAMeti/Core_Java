package com.xworkz;

public class Runner {

	public static void main(String[] args) {
	
      Class2 obj = new Class2();	
		obj.mainFather();
		obj.Son();
	System.out.println("***********");
	  System.out.println("Name of the Son" + obj.Name);
	  System.out.println(" Father if the Son" +obj.FatherName);
		System.out.println("Son Age"+ obj.age);
		System.out.println("Father Age" + obj.age1);
	}

}
