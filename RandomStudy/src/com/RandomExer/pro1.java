package com.RandomExer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class pro1 implements Runnable{
	
	BlockingQueue bq = new ArrayBlockingQueue(1024);
	private int data = 0;
	
	public pro1(ArrayBlockingQueue bq)
	{
		this.bq = bq;
	}
	
	

	@Override
	public void run() {
		
				try {
			
					for (int i =0 ; i<10 ; i++)
										
					{
						System.out.println("Produced by Thread : " + Thread.currentThread().getName());
						bq.put(i);
						System.out.println("After production : " + bq);
						Thread.sleep(1000);
					}
					
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// TODO Auto-generated method stub
		
	}
	

}
