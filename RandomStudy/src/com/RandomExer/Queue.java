package com.RandomExer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Queue {
	
	public static void main(String args[]) throws InterruptedException
	{
		LinkedBlockingQueue queue = new LinkedBlockingQueue();
		for( int i=1;i<10 ;i++)
		{
				queue.put(i);
		}
		
		System.out.println(queue);
		
	int x = queue.size();
			
		while (x!=0)
			try{
		{
			System.out.println(queue.take());
			x--;
		}
			}
		
		
		catch (InterruptedException e)
		
		{e.printStackTrace(); System.out.println("After Processing : "+ queue);}
		
		System.out.println("After Processing : "+ queue);
		
	}
	

}
