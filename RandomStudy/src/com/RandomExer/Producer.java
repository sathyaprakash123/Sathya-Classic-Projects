package com.RandomExer;

import java.util.concurrent.LinkedBlockingQueue;

public class Producer extends Thread{

	private  LinkedBlockingQueue queueData;
	
	public Producer(LinkedBlockingQueue queueData)
	{
		
		this.queueData = queueData;
	}
	
	@Override
	public void run()
	{
		for (int i =1;i<10;i++)
		{
			try {
				queueData.put(i);
				
				System.out.println("Produced by "+ Thread.currentThread().getName() +"  Values : "+ queueData);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}
