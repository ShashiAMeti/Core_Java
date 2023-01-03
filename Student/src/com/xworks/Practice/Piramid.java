package com.xworks.Practice;

public class Piramid {

public static void main(String[] args) {
		
		int arr[]= {1,2,3,7};
		for (int i = 0; i < arr.length; i++) {
			System.out.println("values "+arr[i]);
		}
		
		System.out.println("size of the array "+arr.length);
		
		
		System.out.print("*");
		for(int i=65;i<87;i++) {
			for(int j=65;j<i;j++) {
				System.out.print((char)j);

			}
			System.out.println();
		}
		 
	}

} 