package com.RandomExer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hash {

	public static void main(String args[])
	{
	
	HashMap<Integer,String> hmap = new HashMap<Integer, String>();
	hmap.put(1, "sathya");
	hmap.put(2, "surya");
	hmap.put(3, "steven");
	
	Set set = hmap.entrySet();
	Iterator it = set.iterator();
	
	while (it.hasNext())
	{
		Map.Entry men = (Map.Entry) it.next();
		System.out.println("Key is " + men.getKey() + "  " + "Value = "+ men.getValue());
		
	}
	
	
	}
	
	
	
}
