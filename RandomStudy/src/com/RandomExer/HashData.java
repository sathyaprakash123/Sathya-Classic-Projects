package com.RandomExer;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashData extends Thread{
	
	private HashMap<Integer,String> map = new HashMap<Integer,String>();
	
	
	public HashData()
	{
		
		map.put(1, "Sathya");
		map.put(2, "Surya");
		map.put(3, "shiva");
		map.put(4, "hello");
		map.put(5, "time");
		
	}
	
	public void writeData(String s) throws InterruptedException
	{
		
		System.out.println("Thread Writing:" + Thread.currentThread());	
		map.put(map.size()+1, s);
		Thread.sleep(1000);
		
		
	}
	
		
	
	public void  displayData()
	{
		
				System.out.println("Hash Map Items : "+ map);
		
	}
	
	
	

}
