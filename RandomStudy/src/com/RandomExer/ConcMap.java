package com.RandomExer;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcMap extends Thread{
	
	private EmployeeClass ee;
	
	public ConcMap(EmployeeClass e)
	{
		ee = e;
	}

	public void run()
	{
		
		ee.displayEmp();
		ee.setEmpolyee("agile", 67, 100000);
		ee.displayEmp();
		
		
	}
	
	
	public static void main(String args[])
	{
		
		EmployeeClass e = new EmployeeClass("Surya",35,60000);
		ConcMap c = new ConcMap(e);
		c.run();
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Hi");
		al.add("Hello");
		al.add("How are you");
		al.add("Wish you all well");
		System.out.println(al);
		Iterator i = al.iterator();
		
		while (i.hasNext())
		{
			System.out.println(i.next());
		}
				
	}

		
	}
	
	
	

