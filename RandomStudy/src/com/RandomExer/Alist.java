package com.RandomExer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class Alist {
	
	public static void main(String args[])
	{
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Sathya");
		al.add("Shiva");
		al.add("Chris");
		al.add(0, "Ram");
		al.add(1, "Bob");
		al.add(0, "Ram");
		al.add(1, "Bob");
		al.add(1, null);
		al.add("obama");
		
		System.out.println("Array list Values"+ al);
		System.out.println("Size of list is " + al.size());
		
		ArrayList<String> al2 = new ArrayList<String>(al.subList(0,5));
		System.out.println(al2);
		
		Vector<String> v = new Vector<String>(5);
		
		v.add("sathya");
		v.add("shiva");
		v.add("hello");
		System.out.println(v);
		
		HashMap<Integer,String> hs = new HashMap<Integer,String>();
		hs.put(1, "Sathya");
		hs.put(2, "Bill");
		hs.put(3, "Jeeva");
		
		
		Set set = hs.entrySet();
		Iterator iterator = set.iterator();
		
		while (iterator.hasNext())
		{
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.println(mentry.getValue());
		}
		
		HashMap<String, Integer> hs1 = new HashMap<String, Integer>();
		
		hs1.put("sathya", 1);
		hs1.put("gates", 5);
		hs1.put("gobba", 3);
		
		Set set1 = hs1.entrySet();
		Iterator is = set1.iterator();
		
		while (is.hasNext())
		{
			Map.Entry mentry = (Map.Entry) is.next();
			System.out.println(mentry.getKey());
		}
		
		ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<String,String>();
		chm.put("1", "Sathya");
		chm.put("2", "Shiva");
		chm.put("3","ram");
		
		System.out.println("Concurrent HashMap Example"+ chm);
		
		Set set3 = chm.entrySet();
		Iterator it3 = set3.iterator();
		 while (it3.hasNext())
		 {
			 Map.Entry mentry = (Map.Entry) it3.next();
			 System.out.println(mentry.getKey());
			 
		 }
		
	}
	
	

}
