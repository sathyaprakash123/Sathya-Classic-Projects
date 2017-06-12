package com.RandomExer;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class lock extends Thread {
	
	private ArrayList<String> pp = new ArrayList<String>();
	ReentrantLock lock = new ReentrantLock();

	public void run()
	{
		System.out.println("Thread Started : " + Thread.currentThread().getName());
		try {
			write();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		read();
		
		
	}
	
	
	public void write() throws InterruptedException
	{
		System.out.println("Writing Value inside List");
		lock.lock();
		Thread.sleep(5000);
		pp.add("hello");
		lock.unlock();
		
	}
	
	public void read()
	{
		System.out.println("Reading value from List");
		System.out.println(pp);
		
	}
	
	public static void main(String args[])
	{
		
		lock l = new lock();
		Thread t1 = new Thread(l);
		t1.setName("Sathya");
		t1.start();
		
		Thread t2 = new Thread(l);
		t2.setName("Kavita");
		t2.start();
		
	}
	
	
}
