package com.RandomExer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Locks {

	public static void main(String args[])
	{
		ExecutorService es = Executors.newFixedThreadPool(5);
		
		for (int i =0 ; i<5 ; i++)
		{
			Runnable r = new Printer("ThreadName"+i);
			es.execute(r);
			
		}
		
	}
	
	
}
