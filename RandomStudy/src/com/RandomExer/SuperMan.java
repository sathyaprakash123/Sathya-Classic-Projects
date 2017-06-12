package com.RandomExer;

public class SuperMan extends Thread {

	
	public void run()
	{
		System.out.println("Inside thread:"+ Thread.currentThread());
		
		
	}
	
	public static void main(String args[])
	{
		SuperMan man = new SuperMan();
		Thread t1 = new Thread(man);
		t1.start();
	}
	
}
