package com.xworkzList;

import java.util.LinkedList;

public class ListkedList1 {
public static void main(String[] args) {
	
	LinkedList StudentName=new LinkedList();
	StudentName.add("Shashi");
	StudentName.add("Sudha");
	StudentName.add("Sindhu");
	StudentName.add("Kavya");
	StudentName.add("Sushma");
	StudentName.add("Sukanya");
	StudentName.add("Lavanya");
	StudentName.add("Anita");
	StudentName.add("Radha");
	System.out.println(StudentName);
	for (Object ref : StudentName) {
		System.out.println(ref);
	}
	System.out.println("**********");
	//Add the element offerFirst();
	StudentName.offerFirst("Sunanda");
	for (Object ref : StudentName) {
		System.out.println(ref);
	}
	
	System.out.println("**********");
	//Add the element offerLast();
	StudentName.offerLast("Sandya");
	for (Object ref : StudentName) {
		System.out.println(ref);
	}
	System.out.println("**********");
	System.out.println(StudentName);
	for (Object ref : StudentName) {
		System.out.println(ref);
	}
	StudentName.removeFirst();
	System.out.println(StudentName);
	for (Object ref : StudentName) {
		System.out.println(ref);
	}
	System.out.println("**********");
	StudentName.removeLast();
	System.out.println(StudentName);
	for (Object ref : StudentName) {
		System.out.println(ref);
	}
	
	System.out.println("**********");
	
	System.out.println(StudentName);
	for (Object ref : StudentName) {
		System.out.println(ref);
	}
	
	
}
}
