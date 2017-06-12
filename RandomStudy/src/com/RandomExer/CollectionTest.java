package com.RandomExer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionTest {
	
	private LinkedList<String> llist = new LinkedList<String>();
	private ArrayList<String> alist = new ArrayList<String>();
	private HashSet<String> ht = new HashSet<String>();
	private HashSet htt = new HashSet();
	private HashMap hm = new HashMap();
	private TreeMap tm = new TreeMap();
	private TreeSet ts = new TreeSet(); 
	private HashSet<demo> hashdemo = new HashSet<demo>();
	demo d;
	
	
	
	public static void main(String args[])
	{
	
		CollectionTest ct = new CollectionTest();
		ct.llist.add("sathya");
		ct.llist.add("sathya");
		ct.llist.add("shiva");
		ct.llist.add("arya");
		ct.llist.add("superman");
		ct.llist.add("test");
		
		System.out.println("Contents of Linked List : " + ct.llist);
		
		ct.htt.add("sathya");
		ct.htt.add("sathya");
		ct.htt.add("shiva");
		ct.htt.add("surya");
		ct.htt.add("arya");
		ct.htt.add("sample");
		ct.htt.add("sathya");
		
		System.out.println("Contents of Hashset : " + ct.htt);
		
		ct.hm.put(1234,"sathya");
		ct.hm.put(3456, "shiva");
		ct.hm.put(4565, "senthil");
		ct.hm.put(8764, "rupert");
		ct.hm.put(9745, "hillary");
		ct.hm.put(1231, "trump");
		ct.hm.replace(1231, "trump");
		
		System.out.println("Contents of Hash Map : " + ct.hm);
		System.out.println("Value for key 1234 is : " + ct.hm.get(1234));
		
		ct.tm.put("barbara",3434);
		ct.tm.put("zephrin",3435);
		ct.tm.put("alwin",8976);
		ct.tm.put("carrie",3433);
		ct.tm.put("thodre",3432);
		ct.tm.put("calwin",3474);
		
		System.out.println("Contents of Tree Map : " + ct.tm);
		
		ct.ts.add("zephrin");
		ct.ts.add("alpha");
		ct.ts.add("xerox");
		ct.ts.add("baby");
		ct.ts.add("yellow");
		ct.ts.add("cerlin");
		ct.ts.add("narrow");
		ct.ts.add("narrow");
		
		System.out.println("Contents of Tree Set : " + ct.ts);
		
		demo d1 = new demo();
		demo d2 = new demo();
		demo d3 = new demo();
		d1.getset("sathya", 35);
		d2.getset("arya", 56);
		d3.getset("wala", 89);
		ct.hashdemo.add(d1);
		ct.hashdemo.add(d2);
		ct.hashdemo.add(d3);
		System.out.println("Contents of Hash Demo is as follows : ");
		Iterator is = ct.hashdemo.iterator();
		
		while (is.hasNext())
		{
			ct.d = (demo) is.next();
			System.out.println("Name from object : " + ct.d.getName() + ct.d.age());
			
			
		}
		
		
		
	}
	
	

}
