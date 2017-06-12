package com.RandomExer;

public class MultiManThread extends Thread {
	
	public MultiMan m;
	
	public MultiManThread(MultiMan mm)
	{
		m = mm;
	}
	
	

	public void run()
	{
		synchronized(m){
		try {
			
			
		m.Counter();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	public static void main(String args[])
	{
	
		MultiMan mn = new MultiMan();
		MultiManThread mmt1 = new MultiManThread(mn);
		mmt1.start();
		MultiManThread mmt2 = new MultiManThread(mn);
		mmt2.start();
		
				
		
		
	}
		
}
