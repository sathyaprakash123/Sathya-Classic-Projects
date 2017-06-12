package com.RandomExer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashtest {
	
	public static void main(String args[]) throws IOException
	{
		HashMap hm = new HashMap();
		hm.put("Sathya", 35.6);
		hm.put("Surya", 25);
		hm.put("shiva",45);
		hm.put("Riveara",55.6);
		
		Set set = hm.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			
			Map.Entry me = (Map.Entry) it.next();
			System.out.println(me.getKey() + "   " + me.getValue());
			
			
		}
		
		System.out.println("Enter:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x  = br.readLine().toString();
		hm.put(x, 56);
		System.out.println("New value for "+ x + " is " + hm.get(x));
				
		
		Set set1 = hm.entrySet();
		Iterator it1 = set1.iterator();
		while(it1.hasNext())
		{
			
			Map.Entry me = (Map.Entry) it1.next();
			System.out.println(me.getKey() + "   " + me.getValue());
			
			
		}
	
	
		
		
	}
	
	
}
