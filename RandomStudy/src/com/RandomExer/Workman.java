package com.RandomExer;

public class Workman implements Runnable {
	
	String message;
	
	public Workman(String message)
	{
		
		this.message = message;
		
	}
	

	@Override
	public void run() {
		
		System.out.println("Executing thread : " + Thread.currentThread().getName());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread : "+ Thread.currentThread().getName() + " Completed");
		
		
		// TODO Auto-generated method stub
		
	}

}
