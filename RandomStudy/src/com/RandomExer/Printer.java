package com.RandomExer;

import java.util.concurrent.Semaphore;

public class Printer extends Thread {

	private static final int process = 1;
	private static Semaphore sema = new Semaphore(process);
	private String job;
	
	public Printer(String job)
	{
	this.job = job;
			
		
	}
	
	public void run()
	{
		try {
		sema.acquire();
			System.out.println("Printer is currently owned by : " + job);
			for(int i=0;i<10;i++){System.out.println(i + "  " + job);Thread.sleep(200);}
			
			
			System.out.println("Released Printer");
	     sema.release();
			
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Single s = Single.createInstance();
		s.print();
		
	}
	
	
	
	
	
}
