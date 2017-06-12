package com.RandomExer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallerThread {

	public static void main(String args[])
	{
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		for (int i =0 ; i<20; i++)
		{
			
			Runnable worker = new WorkerThread(Integer.toString(i));
			executor.execute(worker);
			System.out.println(i);
			
		}
		executor.shutdown();
	}
	
}


