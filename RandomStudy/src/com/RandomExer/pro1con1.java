package com.RandomExer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class pro1con1 {

	public static void main(String args[])
	{
	ArrayBlockingQueue bq = new ArrayBlockingQueue(1024);
	ExecutorService service = Executors.newFixedThreadPool(10);
	
	for (int i = 0;i<10;i++)
	{
		Runnable producer = new pro1(bq);
		Runnable consumer = new con1(bq);
		service.execute(producer);
		service.execute(consumer);
		
		
	}
	
	
	
	}
	
}
