package com.RandomExer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.BlockingQueue;

public class hasha {

	public static void main(String args[])
	{
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		hm.put(1, "Sathya");
		hm.put(2,  "surya");
		hm.put(6,"ali");
		hm.put(9, "zooaha");
		hm.put(3, "booba");
		
		
		Set set = hm.entrySet();
		Iterator i = set.iterator();
		
		while (i.hasNext())
		{
			Map.Entry mentry = (Map.Entry) i.next();
			System.out.println("Key : "+ mentry.getKey());
			System.out.println("Value : "+ mentry.getValue());
		}
		
		
		TreeMap<Integer,String> tp = new TreeMap<Integer,String>(hm);
		Set s2 = tp.entrySet();
		Iterator it = s2.iterator();
		
		while(it.hasNext())
		{
			Map.Entry mentry1 = (Map.Entry) it.next();
			System.out.println("Key : "+ mentry1.getKey());
			System.out.println("Value : "+ mentry1.getValue());
			
		}

				
	}
	
	
	
	
	
}
