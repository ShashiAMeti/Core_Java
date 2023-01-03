package com.xworks.Practice;

public class Class2 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,7};
		for (int i = 0; i < arr.length; i++) {
			System.out.println("values "+arr[i]);
		}
		
		System.out.println("size of the array "+arr.length);
		
		System.out.print("*");

		for(int i=20;i<30;i++) {
			for(int j=20;j<i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}

	}

