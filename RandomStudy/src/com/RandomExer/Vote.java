package com.RandomExer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Vote {
	
public static void main(String args[])
{
	HashMap<Integer, String> hs = new HashMap<Integer, String>();
	hs.put(45, "sathya");
	hs.put(56, "surya");
	hs.put(78, "shiva");
	System.out.println("Hasmap contents : "+ hs);
	
	if (hs.containsKey(46))
	{
		System.out.println("Key Present");
	}
	
	else
		
	{
		System.out.println("key Not present");
	}
	
	}

}
