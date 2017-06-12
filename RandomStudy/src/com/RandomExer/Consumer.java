package com.RandomExer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Consumer extends Thread{

	private BlockingQueue queueData;
	
	public Consumer(LinkedBlockingQueue queueData)
	{
		this.queueData = queueData;
	}
	
	@Override
	public void run()
	{
		int count = queueData.size();
		while (true)
		{
			try {
				
				System.out.println("Consumed by "+Thread.currentThread().getName() +" Values : "+ queueData.take());
				System.out.println("After Consumption: "+ queueData);
				
				
			} 
			
			
			
		
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}

}