package com.RandomExer;

import java.util.concurrent.Semaphore;

public class Sema implements Runnable{

	private String name = "sathya";
	private Semaphore sema = new Semaphore(2);
	
	public void getName()
	
	{
		System.out.println("Thread Reading name :" + Thread.currentThread().getName() );
		System.out.println("Name is : "+ name);
		System.out.println("Reading Completed");
	}
	
	public void setName(String name) throws InterruptedException
	{
		System.out.println("Thread Writing :" + Thread.currentThread().getName());
		sema.acquire();
		this.name = name;
		sema.release();
		System.out.println("Writing Completed");
		
	}
	
	public void run() 
	{
		getName();
		try {
			setName("Arya");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
