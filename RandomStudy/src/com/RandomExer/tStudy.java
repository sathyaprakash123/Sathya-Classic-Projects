package com.RandomExer;

public class tStudy extends Thread {
	
	String message;
	
	public tStudy(String message)
	{
		this.message = message;
	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName() + " " + message);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
