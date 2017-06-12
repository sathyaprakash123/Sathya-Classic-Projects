package com.RandomExer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class Collections {

	public static void main(String args[])
	{
	 ArrayList<String> name = new ArrayList<String>();
	 name.add("hell there");
	 name.add("age");
	 System.out.println("values " + name);
	 
	 
	 Iterator il = name.iterator();
	 
	 while(il.hasNext())
	 {
		 System.out.println("Array list Value : "+ il.next());
	 }
	 
	 
	 LinkedList<String> ll = new LinkedList<String>();
	 ll.add("sathya");
	 ll.add("shiva");
	 ll.add("ravi");
	 ll.add("venki");
	 System.out.println("Linked List Contents : "+ ll);
	 ll.remove("ravi");	
	 System.out.println("Linked List Contents : "+ ll);
	 
	 Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
	 
	 ht.put(1, "sathya");
	 ht.put(2, "shiva");
	 ht.put(3, "surya");
	 System.out.println("Hash Table : "+ ht);
	 
	 for (Map.Entry m : ht.entrySet())
	 {
		 
		 System.out.println("Hash Table Value : "+ m.getKey() + m.getValue());
		 
	 }
	 
	 
	 HashSet hs = new HashSet();
	 hs.add("sathya");
	 hs.add("Sathya");
	 hs.add("bala");
	 hs.add("sathya");
	 hs.add("zephrin");
	 hs.add("arya");
	 
	 
	 Iterator is = hs.iterator();
	 while (is.hasNext())
	 {
		 System.out.println("Hello there : " +is.next());
	 }
	 
	 
	 
	 
	
	}

	
	
}
