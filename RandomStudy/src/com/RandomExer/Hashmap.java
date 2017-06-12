package com.RandomExer;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hashmap {

	public static void main(String args[])
	{
		Hashtable hasish = new Hashtable();
		hasish.put("Sathya", new Integer(10000));
		hasish.put("Surya",2000);
		hasish.put("Siva",3000);
		hasish.put("Simba",1000);
		
		Enumeration count;
		
		count = hasish.keys();
		while(count.hasMoreElements())
		{
			String str = (String) count.nextElement();
			System.out.println("name " + str +hasish.get(str));
			
		}
		
		
		
	}
	
	
}
