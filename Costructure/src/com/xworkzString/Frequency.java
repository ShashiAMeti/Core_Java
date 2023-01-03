package com.xworkzString;

public class Frequency {
	
	     public static void main(String[] args) {  
	        String name = "shashik24564647@@ala";  
	        int[] Name = new int[name.length()];  
	        int i, j;  
	        //Converts given string into character array  
	        char string[] = name.toCharArray();  
	        for(i = 0; i <name.length(); i++) {  
	            Name[i] = 1;   
	            for(j = i+1; j <name.length(); j++) {  
	                if(string[i] == string[j]) {  
	                    Name[i]++;         
	     //Set string[j] to 0 to avoid printing visited character  
	                    string[j] = '0';  
	                }  
	            }  
	        }
	        //Displays the each character and their corresponding frequency  
	        System.out.println("Characters and their corresponding frequencies");  
	        for(i = 0; i <Name.length; i++) {  
	            if(string[i] != ' ' && string[i] != '0')  
	                System.out.println(string[i] + "-" + Name[i]);  
	        }  
	    }  
	}  

// String is immutable (not changable )it cant modifies once created in the application
//== equals or comper the addres the date
// dote.equales is compere the or phetch the Value of the the Date.