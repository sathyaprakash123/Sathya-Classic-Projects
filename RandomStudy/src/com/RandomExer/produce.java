package com.RandomExer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class produce implements Runnable{

	BlockingQueue bqq;
	Message message;
		
	public produce(ArrayBlockingQueue queue)
	{
		this.bqq = queue;
		message = new Message("test text mate");
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			bqq.put(message);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	public void putMessage(ArrayBlockingQueue bq) throws InterruptedException
	{
		
		this.bqq = bq;
		bqq.put(message);
				
		
	}
	
	
	
	
}
