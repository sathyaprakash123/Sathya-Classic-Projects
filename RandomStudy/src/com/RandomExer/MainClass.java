package com.RandomExer;

import java.util.concurrent.LinkedBlockingQueue;

public class MainClass extends Thread{

	
	
	public static void main(String args[])
	{
		LinkedBlockingQueue queueData = new LinkedBlockingQueue();
		Producer p = new Producer(queueData);
		Consumer c = new Consumer(queueData);	
			    Thread t1 = new Thread(new Producer(queueData));
			    t1.setName("Producer");
	    Thread t2 = new Thread(new Consumer(queueData));
	    t2.setName("Consumer 1 ");
	    
	    
		t1.start();
		t2.start();
		
		System.out.println("All threads executed : " + queueData);
		
		
	}
	
	
	
}
