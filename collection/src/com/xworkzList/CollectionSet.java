package com.xworkzList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HasSet********");
         HashSet list=new HashSet();
         list.add("Green");
         list.add("Color");
         list.add("Yellow");
         list.add("Red");
         list.add("Green");
         list.add("Pink");
         list.add("Gray");
         System.out.println(list);
         for(Object ref:list) {
        	 System.out.println(ref); 
         }
         System.out.println("LinkedHashSet********");
         LinkedHashSet list1=new LinkedHashSet();
         list1.add("Green");
         list1.add("Color");
         list1.add("Yellow");
         list1.add("Red");
         list1.add("Green");
         list1.add("Pink");
         list1.add("Gray");
         System.out.println(list1);
         for(Object ref1:list1) {
        	 System.out.println(ref1); 
         }
         System.out.println("TerrSet***********"); 
         TreeSet list2=new TreeSet();
         list2.add("Zibra");
         list2.add("Green");
         list2.add("Color");
         list2.add("Yellow");
         list2.add("Red");
         list2.add("Green");
         list2.add("Pink");
         list2.add("Gray");
         System.out.println(list2);
         for(Object ref2:list2) {
        	 System.out.println(ref2); 
         }
         
         list2.remove("Color");
         
         Iterator itr=list2.iterator();
         {  
        	System.out.println(itr.next());
        	list2.remove("Pink");
         }
        
	}

}
