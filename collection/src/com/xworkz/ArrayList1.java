
package com.xworkz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayList1 {

      public static void main(String[] args) {
				
				ArrayList StudentName = new ArrayList();
				//ADD Method is use to add the object in to collection.
				StudentName.add("Suguna");
				StudentName.add("Sudha");
				StudentName.add("Shweta");
				StudentName.add("Sangeeta");
				StudentName.add(420);
				StudentName.add("Shree");
				StudentName.add(null);
				StudentName.add("  ");
				StudentName.add("Bindu");
				StudentName.add("Isha");
				StudentName.add("Shiva");
				System.out.println(StudentName);
			   
		       for(Object obj:StudentName){
		    
				System.out.println(obj);
				}
				
				System.out.println("*************");
				
				//Size() Method is used to retuyrn the length of the collection.
				System.out.println(StudentName.size());
				System.out.println("*************");
				
				//get() method is used to get the index position of he data in collection.
				System.out.println(StudentName.get(0));
				System.out.println(StudentName.get(2));
				System.out.println(StudentName.get(4));
				System.out.println(StudentName.get(1));
				System.out.println(StudentName.get(3));
				System.out.println(StudentName.get(4));
				System.out.println(StudentName.get(5));
				System.out.println(StudentName.get(8));
				
				System.out.println("*************");
				// Contain() Method,
				System.out.println(StudentName.contains("  "));
				System.out.println(StudentName.contains(null));
				System.out.println(StudentName.contains("Bindu"));
				System.out.println(StudentName.contains("Shiva"));
				System.out.println(StudentName.contains("Shashi"));
				System.out.println("*************");
				
				//	Remove() Method,
				
				System.out.println(StudentName);
				StudentName.remove(0);
				System.out.println(StudentName);
				
				StudentName.add("<?*/+-(:)-+/*?>");
				System.out.println(StudentName);
				System.out.println("*************");
				
				//isEmpty() Method.
				StudentName.isEmpty();
				System.out.println(StudentName.isEmpty());
				System.out.println("*************");
				
				//Clear() Method.
				StudentName.clear();
				System.out.println(StudentName);
				System.out.println("------------------");
				
				//isEmpty() Method.
				System.out.println(StudentName.isEmpty());
				
				ArrayList <String> StudentName1 = new ArrayList();
				//ADD Method is use to add the object in to collection.
				StudentName1.add("Suguna");
				StudentName1.add("Sudha");
				StudentName1.add("Shweta");
				StudentName1.add("Sangeeta");
				StudentName1.add(" ");
				StudentName1.add("Shree");
				StudentName1.add(null);
				StudentName1.add("  ");
				StudentName1.add("Bindu");
				StudentName1.add("Isha");
				StudentName1.add("Shiva");
				StudentName1.add("*******");
				System.out.println("*************");
				System.out.println(StudentName1);
				for(String obj:StudentName1)
			    {
				System.out.println(obj);
				}
				System.out.println("*************");
				
				//get() method
				System.out.println(StudentName1.get(0));
				System.out.println(StudentName1.get(1));
				System.out.println(StudentName1.get(2));
				
				System.out.println("*************");
				System.out.println(StudentName1.indexOf("Sudha"));
				System.out.println(StudentName1.indexOf(" "));
				System.out.println("*************");
				
				// trims the size to the number of elements
				StudentName1.trimToSize();
			  
			        System.out.println("Student List");
			        for (String Student : StudentName1) {
			            System.out.println( Student);
			            
			      Iterator itr=StudentName1.iterator();  
			            //(itr.hasNext())
			            {  
			            System.out.println(itr.next());
			        }
			    }
				
      }			
						
}	
      

