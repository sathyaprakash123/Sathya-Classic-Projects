package com.RandomExer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

public class Loga {
	
	public static void main(String args[])
	{

	
	ExecutorService ec = Executors.newFixedThreadPool(6);
	Runnable rn = new WorkerThread("Sat");
    ec.execute(rn);
	
	
	for (int i=0;i<7;i++)
	{
		
		
	}
	
	}
	
	
	
}
