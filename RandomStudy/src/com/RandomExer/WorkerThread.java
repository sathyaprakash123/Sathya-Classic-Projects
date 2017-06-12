package com.RandomExer;

public class WorkerThread extends Thread {

	private String message;
	public WorkerThread(String s)
	
	{
		this.message = s;
	}
	
	public void run()
	{
		System.out.println("Starting Thread. Thread Name : "+ Thread.currentThread().getName());
		process();
		System.out.println("Thread Ended. Thread Name : " + Thread.currentThread().getName());
		
	}
	
	
	public void process()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}


