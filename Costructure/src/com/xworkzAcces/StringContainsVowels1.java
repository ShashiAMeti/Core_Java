package com.xworkzAcces;


	public class StringContainsVowels1 {

		public static void main(String[] args) {
			System.out.println(stringContainsVowels("Shshkl")); // true
			System.out.println(stringContainsVowels("TV")); // false
		}

		public static boolean stringContainsVowels(String input) {
			return input.toLowerCase().matches(".*[aeiou].*");
		}
    
	}

