package com.RandomExer;

public class Hashish extends Thread {
	
	private HashData hd;
	
	 public Hashish(HashData d)
	 {
		 hd = d;
	 }
	
	 
	 public void run()
	 {
		 synchronized(hd)
		 {
		 try {
			hd.writeData("Jennifer Collins");
			hd.writeData("Ambalagambaria");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 hd.displayData();
		 
		 }
		 		 
	 }
	
	public static void main(String args[])
	{
		HashData hs = new HashData();
		System.out.println("Data inside object before Thread being called");
		hs.displayData();
		System.out.println("Calling Thread 1");
		Hashish hs1 = new Hashish(hs);
		hs1.setPriority(Thread.MIN_PRIORITY);
		hs1.start();
		System.out.println("Calling Thread 2");
		Hashish hs2 = new Hashish(hs);
		hs2.setPriority(Thread.MAX_PRIORITY);
		hs2.setName("Sathyarth Prakash");
		hs2.start();
			
	}
	

}
