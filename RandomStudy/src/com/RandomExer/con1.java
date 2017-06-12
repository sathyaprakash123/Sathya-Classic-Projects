package com.RandomExer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class con1  implements Runnable{

	BlockingQueue bq = new ArrayBlockingQueue(1024);
	
	public con1(ArrayBlockingQueue bq)
	{
		this.bq = bq;
	}
			
			
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Length of thread = "+ bq.size());
		
		while (true)
		{
			try {
				bq.take();
				System.out.println("Consumed by Thread : " + Thread.currentThread().getName() + " After Consumption : "+ bq);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
	}
	
	

}
