package com.xworkz;

public class Pen {
	int price=40;
	String name="pointpen";
	String color="blue";
	
	public Pen() {
		 System.out.println(price +" " +name+ " "+color);
	}

   public static void main(String[] args) {
	   System.out.println("Start");
	 Pen a= new Pen();
	//a.color();
	 System.out.println("End");
}
}
