package com.RandomExer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class tStudyExecutor {
	
	public static void main(String args[])
	{
		ExecutorService ec = Executors.newFixedThreadPool(10);
		
		for(int i=0;i<10;i++)
		{
		Runnable worker = new tStudy(Integer.toString(i));
		ec.execute(worker);
		}
		
		ec.shutdown();
		
	}
	
	

}
