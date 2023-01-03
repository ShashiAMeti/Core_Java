package com.xworkzAcces;

import javax.swing.text.StringContent;



public class Swipping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String name="Shashi";
      String name2="Sudha";
      String name3="Shweta";
      System.out.println("First name:"+name +" 2nd name: "+ name2 +" 3rd name : "+ name3);
      name=name3;
      name2=name3;
      name3=name;
      System.out.println("After swapping name:"+ name + "  name2:" + name2 + "  name3:"+ name3);
      
      int a= 20;
      int b=30;
      int c=40;
      System.out.println("AGE a:"+a +", AGE b:"+b +", AGE c:"+c);
      a=b+c;
      b=a=c;
      c=a-b;
      System.out.println("After swapping value a:"+ a +", value b: "+b +", value c: "+c);
     
	}
  
}
