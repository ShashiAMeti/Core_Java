package com.xworkzs;

public class Runner {

	public static void main(String[] args) {
		
	  Civil obj=new Civil();
	  //String a=obj.name;
    System.out.println(obj.name);
    System.out.println(obj.Name1);
    System.out.println(obj.NumberOfBrance);
    System.out.println(obj.numberOfStudents);
    System.out.println("*/*********");
    
    obj.engineer();
    obj.civilstudents(); 
    
    System.out.println("*************************************");
    System.out.println("Mech  Class");
    
    Mech obj2=new Mech();
   System.out.println(obj2.branchName);
    System.out.println(obj2.Name1);
    System.out.println(obj2.NumberOfBrance);
    System.out.println(obj2.NOS);
    System.out.println("***********");
    obj2.students();
    obj2.engineer();
    
    System.out.println("*************************************");
    System.out.println("CS");
    CS obj3=new CS();
   System.out.println(obj3.nameOfBranch2);
   System.out.println(obj3.students);
   System.out.println(obj3.Name1);
   System.out.println(obj3.nameOfBranch2);
   System.out.println("**/*/*/***");
   obj3.engineer();
   obj3.csStudents();
	}

}
