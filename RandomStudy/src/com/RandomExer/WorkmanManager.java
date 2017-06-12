package com.RandomExer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkmanManager {

	public static void main(String args[])
	{
		ExecutorService es = Executors.newFixedThreadPool(10);
		
		for (int i = 0; i<10 ;i++)
		{
			Runnable worker = new Workman("Thread Name : " + i);
			es.execute(worker);
		}
		
		
		
	}
	
}
