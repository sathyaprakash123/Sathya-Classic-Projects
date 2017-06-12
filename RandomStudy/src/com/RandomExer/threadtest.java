package com.RandomExer;

public class threadtest extends Thread{

	public void run() {
		
		System.out.println("Thread Started. Thread Name = " + Thread.currentThread());
	}
	
		
	
	public static void main(String args[])
	{
		threadtest t1 = new threadtest();
		t1.setName("sathya");
		t1.start();
		
		
	}

}
