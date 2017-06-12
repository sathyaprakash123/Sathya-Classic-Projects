package com.RandomExer;

public class MultiMan {

	public void Counter() throws InterruptedException
	{
		for (int i =1;i<10;i++)
		{
			System.out.println("Value " + i);
			Thread.sleep(100);
		}
	}
	
	
	
}
