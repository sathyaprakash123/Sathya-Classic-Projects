package com.RandomExer;

public class Sync {

	public void count() throws InterruptedException
	{
		System.out.println("Count called by "+ Thread.currentThread());
		for (int i =10 ; i>0 ; i--)
		{
			System.out.println(i);
			Thread.sleep(500);
			
		}
	}
	
}
