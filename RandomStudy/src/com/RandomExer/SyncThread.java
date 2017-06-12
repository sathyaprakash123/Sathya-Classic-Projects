package com.RandomExer;

public class SyncThread extends Thread{	
		
	Sync PD;
	
	SyncThread(Sync sc)
	{
		PD = sc;
		
	}
	
	
	
	public void run()
	{
		
		try {
			synchronized(PD)
			
			{
				PD.count();
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String args[])
	{
		Sync ss = new Sync();
		
		SyncThread st1 = new SyncThread(ss);
		Thread tt1 = new Thread(st1);
		tt1.start();
		
		
		SyncThread st2 = new SyncThread(ss);
		Thread tt2 = new Thread(st2);
		tt2.start();
			
	}
	
	

}
