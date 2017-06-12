package com.RandomExer;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class collec  {
	
	
	public static void main(String args[])
	{
		HashSet hs = new HashSet();
		hs.add("sathya");
		hs.add("riva");
		hs.add("sathya");
		hs.add("ferreira");
		
		System.out.println("Hash Set : "+ hs);
		
		HashMap hm = new HashMap();
		hm.put("sathya", 5);
		hm.put("shiva", 1);
		hm.put("surya", 2);
		hm.put("reiner", 4);
		hm.put("sathya", 4);
		hm.put("sathya1", 2);
		hm.put("hello", "" );
		hm.put("hello1", "" );
		
		System.out.println("Hash Map : "+ hm);
		
		LinkedList ll = new LinkedList();
		ll.add("sathya");
		ll.add("shiva");
		ll.add("diva");
		ll.add("sathya");
		ll.add("ramesh");
		
		Collections.sort(ll);
		
		System.out.println("Linked List : " + ll);
		
		TreeMap tp = new TreeMap();
		tp.put("sathya", 1);
		tp.put("arya", 4);
		tp.put("bala", 4);
		tp.put("gina", 8);
		System.out.println("Tree Map : "+ tp);
		
		
		System.out.println("Value for the given Key is : "+ tp.get("gina"));
			
		
		
			
		
		
		
	}

	

}
